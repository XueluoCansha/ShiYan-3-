package wodepackage;

public class Teacher extends People{
//course01Ϊ���ڿγ�
	String course01;
	Teacher(int number01, String name, String sex, String c01){
		super(number01, name, sex);
		course01 = c01;
	}
	public String toString() {
		return "��ʦ��ţ�"+number01+","+" ��ʦ������"+name+","+" ��ʦ�Ա�"+sex+","+" ���ڿγ̣�"+course01;
	}
}