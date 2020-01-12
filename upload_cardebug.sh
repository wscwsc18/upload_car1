#!/bin/bash
#nohup java -Dfile.encoding=utf-8 -jar freight-provider-1.0-SNAPSHOT.jar &


nohup java -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 upload_car-0.0.1-SNAPSHOT.jar &
