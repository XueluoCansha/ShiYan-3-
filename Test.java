package wodepackage;

import java.util.Scanner;
public class Test {
    public static void main(String args[]){
    	Teacher laoshi01 = new Teacher(0001,"赵一","男","大物");
    	Teacher laoshi02 = new Teacher(0002,"钱二","男","高数");
    	Teacher laoshi03 = new Teacher(0003,"孙三","女","英语");
    	
    	Student xuesheng01 = new Student(0101,"李四","男","未选课","lisi","0101");
    	Student xuesheng02 = new Student(0102,"周五","女","未选课","zhouwu","0102");
    	Student xuesheng03 = new Student(0103,"吴六","女","未选课","wuliu","0103");
    	
    	Course kecheng01 = new Course(123001,"大物","教305","周四 上午 07:50","赵一");
    	Course kecheng02 = new Course(123002,"高数","教202","周三 下午 13:30","钱二");
    	Course kecheng03 = new Course(123003,"英语","图404","周四 下午 16:05","孙三");
		
		Scanner sc = new Scanner(System.in);
    	String yonghu;
    	String xuankeshisha = null;
    	int shifouxuanke = 0;
	    while(true) {
			
	    	System.out.println("请输入账号（账号为姓名拼音）：");
			String userName = sc.nextLine();

	    	System.out.println("请输入密码（初始密码为学生编号）：");
	    	String passWord = sc.nextLine();
	    	
	    	if (userName.equals(xuesheng01.account) && passWord.equals(xuesheng01.code)) {
				System.out.println("欢迎进入选课系统，李四！");
				yonghu = "lisi";
				break;
	    	}else if (userName.equals(xuesheng02.account) && passWord.equals(xuesheng02.code)) {
	    		System.out.println("欢迎进入选课系统，周五！");
	    		yonghu = "zhouwu";
	    		break;
	    	}else if (userName.equals(xuesheng03.account) && passWord.equals(xuesheng03.code)) {
	    		System.out.println("欢迎进入选课系统，吴六！");
	    		yonghu = "wuliu";
	    		break;
	    	}else {
	    		System.out.println("登录失败！请重试！");
	    	}
	    }
	    
	    if(yonghu.equals("lisi")) {
    		xuankeshisha = xuesheng01.course02;
    	}else if(yonghu.equals("zhouwu")) {
    		xuankeshisha = xuesheng02.course02;
    	}else if(yonghu.equals("wuliu")) {
    		xuankeshisha = xuesheng03.course02;
    	}
	    
	    System.out.println("输入序号进入相应选课程序");
	    System.out.println("0：课程列表");
	    System.out.println("1：教师列表");
	    System.out.println("2：选课");
	    System.out.println("3：退课");
	    while(true) {
		    
	    	int xuanze = sc.nextInt();
	    	switch(xuanze) {
		    
		    case 0 :
			    System.out.println(kecheng01.toString());
			    System.out.println(kecheng02.toString());
			    System.out.println(kecheng03.toString());
		        break;
		    case 1 :
			    System.out.println(laoshi01.toString());
			    System.out.println(laoshi02.toString());
			    System.out.println(laoshi03.toString());
			    break;
		    case 2 :
		    	System.out.println("请输入课程编号");
		    	int xuanke = sc.nextInt();
		    	if (shifouxuanke == 1) {
		    		System.out.println("您已选课，不可重复选课");
		    		break;
		    	}
				if(yonghu == "lisi" && xuanke == 123001) {
		    		xuesheng01.course02 = kecheng01.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "lisi" && xuanke == 123002) {
		    		xuesheng01.course02 = kecheng02.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "lisi" && xuanke == 123003) {
		    		xuesheng01.course02 = kecheng03.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123001) {
		    		xuesheng02.course02 = kecheng01.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123002) {
		    		xuesheng02.course02 = kecheng02.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123003) {
		    		xuesheng02.course02 = kecheng03.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123001) {
		    		xuesheng03.course02 = kecheng01.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123002) {
		    		xuesheng03.course02 = kecheng02.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123003) {
		    		xuesheng03.course02 = kecheng03.coursetitle;
					System.out.println("选课成功");
					System.out.println("这是你的课表");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else {
		    		System.out.println("请输入正确的课程编号");
		    		System.out.println("输入序号进入相应选课程序");
		    	    System.out.println("0：课程列表");
		    	    System.out.println("1：教师列表");
		    	    System.out.println("2：选课");
		    	    System.out.println("3：退课");
				    break;
		    	}
		    case 3 :
		    	System.out.println("您进入了退课模式");
		    	System.out.println("输入1确认，输入2取消");
		    	int tuike = sc.nextInt();
		    	
		    	if(tuike == 1) {
		    		if(yonghu == "lisi") {
		    			xuesheng01.course02 = "未选课";
			    		System.out.println("已成功退课");
			    		System.out.println("您的课程状态为：" + xuesheng01.course02);
			    		shifouxuanke = 0;
		    		}else if(yonghu == "zhouwu") {
		    			xuesheng02.course02 = "未选课";
			    		System.out.println("已成功退课");
			    		System.out.println("您的课程状态为：" + xuesheng02.course02);
			    		shifouxuanke = 0;
		    	    }else if(yonghu == "wuliu") {
	    			    xuesheng03.course02 = "未选课";
			    		System.out.println("已成功退课");
			    		System.out.println("您的课程状态为：" + xuesheng03.course02);
			    		shifouxuanke = 0;
	    	        }
		    	    break;
		    	}else if(tuike == 2) {
		    		System.out.println("已退出退课模式");
		    	    break;
		    	}else {
		    		System.out.println("请输入 1 or 2");
		    	}
		    	break;
		    default :
		    	System.out.println("请按提示键入正确按键");
		    }
	    }
    }
}