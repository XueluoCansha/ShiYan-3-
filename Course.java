package wodepackage;

public class Course {
//number02Ϊ�γ̱�ţ�coursetitleΪ�γ����ƣ�placeofclassΪ�γ̵ص㣬classtimeΪ�Ͽ�ʱ�䣬teacherΪ�ڿν�ʦ
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
		return "�γ̱�ţ�"+number02+","+" �γ����ƣ�"+coursetitle+","+" �Ͽεص㣺"+placeofclass+","+" �Ͽ�ʱ�䣺"+classtime+","+" �ڿν�ʦ��"+teacher;
	}
}