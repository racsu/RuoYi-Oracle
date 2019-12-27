### [阿里云双十二必抢活动 89元(年)服务器 1核2G  错过等一年~ 点我购买](https://www.aliyun.com/minisite/goods?userCode=771memkj) 

### [腾讯云双十二必抢活动 99元(年)服务器 1核2G  错过等一年~ 点我购买](https://cloud.tencent.com/act/cps/redirect?redirect=1040&cps_key=b680c80ccdf523f726c8f97957c3117a&from=console) 

### [阿里云9.5元学生机 （25周岁以下,无论是否在校，都认定为学生） 点我购买](https://promotion.aliyun.com/ntms/act/campus2018.html?source=5176.11533457&userCode=771memkj&type=copy) 

## 若依-Oracle

本仓库为[若依](https://gitee.com/y_project/RuoYi)的oracle版本 `(保持同步更新)` 

如需单应用版本请切换[fast分支](https://gitee.com/racsu/RuoYi-Oracle/tree/fast/) 在此感谢[风立](https://gitee.com/baha)同学

演示地址[RuoYi-Oracle](http://racinfo.cn)

用户名 admin 密码admin123

她可以用于所有的Web应用程序，如网站管理后台，网站会员中心，CMS，CRM，OA。所有前端后台代码封装过后十分精简易上手，出错概率低。

## 若依Oracle版本专属交流群 

&emsp;欢迎进群和各路大佬交流 [![oracle版本交流群](https://img.shields.io/badge/22271299-blue.svg)](https://shang.qq.com/wpa/qunwpa?idkey=e1ea16365440a9fa97ff72b0c73803e49a55dc68ae4c4181f3fb1da74928885e)

&ensp;
<img src="http://img.racinfo.cn/ruoyi-oracle-qun.png" height="350">



 
 


## 内置功能
1.  用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.  部门管理：配置系统组织机构（公司、部门、小组），树结构展现支持数据权限。
3.  岗位管理：配置系统用户所属担任职务。
4.  菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.  角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.  字典管理：对系统中经常使用的一些较为固定的数据进行维护。
7.  参数管理：对系统动态配置常用参数。
8.  通知公告：系统通知公告信息发布维护。
9.  操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
10. 登录日志：系统登录日志记录查询包含登录异常。
11. 在线用户：当前系统中活跃用户状态监控。
12. 定时任务：在线（添加、修改、删除)任务调度包含执行结果日志。
13. 代码生成：前后端代码的生成（java、html、xml、sql）支持CRUD下载 。
14. 系统接口：根据业务代码自动生成相关的api接口文档。
15. 服务监控：监视当前系统CPU、内存、磁盘、堆栈等相关信息。
16. 在线构建器：拖动表单元素生成相应的HTML代码。
17. 连接池监视：监视当前系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。

## 如何使用

#### 1、准备工作
~~~
jdk>=1.8 (推荐1.8)
oracle>=10g (推荐使用11g)
maven>=3.0
开发工具：idea 或者 eclipse
~~~

#### 2、下载代码
下载地址： https://gitee.com/racsu/RuoYi-Oracle

推荐使用git clone下载，有效进行代码更新

#### 3、数据库

使用dba权限的用户连接数据库,创建数据库
```sql
create user ry identified by ry;
grant connect, resource to ry;
```
导入项目sql文件夹里的sql脚本：`ry_yyyymmdd(更新日期).sql` 和 `quartz.sql`

#### 4、配置修改

编辑resources目录下的application-druid.yml，修改数据库连接

```yml
url: 服务器地址
username: 账号
password: 密码
```

编辑resources目录下的application.yml，修改开发环境配置
```yml
port: 端口
context-path: 部署路径
```

#### 5、启动项目
执行文件`RuoYi-Oracle/ruoyi-admin/src/main/java/com/ruoyi/RuoYiApplication.java`的main函数即可。

## 文档
[若依官方文档](http://doc.ruoyi.vip) http://doc.ruoyi.vip

## 演示图

<table>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/25b5e333768d013d45a990c152dbe4d9d6e.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/e29fd81b2d43b517f99535564af41f9d1d5.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/629f1510fb6205f773c8c284863406b694f.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/9124eda87df0e72427cd63f458b813e3363.jpg"/></td>
    </tr>
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/438c59467afd0097cfbe9c89db932661687.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/72a015041db6843aca7f7b273688cb346f8.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/ecb5f1c9929f1933f733f796749b2df73d9.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/e4283d500eb10e8dd8701e7742f7facb065.jpg"/></td>
    </tr>	 
    <tr>
        <td><img src="https://oscimg.oschina.net/oscnet/2531dbf419a1b114e1177f8d2a120b8a9c3.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/8b740a42dddc1e5a8a150d97c5060df258b.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/00e642dc3515919b3760968cc496a12a849.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/f72d28a3e60413a4e1b5c7c2f45f962fd65.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/19222e495869a2a99fc31c5d2bd4539e1e7.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/264d25176f4e22b4b38e95fe6ce73775299.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/d85fbb59be27fb33f68bdbb6e8bc967c97b.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/bb902d2c54bad02a052e9a05e5f22a93df1.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/30cda883bb9a7f74f1454314e64f949942d.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/deebaaa8d6b14a419ed5911f49e3f222a6f.jpg"/></td>
    </tr>
	<tr>
        <td><img src="https://oscimg.oschina.net/oscnet/bed2b98a44e7ae820c2885329e711965c28.jpg"/></td>
        <td><img src="https://oscimg.oschina.net/oscnet/5f3d39a141f21f81b90536f391b8408f1fa.jpg"/></td>
    </tr>
</table>

## 请作者喝杯咖啡
<div>
<img src="http://img.racinfo.cn/007FMAUigy1g68fpr0s1lj30g40g4q58.jpg" width="350" height="350">
<img src="http://img.racinfo.cn/007FMAUigy1g68focark1j30g40g4wfe1.jpg" width="350" height="350">
</div>
