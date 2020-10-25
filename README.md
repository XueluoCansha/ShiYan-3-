#
Java实验（三）

##
实验目的
```
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
2.掌握面向对象的类设计方法（属性、方法）；
3.掌握类的继承用法，通过构造方法实例化对象；
4.学会使用super()，用于实例化子类；
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
```

##
要求
```
1.说明：
  学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
2.对象：
  人员（人员编号、人员姓名、人员性别）
  教师（人员编号、人员姓名、人员性别、所授课程）
  学生（人员编号、人员姓名、人员性别、所选课程、账号、密码）
  课程（课程编号、课程名称、课程地点、上课时间、授课教师）
3.要求：
  1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
  2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：课程编号、课程名称、上课地点、上课时间、授课教师）；模拟学生退课操作，再打印课程信息。
  3.编写实验报告。
```

##
过程
```
1.根据人员、教师、学生、课程四个对象，建立People、Teacher、Student、Course四个类和一个Test主类。
2.由于教师和学生都是人员，拥有人员的三个属性，所以设定教师和学生是人员的子类。
3.教师拥有所授课程的属性，学生拥有所选课程的属性、还有用来进入选课系统的账号和密码属性。
4.课程中的属性是选课后要打印的课表，所以拥有课程编号、课程名称、课程地点、上课时间、授课教师这五个属性。
5.在People类中定义三个属性。
6.在Teacher类中继承People类中的三个属性，定义自己的所授课程属性，并利用toString()语句返回四个属性的值，会在选课系统的教师列表功能中应用到。
7.在Student类中继承People类中的三个属性，定义自己的所选课程属性，定义账号属性和密码属性，用于进入系统。
8.在Course类中定义五个属性，并利用toString()语句返回四个属性的值，会在选课系统的课程列表功能中应用到。
9.在Test类中定义三个新教师对象、三个新学生对象、三个新课程对象。
10.根据键入的账号和密码，进入对应的学生账号。
11.定义一个中间变量yonghu，用于确定用户是谁。
12.定义一个中间变量xuankeshisha，用于确定选课是啥。
13.定义一个中间变量shifouxuanke，用于确定是否选课。
14.输出选课提示：键入0进入课程列表、键入1进入教师列表、键入2进入选课模式、键入3进入退课模式。
15.详细编写选课模式和退课模式的代码。
```

##
流程图

![result](https://github.com/sTormfroNT-TNT/-/blob/main/Img/liuchengtu.png)

##
核心代码
```
Teacher(int number01, String name, String sex, String c01){
    super(number01, name, sex);
}
Teacher类是People类的子类，声明父类属性的的时候，用super()语句代替构造方法。Student类同理。

public String toString() {
		return "教师编号："+number01+","+" 教师姓名："+name+","+" 教师性别："+sex+","+" 所授课程："+course01;
}
用toString()语句，返回教师信息。Course类同理，返回课表信息。

Scanner sc = new Scanner(System.in);
获取用户的键入。

String userName = sc.nextLine();
将键入赋给一个字符串变量userName。密码同理。

if (userName.equals(xuesheng01.account) && passWord.equals(xuesheng01.code)) {
    System.out.println("欢迎进入选课系统，李四！");
    yonghu = "lisi";
当账号和密码都对的时候，用户是李四。

if(yonghu.equals("lisi")) {
    xuankeshisha = xuesheng01.course02;
}else if(yonghu.equals("zhouwu")) {
    xuankeshisha = xuesheng02.course02;
}else if(yonghu.equals("wuliu")) {
    xuankeshisha = xuesheng03.course02;
}
用户是谁，就把他的课程给中间变量xuankeshisha。

System.out.println("输入序号进入相应选课程序");
System.out.println("0：课程列表");
System.out.println("1：教师列表");
System.out.println("2：选课");
System.out.println("3：退课");
界面设计。

shifouxuanke = 1;
选课后另中间变量shifouxuanke由0变1。

if (shifouxuanke == 1) {
    System.out.println("您已选课，不可重复选课");
中间变量shifouxuanke是1的时候，无法选课。

System.out.println(kecheng01.toString());
toString()用法。

```

##
系统运行截图
![result](https://github.com/sTormfroNT-TNT/-/blob/main/Img/liuchengtu.png)

##
编程感想
