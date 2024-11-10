public class webIntroduction {
    public static void main(String[] args) {
//        web网站工作流程
//          浏览器向前端发送请求，前端服务器响应浏览器，浏览器从响应信息找到并访问后端服务器地址
//          后端服务器向数据库发送请求，数据库响应后端服务器，后端服务器将数据库的响应数据返回给浏览器
//        前端Web开发技术栈：HTML、CSS、JavaScript  Vue、Element、Nginx
//        后端Web开发技术栈：Maven SpringBoot-Web MySQL SpringBoot Mybatis

//        初识web前端
//          前端的代码是通过浏览器转化（解析和渲染）成用户看到的网页
//          浏览器中对代码进行解析渲染的部分，称为浏览器内核
//          web标准
//              也称为网页标准，由一系列的标准组成，大部分由w3c（World Wide Web Consortium,万维网联盟）负责制定
//              三个组成部分：
//                  HTML：负责网页的结构（页面元素和内容）
//                  CSS：负责网页的表现（页面元素的外观、位置等页面样式，如颜色大小等）
//                  JavaScript:负责网页的行为（交互效果）

//        HTML
//          HTML(HyperText Markup Language):超文本标记语言
//          超文本：超越了文本的限制，比普通文本更强大。除了文字信息，还可以定义图片、音频、视频等内容。
//          标记语言：由标签构成的语言
//              HTML标签都是预定义好的。例如:使用<a>展示超链接。使用<image>展示图片，<viedo>展示视频.
//              HTML代码直接在浏览器中运行，HTML标签由浏览器解析

//        CSS
//          CSS(Cascading Style Sheet):层叠样式表，用于控制页面的样式（表现）。

//        HTMLDEMO
//          chongundemo
//          特点：HTML的标签中不区分大小写。
//              引用对象双引号单引号都是可以的
//              语法结构较为松散。例如尾标签即使没有，或者尾标签只有部分都不影响页面展示。
//          图片标签<img>
//              src（绝对路径/相对路径）、width（像素/相对于原图片的百分比）、height（像素/相对于原图片的百分比）
//          标题标签：<h1>-<h6>,大小从1-6递减
//          水平线标签：<hr>

//        CSS引入方式
//          行内样式：写在标签的style属性中（不推荐）
//          内嵌样式：写在style标签中（可以写在页面任何位置，但通常约定写在head标签中）
//          外联样式：写在一个单独的.css文件中（需要通过link标签在网页中引入）

//        页面布局
//          盒子：页面中所有的元素（标签），都可以看作是一个盒子，由盒子将页面中的元素包含在一个矩形区域内，通过盒子的视角更方便的进行页面布局
//          盒子模型组成：内容区域（content）、内边距区域（padding）、边框区域（border）、外边距区域(margin)
//          布局标签：实际开发网页中，会大量频繁的使用div和span这两个没有语义的布局标签
//              div：一行只显示一个（独占一行）  宽度默认是父元素的宽度，高度默认由内容撑开 可以设置宽高
//              span:一行可以显示多个   宽度和高度默认由内容撑开    不能设置宽高

//        表格标签
//          场景：在网页中以表格（行列）形式整齐展示数据，如班级表。
//          标签：<table>定义表格整体，可以包裹多个<tr> 属性：border表格边框宽度 width表格宽度 cellspacing单元之间的空间
//                <tr>表格的行，可以包裹多个<td>
//                <td>单元格（普通，可以包裹内容） 如果是表头单元格，可以替换为<th>

//        表单标签
//          场景：在网页中主要负责数据采集功能，如注册、登录等功能
//          标签：<form>
//          表单项：不同类型的input元素、下拉列表、文本域等
//              <input>：定义表单项
//              <select>：定义下拉列表,option定义列表项
//              <textarea>：定义文本域
//          属性：
//              action：规定当提交表单时向何处发送表单数据，url。默认提交到当前页面
//              method：规定用于发送表单数据的方式。GET、POST
//                  get：是method的默认值，在url后面拼接表单数据，但是url的长度是有限制的。
//                  post:在消息体(请求体)中传递的,参数大小无限制的
//          注意:表单项必须有name属性才可以提交

//        JavaScript(简称JS)是一门跨平台 面向对象的脚本语言.是用来控制网页行为的,使得网页可以交互
//          JS和Java是完全不同的语言,无论概念还是设计,但是基础语法类似.
//          JS在1995年由Brebdan Eich发明,并于1997年成为ECMA标准
//          ECMScript6(ES6)是最新的JS版本(发布于2015年)

//        JavaScript引入方式
//          内部脚本:将JS代码定义在HTML页面中
//              JavaScript代码必须位于<script></script>标签之间
//              在HTML文档中,可以在任意地方,放置任意数量的<script>
//              一般会把脚本置于<body>元素的底部,可改善显示速度
//          外部脚本:将JS代码定义在外部JS文件中,然后引入到HTML页面中
//              外部JS文件中,只包含JS代码,不包含<script>标签
//              <script>标签不能自闭合

//        JS基础语法
//          书写语法
//              区分大小写:与java一样,变量名 函数名以及其他一切东西都是区分大小写的
//              每行结尾的分号可有可无
//              注释：
//                  单行注释://注释内容
//                  多行注释:/*注释内容*/
//              大括号表示代码块
//              输出语句
//                  使用window.alert()写入警告框
//                  使用document.write()写入HTML输出
//                  使用console.log()写入浏览器控制台
//          变量
//              JS中用var关键字来声明变量
//                  var作用域较大,是全局变量
//                  var可以重复定义
//                  ECMAScript6新增let关键字定义变量,用法类似var,但是所声明的变量只在let关键字所在的代码块中有效,且不允许重复声明
//                  ECMAScript6新增const关键字,用来声明一个只读的常量,一旦声明,常量的值就不能改变
//              JS是一门弱类型语言,变量可以存放不同类型的值
//              变量名需要遵循如下规则:
//                  组成字符可以是任何字母 数字 下划线_或美元符号$
//                  数字不能开头
//                  建议使用驼峰命名
//          数据类型\运算符\流程控制语句
//              数据类型
//                  JS中分为原始类型和引用类型
//                      原始类型:number(包括整数 小数 NaN) string boolean null undefined(声明的变量未初始化时的默认值)
//                              使用typeof运算符可以获取数据类型
//              运算符
//                  算数运算符:+ - * / % ++ --
//                  赋值运算符:= += -= *= /= %=
//                  比较运算符:> < >= <= != == ===(双等会进行类型转换,三等不会类型转换)
//                  逻辑运算符:&& || !
//                  三元运算符:条件表达式?true_value:false_value
//                  类型转换:
//                      字符串转为数字:字符串字面值转为数字,如果不是数字转为NaN
//                      其他类型转为boolean:
//                          Number:0和NaN转为false,其他转为true
//                          String:空字符串为false,其他为true
//                          Null和undefined:均为false
//              流程控制
//                  if  else if  else       switch      for     while       do while
//          函数
//              函数（方法）是被设计为执行特定任务的代码块。
//              定义：JS函数通过function关键字定义，语法为：
//                      function functionName(参数1，参数2.。。){要执行的代码}
//                      var functionName=function(参数1，参数2.。。){要执行的代码}
//              注意：形参不需要类型，因为JS是弱类型语言。返回值也不需要定义类型，可以在函数内部直接使用return返回即可.
//              调用：函数名称（实参）.JS中，函数调用可以传递任意个数的参数
//          JS对象
//              Array
//                  定义：var 变量名=new Array(元素列表)；      var 变量名=[元素列表]；
//                  访问：arr[索引]=值；
//                  JS中数组相当于Java中集合，长度可变，js是弱类型，所以可以存储任意类型的数据
//                  属性：length,设置或返回数组中元素的数量
//                  方法：forEach()遍历数组中每个有值的元素，并调用一次传入的函数 \\JS中lambda表达式的符号为=>  var xxx=(形参)=>{方法内容}
//                      push()将新元素添加到数组结尾，返回新长度 push(1,2,3)添加1，2，3
//                      splice()从数组中删除元素 splice(2,2)删除序号从2开始的2个元素
//              String
//                  创建：var 变量名=new String("...")      var 变量名="..."
//                  属性：length 字符串的长度
//                  方法：charAt()  返回在指定位置的字符
//                      indexOf()  检索字符串中的指定内容 var str="hello" str.indexOf(lo)返回值为3 不存在则返回-1
//                      trim() 去除字符串两边的空格 var str=" hello " var s=str.trim()返回值为"hello"
//                      substring() 提取字符串中两个指定的索引号之间的字符 var str="hello" str.substring(0,2) 返回值为"he" 包含开头不包含结尾
//              JSON对象
//                  自定义对象
//                   定义格式：var 对象名 ={
//                                  属性名1：属性值1，
//                                属性名2：属性值2，
//                                属性名3：属性值3，
//                                函数名称：function(形参){方法内容}      函数名（形参）：{方法}
//                            }
//                    调用格式：对象名.属性名；     对象名.函数名（）；
//                  JSON：JavaScriptObjectNotation,JS对象标记法
//                      JSON是通过JS对象标记法书写的文本
//                      由于语法简单，层次结构鲜明，现多用于作为数据载体，在网络中进行传输
//                          "name":"tom",
//                          "age":20
//                      }
//                      基础语法：var 变量名='{"key1":value1,"key2":"value2}';  JSON只是字符串
//                      JSON字符串转为JS对象： var jsObject = JSON.parse(JSONObject)
//                      JS对象转为JSON字符串： var JSONObject = JSON.stringify(jsObject)
//                BOM
//                  Browser Object Model 浏览器对象模型，允许JS与浏览器对话，JS将浏览器的各个组成部分封装为对象。
//                  组成：
//                      Window:浏览器窗口对象
//                          获取：window.alert("Hello Window");  alert("Hello Window");
//                          属性
//                              history 对History对象的只读引用（历史记录）
//                              location 用于窗口或框架的Location对象（地址栏）
//                              navigator 对Navigator对象的只读引用（浏览器）
//                          方法
//                              alert() 显示带有一段消息和一个确认按钮的警告框
//                              confirm() 显示带有一段消息以及确认按钮和取消按钮的对话框 confirm("确认删除？")返回true\false
//                              setinterval() 按照指定的周期（以毫秒计）来调用函数或计算表达式    setinterval(function(){},2000)每2000毫秒执行一次function 
//                              setTimeout() 在指定的的毫秒数后调用函数或计算表达式
//                      Navigator:浏览器对象
//                      Screen:屏幕对象
//                      History:历史记录对象
//                      Location:地址栏对象
//                          获取：window.location.属性；    location.属性；
//                          属性：href：设置或返回完整的URL  location.href = "https://www.google.com";
//                DOM
//                  概念：Document Object Model，文档对象模型。
//                  JS通过DOM，能够对HTML进行操作：
//                      改变HTML元素的样式（CSS）
//                      对HTML DOM事件作出反应
//                      添加和删除HTML元素
//                  DOM是W3C的标准，定义了访问HTML和XML文档的标准，分为3个不同的部分：
//                      1.Core DOM-所有文档类型的标准模板
//                          Document:整个文档对象
//                          Element:元素对象
//                          Attribute:属性对象
//                          Text:文本对象
//                          Comment:注释对象
//                      2.XML DOM-XML文档的标准模型
//                      3.HTML DOM-HTML文档的标准模型
//                          Image:<img>
//                          Button:<input type='button'>
//                  HTML中的Element对象可以通过Document对象获取，而Document对象是通过window对象获取的。
//                  Document对象中提供了以下获取Element元素对象的函数：
//                      1.根据id属性值获取，返回单个Element对象 var h1 = document.getElementById('h1');
//                      1.根据标签名称获取，返回Element对象数组 var divs = document.getElementsByTagName('div');
//                      1.根据name属性值获取，返回Element对象数组 var hobbys = document.getElementsByName('hobby');
//                      1.根据class属性值获取，返回Element对象数组 var class = document.getElementsByClassName('cls');
//          JS事件监听
//              事件：HTML事件是发生在HTML元素上的“事情”。例如：按钮被点击、鼠标移动到元素上、按下键盘按键
//              事件监听：JS可以在事件被侦测到时执行代码
//              事件绑定：方式一：通过HTML标签中的事件属性进行绑定
//                       方式二：通过HTML标签中的事件属性进行绑定
    }

            }
