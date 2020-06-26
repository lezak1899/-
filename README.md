### 项目名称：eattingwhat2（吃什么）

项目源码地址：https://gitee.com/likunzhu/eattingwhat2.git

项目在线地址：http://47.106.228.148:8080/customer/toHome

初始用户：

消费者“小a”：18475961111/123456

消费者“小b”：18475962222/123456

消费者“小c”：18475963333/123456



### 1、简介

 基于SSM框架的 网上点餐 系统，整合spring + springmvc  + mybatis + layui。 

使用springBoot启动。包括有消费者模块、商家模块，订单管理模块，评价模块。



### 2、背景

为了更好适应互联时代，为了生活更加便捷，为了让消费者足不出门就可以享受到店家的美食。eattingwhat2旨在拉近消费者和客户的距离，同时给消费者和店家搭建一个便捷的交易平台。



### 3、功能如下

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165111_1191342f_5388780.png "屏幕截图.png")

##### 用户模块详情：

​	①登陆： 通过注册的手机号码登陆si

​	②登陆记住密码：js+cookie实现

​	③注册：注册新用户，用户名重复校验，手机号码重复校验，基本格式验证

​	④修改头像：用户可以自定义个性头像

​	⑤查看个人信息

​	⑥查看订单：可以查看 配送中订单，已送达待评价订单，所有订单

​	⑦评价订单：可以给商店打分，上传食物图片，书写评价内容

​	⑧查看我的所有评价

##### 美食店模块详情：

​	①美食街：游览所有店铺

​	②进店：可以游览当前店铺所有菜品，查看美食店详情，查看美食店评价

​	③店铺查询：带Googlesuggest功能的搜索框（通过店名关键字搜索），目前只有火狐游览器支持该功能

##### 订单模块详情：

​	①提交订单

​	②订单确认送达

​	③查看订单

##### 评价模块详情：

​	①提交评价

​	②查看消费猪评价

​	③查看美食店评价



### 4、系统演示截图：

###### 欢迎页面

![image-20200621105844205](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621105844205.png)

###### 登陆页面

![image-20200621105813197](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621105813197.png)

###### 美食街

![image-20200621105915615](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621105915615.png)





###### 访问受限，访问特定的页面需要先登陆

![image-20200621105943130](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621105943130.png)

###### 个人信息页面

![image-20200621111605378](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621111605378.png)

###### 店铺页面

![image-20200621111626027](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621111626027.png)





店铺详情

![image-20200621111653052](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621111653052.png)

###### 我的订单

![image-20200621111834918](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621111834918.png)

###### 提交评价

![image-20200621112235353](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621112235353.png)

###### 查看我的评价

![image-20200621112943616](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200621112943616.png)

###### 查看店家评价

 ![img](https://images.gitee.com/uploads/images/2020/0626/164900_2c1f2a78_5388780.png)![点击并拖拽以移动](data:image/gif;base64,R0lGODlhAQABAPABAP///wAAACH5BAEKAAAALAAAAAABAAEAAAICRAEAOw==) 

###### 带Googlesuggest功能的搜索框，目前只有火狐游览器支持该功能

![image-20200624232442170](C:\Users\Dpang\AppData\Roaming\Typora\typora-user-images\image-20200624232442170.png)