# 2pc
《手把手教你写两阶段提交》对应的代码示例。

## 配置数据库链接
```shell
## TM application.properties
server.port=8000

spring.datasource.url=jdbc:mysql://localhost:3306/bank_ccb
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
## 用户名、密码
spring.datasource.username=root
spring.datasource.password=
spring.jpa.generate-ddl=true
spring.jpa.open-in-view=true

## boc application.properties
server.port=8001

spring.datasource.url=jdbc:mysql://localhost:3306/bank_ccb
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
## 用户名、密码
spring.datasource.username=root
spring.datasource.password=
spring.jpa.generate-ddl=true
spring.jpa.open-in-view=true

## ccb application.properties
server.port=8002

spring.datasource.url=jdbc:mysql://localhost:3306/bank_ccb
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
## 用户名、密码
spring.datasource.username=root
spring.datasource.password=
spring.jpa.generate-ddl=true
spring.jpa.open-in-view=true

```

## 打包
```shell
## 需要替换自己的项目路径
cd /Library/WebServer/Documents/java/lianbian-2pc
mvn -Dmaven.test.skip=true package
```

## 启动服务

启动 BOC server
```shell
## 需要替换自己的项目路径
java -Xms256M -Xmx256m -jar /Library/WebServer/Documents/java/lianbian-2pc/boc-server/target/boc-server-1.0-SNAPSHOT.jar
```

启动 CCB server
```shell
## 需要替换自己的项目路径
java -Xms256M -Xmx256m -jar /Library/WebServer/Documents/java/lianbian-2pc/ccb-server/target/ccb-server-1.0-SNAPSHOT.jar
```

启动 Transaction Manager server
```shell
## 需要替换自己的项目路径
java -Xms256M -Xmx256m -jar /Library/WebServer/Documents/java/lianbian-2pc/transaction-manager/target/transaction-manager-1.0-SNAPSHOT.jar
```

## 启动客户端
```shell
java -Xms256M -Xmx256m -jar /Library/WebServer/Documents/java/lianbian-2pc/customer-client/target/customer-client-1.0-SNAPSHOT.jar BOC 1 CCB 2 20000
```