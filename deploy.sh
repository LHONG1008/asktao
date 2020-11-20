#!/bin/bash

jar_name=ums.jar
jar_path=./ums/target/ums.jar

echo "查询进程id-->$jar_name"
PID=`ps -ef | grep "$jar_name" | awk '{print $2}'`
echo "得到进程ID：$PID"
echo "结束进程"
for id in $PID
do
        kill -9 $id
        echo "killed $id"
done
echo "结束进程完成"

nohup java -jar ${jar_path} > /dev/null &
echo "ums.jar server starting...."
