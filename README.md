


/*
            车型，车长参数接口（补充）
            车型接口：http://daguolian.qdunzi.com/api/Thirdparty/getCarModel
            车长接口：http://daguolian.qdunzi.com/api/Thirdparty/getCarLength
            
            http://daguolian.qdunzi.com/api/thirdparty/thirdPartySource
            
            
            POST请求，以上域名均为测试域名（后期上线会更换）
            货源参数中的车型字段 car_model ，传对应车型参数id，可多选（最多三个），用,隔开（英文逗号）
            货源参数中的车长字段 car_length ，传对应车长参数id，可多选（最多三个），用,隔开（英文逗号）
*/
            car.setCar_model("19");//车长
            car.setCar_length("49");
            
            GIt的使用说明
https://github.com/wscwsc18/upload_car1.git            
            
…or create a new repository on the command line
echo "# upload_car1" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/wscwsc18/upload_car1.git
git push -u origin master            



…or push an existing repository from the command line
git remote add origin https://github.com/wscwsc18/upload_car1.git
git push -u origin master




https://blog.csdn.net/qq_35921773/article/details/86594735   Jenkins+Docker+GitLab+Springboot自动化部署
https://blog.csdn.net/alinyua/article/details/81103570    Jenkins详细实践:SpringBoot+Jenkins+Gitlab+Docker-Maven插件


https://www.cnblogs.com/wysk/p/7517277.html  浅谈我对持续集成的理解
https://zhidao.baidu.com/question/1945684736969925108.html   为什么要持续集成?

集成是指软件个人研发的部分向软件整体部分交付，以便尽早发现个人开发部分的问题；
部署是代码尽快向可运行的开发/测试节交付，以便尽早测试；
交付是指研发尽快向客户交付，以便尽早发现生产环境中存在的问题。

持续部署则是在持续交付的基础上，把部署到生产环境的过程自动化。
我个人觉得持续集成、持续交付、持续部署非常值得推广。开发过程中最怕集成时遇到问题导致返工，而持续集成、持续交付、持续部署恰恰可以早发现早解决，从而可以避免这个问题。

而所谓的持续，就是说每完成一个完整的部分，就向下个环节交付，发现问题可以马上调整。是的问题不会放大到其他部分和后面的环节。





http://www.sohu.com/a/333315225_711529  这些超好用的DevOps工具，你都知道么？
https://blog.csdn.net/binbinqq86/article/details/81033707  Android使用Jenkins持续集成



https://www.jianshu.com/p/a2ec9b8d48de  互联网产品开发的流程


https://blog.csdn.net/xiangnan10/article/details/80332866   java使用 Jenkins自动化部署-----持续交付


https://studygolang.com/articles/20007     docker+jenkins+golang持续集成持续交付（CI/CD）


https://blog.csdn.net/xiangnan10/article/details/80332866   java使用jenkins+golang持续集成持续交付（CI/CD）

https://blog.csdn.net/sinat_14921509/article/details/80123348  持续集成持续交付七大开发工具


https://blog.csdn.net/u010230971/article/details/80335564 使用jenkins pipeline实现golang项目的持续集成




jenkins的3种插件安装方式（解决无法在线安装插件问题）
http://updates.jenkins-ci.org/download/plugins/
2.jenkins各插件的下载地址
地址：http://mirrors.jenkins-ci.org/plugins/


github+jenkins+maven+docker自动化构建部署
https://blog.csdn.net/njzcx/article/details/80979157

docker安装jenkins最新版本
https://www.jianshu.com/p/12c9a9654f83


Jenkins的war包下载
https://blog.csdn.net/qq_39659876/article/details/88594009


https://blog.csdn.net/sunhuansheng/article/details/100719021
Jenkins+docker+微服务+git自动化部署（一）——安装及部署



windows搭建自动构建jenkins+github+mavn
https://blog.csdn.net/dengjili/article/details/90540605




post-step步骤





@echo off
c:
cd C:\tools\apache-tomcat-6.0.48\webapps
if exist "C:\tools\apache-tomcat-6.0.48\webapps\simple-service-webapp.war" del "C:\tools\apache-tomcat-6.0.48\webapps\simple-service-webapp.war"
copy "C:\Users\it\.jenkins\workspace\simple-service-webapp\target\simple-service-webapp.war" "C:\tools\apache-tomcat-6.0.48\webapps\simple-service-webapp.war"
if exist "C:\Users\it\.jenkins\workspace\simple-service-webapp\target\simple-service-webapp\"  rd /s /q "C:\Users\it\.jenkins\workspace\simple-service-webapp\target\simple-service-webapp\"
cd "C:\tools\apache-tomcat-6.0.48\bin\"
start cmd.exe /c startup.bat
1
————————————————
版权声明：本文为CSDN博主「dengjili」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/dengjili/article/details/90540605

版权声明：本文为CSDN博主「dengjili」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/dengjili/article/details/90540605

