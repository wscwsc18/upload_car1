


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




