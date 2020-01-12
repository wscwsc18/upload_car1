#!/bin/bash
#nohup java -Dfile.encoding=utf-8 -jar freight-provider-1.0-SNAPSHOT.jar &


nohup java -Djava.rmi.server.hostname=192.168.9.149 -Dcom.sun.management.jmxremote  -Dcom.sun.management.jmxremote.port=8061  -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar  upload_car-0.0.1-SNAPSHOT.jar
