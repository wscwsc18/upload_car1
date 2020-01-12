package com.cargo.upload_car.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.mapper.autoconfigure.SpringBootVFS;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;

/**
 * 主数据源
 * 注意，要支持tk-mybatis扩展中间件，需要用tk.mybatis.spring.annotation.MapperScan注解
 * jdbcUrl is required with driverClassName错误解决
 * https://blog.csdn.net/newbie_907486852/article/details/81391525
 *
 * springboot 通用mapper双数据源配置  https://blog.csdn.net/qq_32719003/article/details/88717778
 *
 *tk-mybatis与springBoot整合使用两个数据源  https://blog.csdn.net/Dark_Zhou/article/details/83824812
 *
 * SpringBoot+TkMybatis+Druid单数据源与多数据源配置
 * https://blog.csdn.net/superychen/article/details/89372540
 */

@Configuration
@MapperScan(basePackages = {"com.cargo.upload_car.dao.toefl"}, sqlSessionTemplateRef = "userSqlSessionTemplate")

public class ToeflMybatisConfig {
    @Value("${toefl.mybatis.mapperLocations}")
    private String mainMapper;

    @Bean(name = "userDataSource")
    @Primary //必须加此注解，不然报错，下一个类则不需要添加
    @ConfigurationProperties(prefix = "toefl.datasource") //prefix值必须是application.properteis中对应属性的前缀
    public DataSource userDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 配置事务管理器
     *
     * @param dataSource
     * @return
     */
    @Bean(name = "masterTransactionManger")
    @Primary
    public DataSourceTransactionManager masterTransactionManger(@Qualifier("userDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    @Primary
    public SqlSessionFactory userSqlSessionFactory(@Qualifier("userDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setVfs(SpringBootVFS.class);
        bean.setTypeAliasesPackage("com.cargo.upload_car.entity");
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources(mainMapper));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    @Primary
    public SqlSessionTemplate userSqlSessionTemplate(@Qualifier("userSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
        // 使用上面配置的Factory
        return template;
    }

    @Bean(name = "mainJdbcTemplate")
    public JdbcTemplate mainJdbcTemplate(@Qualifier("userDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}