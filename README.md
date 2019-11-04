# webservice调用服务端方式
## 生成客户端代理方式，使用spring配置文件 
TestClientSpring.java
## 硬编码生成代理类
TestClientCode.java
## 要点
1. 面向接口
2. 形参需要协作确认
3. 使用cxf生成wsdl客户端代码命令：wsdl2java -p 生成的类所在的包名 -d 包所在路径 -encoding utf-8 -client WSDL的URL