package wodepackage;

public class Student extends People{
//course02Ϊ��ѡ�γ̣�accountΪ�˺ţ�codeΪ����
	String course02;
	String account;
	String code;
	Student(int number01, String name, String sex, String c02, String zhanghao, String mima){
		super(number01, name, sex);
		course02 = c02;
		account = zhanghao;
		code = mima;
	}
}