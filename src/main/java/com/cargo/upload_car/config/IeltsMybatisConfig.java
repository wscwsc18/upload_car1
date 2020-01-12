package com.cargo.upload_car.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

    /**
     * @author bean.zhang
     */
    @Configuration
    @MapperScan(basePackages = {"com.cargo.upload_car.dao.ielts"}, sqlSessionTemplateRef = "ieltsSqlSessionTemplate")
    public class IeltsMybatisConfig {

        @Value("${ielts.mybatis.mapperLocations}")
        private String ieltsMapper;

        /**
         * dataSource配置
         *prefix值必须是application.properteis中对应属性的前缀
         * @return
         */
        @Bean(name = "ieltsDataSource")
        @ConfigurationProperties(prefix = "ielts.datasource")
        public DataSource ylkDataSource() {
            return DataSourceBuilder.create().build();
        }
        @Bean
        public SqlSessionFactory ieltsSqlSessionFactory(@Qualifier("ieltsDataSource") DataSource dataSource) throws Exception {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dataSource);
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            try {
                //添加XML目录
                bean.setMapperLocations(resolver.getResources(ieltsMapper));
                return bean.getObject();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        @Bean
        public SqlSessionTemplate ieltsSqlSessionTemplate(@Qualifier("ieltsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
            SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
            // 使用上面配置的Factory
            return template;
        }
        @Bean(name = "ieltsJdbcTemplate")
        public JdbcTemplate ieltsJdbcTemplate(@Qualifier("ieltsDataSource") DataSource dataSource){
            return new JdbcTemplate(dataSource);
        }

}
