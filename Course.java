package wodepackage;

public class Course {
//number02为课程编号，coursetitle为课程名称，placeofclass为课程地点，classtime为上课时间，teacher为授课教师
	int number02;
	String coursetitle;
	String placeofclass;
	String classtime;
	String teacher;	
	Course(int a, String b, String c, String d, String e){
		number02 = a;
		coursetitle = b;
		placeofclass = c;
		classtime = d;
		teacher =e;
	}
	public String toString() {
		return "课程编号："+number02+","+" 课程名称："+coursetitle+","+" 上课地点："+placeofclass+","+" 上课时间："+classtime+","+" 授课教师："+teacher;
	}
}