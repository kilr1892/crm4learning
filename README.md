# 自用crm系统

简易的crm系统, 学习用

# 核心功能

- 门市部每日的订单 记账 收款等记录到数据库
- 生成报表用于汇报

# 项目技术架构(ssm)

也不知道到底适不适合, 先这么选了版本...

- jdk 1.8
- tomcat 8
- mysql 5.5
- maven 3.5.4


- spring/springmvc 4.3.20.RELEASE
- mybatis 3.4.5
- junit 4.12
- servlet/jsp/jstl
- log4j 1.2.12
- slf4j 1.6.6
- pagehelper 3.4.2-fix 这个是传智播客修复版
- druid 1.0.14
- jackson 2.10.0.pr1  github 老是发邮件说有漏洞,于是改成最新的版本 
- httpclient
- joda-time

# 更新

## 2019-08-13

- 在网页端用js计算应收款


## 2019-08-05

- 修改了数据库表名
- 重新生成了mapper
- 修改TbOrder类可clone

## 2019-08-04

- 重构了customer order表
- 美化order.jsp页面
- pom中增加需要的jar包
- log4j中将sql语句输出至客户端
- 增加了orderMapper中增加selectLastOrderNumber方法

## 2019-08-02

- 通过`mybatis`自动生成mapper和xml
- 修复了`applicationContext-dao.xml` 中的扫描包路径
- 测试了数据库的连接
- 增加了数据库文件
- 修改jackson版本改为2.10.0.pr1


## 2019-08-01

1. 搭好了ssm框架
2. 被github警告有安全问题, 于是将`spring`版本号改为`4.3.20.RELEASE`