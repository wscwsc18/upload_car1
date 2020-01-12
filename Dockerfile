FROM java:8
# MAINTAINER_INFO
MAINTAINER wscwsc18 575716005@qq.com
ADD /target/upload_car-0.0.1-SNAPSHOT.jar /app.jar
#ADD startapp.sh /
ENV LANG C.UTF-8
EXPOSE 8089
EXPOSE 5005
RUN /bin/bash
RUN mkdir  /usr/wscwsc19
RUN mkdir  /usr/wscwsc20
#RUN yum -y install wget curl
#RUN yum -y install vim
#RUN yum -y install net-tools
#RUN yum -y install openssh-server
#RUN yum -y install wget curl
#   volumes:
#      - /usr/local/jdk1.8.0_45:/usr/local/jdk1.8.0_45   #docker宿主机的java环境被挂载了！
#      每个容器安装JAVA环境,会使容器过大,所以用本地java环境挂在到tomcat容器内,这样节省空间
      #由于tomcat容器进程需要挂载docker宿主机本地的java环境
      #所以在docker宿主机本地安装jdk-8u45-linux-x64.tar.gz
#      tar xf jdk-8u45-linux-x64.tar.gz -C /usr/local

#      - ./webapps:/usr/local/apache-tomcat-8.0.46/webapps    #挂载网页目录

VOLUME /data
ENTRYPOINT  ["java","-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","-Dspring.profiles.active=test","app.jar"]

#ENTRYPOINT ["java","-jar","-Dfile.encoding=utf-8","/app.jar"]
#CMD ["java","-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005","-Dspring.profiles.active=dev","app.jar"]

#Docker 生产环境之配置容器 - 一个容器中运行多个服务
#https://blog.csdn.net/kikajack/article/details/79534623

# docker一个镜像创建多实例启动多个容器分配不同的端口号，达到高可用的目的z
# https://blog.csdn.net/limingcai168/article/details/80986405
#docker run -d -p 8787:8787 ca7f456ae49c java -jar app.jar --spring.profiles.active=test-se

