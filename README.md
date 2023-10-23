### 项目名称：luckymall

项目源码地址：https://gitee.com/likunzhu/luckymall.git

本地启动地址：http://localhost:8080/customer/toHome

初始用户：

消费者“小a”：18475961111/123456

消费者“小b”：18475962222/123456

消费者“小c”：18475963333/123456

### 1、简介

基于SSM框架的 网上点餐 系统，整合spring + springmvc + mybatis + layui。

使用springBoot启动。包括有消费者模块、商家模块，订单管理模块，评价模块。

### 2、背景

为了更好适应互联时代，为了生活更加便捷，为了让消费者足不出门就可以享受到店家的美食。luckymall旨在拉近消费者和客户的距离，同时给消费者和店家搭建一个便捷的交易平台。

### 3、功能如下

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165305_80d02cce_5388780.png "屏幕截图.png")

##### 用户模块详情：

​ ①登陆： 通过注册的手机号码登陆si

​ ②登陆记住密码：js+cookie实现

​ ③注册：注册新用户，用户名重复校验，手机号码重复校验，基本格式验证

​ ④修改头像：用户可以自定义个性头像

​ ⑤查看个人信息

​ ⑥查看订单：可以查看 配送中订单，已送达待评价订单，所有订单

​ ⑦评价订单：可以给商店打分，上传食物图片，书写评价内容

​ ⑧查看我的所有评价

##### 美食店模块详情：

​ ①美食街：游览所有店铺

​ ②进店：可以游览当前店铺所有菜品，查看美食店详情，查看美食店评价

​ ③店铺查询：带Googlesuggest功能的搜索框（通过店名关键字搜索），目前只有火狐游览器支持该功能

##### 订单模块详情：

​ ①提交订单

​ ②订单确认送达

​ ③查看订单

##### 评价模块详情：

​ ①提交评价

​ ②查看消费猪评价

​ ③查看美食店评价

### 4、系统演示截图：

###### 欢迎页面

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165352_5bb3e280_5388780.png "屏幕截图.png")

###### 登陆页面

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165410_a76ae9b4_5388780.png "屏幕截图.png")

###### 美食街

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165718_aa622268_5388780.png "屏幕截图.png")

###### 访问受限，访问特定的页面需要先登陆

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165737_f9857dab_5388780.png "屏幕截图.png")

###### 个人信息页面

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165759_ccdd144e_5388780.png "屏幕截图.png")

###### 店铺页面

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165833_b4ff351c_5388780.png "屏幕截图.png")

店铺详情

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165858_e3dc69dc_5388780.png "屏幕截图.png")

###### 我的订单

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/170029_78e34600_5388780.png "屏幕截图.png")

###### 提交评价

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165952_cf51b398_5388780.png "屏幕截图.png")

###### 查看我的评价

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/165921_c867f65d_5388780.png "屏幕截图.png")

###### 查看店家评价

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/170643_7ff3a504_5388780.png "屏幕截图.png")

###### 带Googlesuggest功能的搜索框，目前只有火狐游览器支持该功能

![输入图片说明](https://images.gitee.com/uploads/images/2020/0626/170425_809fd7c1_5388780.png "屏幕截图.png")