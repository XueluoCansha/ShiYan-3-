package wodepackage;

public class Teacher extends People{
//course01为所授课程
	String course01;
	Teacher(int number01, String name, String sex, String c01){
		super(number01, name, sex);
		course01 = c01;
	}
	public String toString() {
		return "教师编号："+number01+","+" 教师姓名："+name+","+" 教师性别："+sex+","+" 所授课程："+course01;
	}
}