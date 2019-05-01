#!/bin/sh
mvn clean package && docker build -t com.airhacks/kata-7 .
docker rm -f kata-7 || true && docker run -d -p 8080:8080 -p 4848:4848 --name kata-7 com.airhacks/kata-7 
