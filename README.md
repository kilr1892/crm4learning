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



# 更新

## 2019-8-2

- 通过`mybatis`自动生成mapper和xml
- 修复了`applicationContext-dao.xml` 中的扫描包路径
- 测试了数据库的连接
- 增加了数据库文件
- jackson版本改为2.10.0.pr1


## 2019-8-1

1. 搭好了ssm框架
2. 被github警告有安全问题, 于是将`spring`版本号改为`4.3.20.RELEASE`