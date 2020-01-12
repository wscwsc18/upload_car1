package com.cargo.upload_car;

import com.cargo.upload_car.entity.Demo;
import com.cargo.upload_car.entity.Hand;
import com.cargo.upload_car.service.DemoService;
import com.cargo.upload_car.service.HandService;
import com.cargo.upload_car.service.IMP.FindIDImpl;
import com.cargo.upload_car.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

/**
 * UploadCarApplication
 *
 * @blame Android Team
 */

//@EnableTransactionManagement
@EnableSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan(basePackages="com.cargo.upload_car.mapper",sqlSessionFactoryRef = "localSqlSessionFactory")
//@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.cargo.upload_car.mapper2",sqlSessionFactoryRef = "publicSqlSessionFactory")

public class UploadCarApplication implements CommandLineRunner {

    @Autowired
    public DemoService demoService;
    @Autowired
    public HandService handService;


    @Autowired
    public FindIDImpl findIDImpl ;



    //System.setProperty("spring.devtools.restart.enabled","false");

    public static void main(String[] args) {
        SpringApplication.run(UploadCarApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Hand hand = new Hand();
        hand = handService.getHandById(1435);

       System.out.println("hand 握手" + hand);



        Demo demo = new Demo();
        demo.setId(6561766);
        demo.setName("信息1 ");
        //demo.setBirth("29-10-01 11:22:22");
        demo.setBirth(DateUtil.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss"));
        demo.setSurplus("ssss");
        demo.setSxxx("测试sssdxxxxs");

        demo.setUuuxxx("sssdxxxxs");
        demoService.addDemo(demo);



        System.out.println("\uD83D\uDE42\uD83D\uDE08\uD83D\uDC6D信息处理已经开始..." );
        //demoService.XxzxxxxupdateDemo("dddddddd");
        ///List<DemoService> countries = DemoService.selectAll();
        ///for (DemoService country : countries) {
//            System.out.println("Country Name: " + country.());
  //      }

    }


}


//sasdASDSDSDDSADSA   xdxddx🙂cvdc😈👭实嫂嫂地方 的 sd分现💏多次
//aacdcccccccccccc发个
//dffdf※●★☆◎◇□◆№ §▲→〓↑＃＠fdf湖广会馆
//dcdd∑≤≥≤≥≤≥∑≌№★●◎

//慢慢已经改动啦