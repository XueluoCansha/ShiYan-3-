package wodepackage;

import java.util.Scanner;
public class Test {
    public static void main(String args[]){
    	Teacher laoshi01 = new Teacher(0001,"��һ","��","����");
    	Teacher laoshi02 = new Teacher(0002,"Ǯ��","��","����");
    	Teacher laoshi03 = new Teacher(0003,"����","Ů","Ӣ��");
    	
    	Student xuesheng01 = new Student(0101,"����","��","δѡ��","lisi","0101");
    	Student xuesheng02 = new Student(0102,"����","Ů","δѡ��","zhouwu","0102");
    	Student xuesheng03 = new Student(0103,"����","Ů","δѡ��","wuliu","0103");
    	
    	Course kecheng01 = new Course(123001,"����","��305","���� ���� 07:50","��һ");
    	Course kecheng02 = new Course(123002,"����","��202","���� ���� 13:30","Ǯ��");
    	Course kecheng03 = new Course(123003,"Ӣ��","ͼ404","���� ���� 16:05","����");
		
		Scanner sc = new Scanner(System.in);
    	String yonghu;
    	String xuankeshisha = null;
    	int shifouxuanke = 0;
	    while(true) {
			
	    	System.out.println("�������˺ţ��˺�Ϊ����ƴ������");
			String userName = sc.nextLine();

	    	System.out.println("���������루��ʼ����Ϊѧ����ţ���");
	    	String passWord = sc.nextLine();
	    	
	    	if (userName.equals(xuesheng01.account) && passWord.equals(xuesheng01.code)) {
				System.out.println("��ӭ����ѡ��ϵͳ�����ģ�");
				yonghu = "lisi";
				break;
	    	}else if (userName.equals(xuesheng02.account) && passWord.equals(xuesheng02.code)) {
	    		System.out.println("��ӭ����ѡ��ϵͳ�����壡");
	    		yonghu = "zhouwu";
	    		break;
	    	}else if (userName.equals(xuesheng03.account) && passWord.equals(xuesheng03.code)) {
	    		System.out.println("��ӭ����ѡ��ϵͳ��������");
	    		yonghu = "wuliu";
	    		break;
	    	}else {
	    		System.out.println("��¼ʧ�ܣ������ԣ�");
	    	}
	    }
	    
	    if(yonghu.equals("lisi")) {
    		xuankeshisha = xuesheng01.course02;
    	}else if(yonghu.equals("zhouwu")) {
    		xuankeshisha = xuesheng02.course02;
    	}else if(yonghu.equals("wuliu")) {
    		xuankeshisha = xuesheng03.course02;
    	}
	    
	    System.out.println("������Ž�����Ӧѡ�γ���");
	    System.out.println("0���γ��б�");
	    System.out.println("1����ʦ�б�");
	    System.out.println("2��ѡ��");
	    System.out.println("3���˿�");
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
		    	System.out.println("������γ̱��");
		    	int xuanke = sc.nextInt();
		    	if (shifouxuanke == 1) {
		    		System.out.println("����ѡ�Σ������ظ�ѡ��");
		    		break;
		    	}
				if(yonghu == "lisi" && xuanke == 123001) {
		    		xuesheng01.course02 = kecheng01.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "lisi" && xuanke == 123002) {
		    		xuesheng01.course02 = kecheng02.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "lisi" && xuanke == 123003) {
		    		xuesheng01.course02 = kecheng03.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123001) {
		    		xuesheng02.course02 = kecheng01.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123002) {
		    		xuesheng02.course02 = kecheng02.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "zhouwu" && xuanke == 123003) {
		    		xuesheng02.course02 = kecheng03.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123001) {
		    		xuesheng03.course02 = kecheng01.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng01.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123002) {
		    		xuesheng03.course02 = kecheng02.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng02.toString());
					shifouxuanke = 1;
					break;
		    	}else if(yonghu == "wuliu" && xuanke == 123003) {
		    		xuesheng03.course02 = kecheng03.coursetitle;
					System.out.println("ѡ�γɹ�");
					System.out.println("������Ŀα�");
					System.out.println(kecheng03.toString());
					shifouxuanke = 1;
					break;
		    	}else {
		    		System.out.println("��������ȷ�Ŀγ̱��");
		    		System.out.println("������Ž�����Ӧѡ�γ���");
		    	    System.out.println("0���γ��б�");
		    	    System.out.println("1����ʦ�б�");
		    	    System.out.println("2��ѡ��");
		    	    System.out.println("3���˿�");
				    break;
		    	}
		    case 3 :
		    	System.out.println("���������˿�ģʽ");
		    	System.out.println("����1ȷ�ϣ�����2ȡ��");
		    	int tuike = sc.nextInt();
		    	
		    	if(tuike == 1) {
		    		if(yonghu == "lisi") {
		    			xuesheng01.course02 = "δѡ��";
			    		System.out.println("�ѳɹ��˿�");
			    		System.out.println("���Ŀγ�״̬Ϊ��" + xuesheng01.course02);
			    		shifouxuanke = 0;
		    		}else if(yonghu == "zhouwu") {
		    			xuesheng02.course02 = "δѡ��";
			    		System.out.println("�ѳɹ��˿�");
			    		System.out.println("���Ŀγ�״̬Ϊ��" + xuesheng02.course02);
			    		shifouxuanke = 0;
		    	    }else if(yonghu == "wuliu") {
	    			    xuesheng03.course02 = "δѡ��";
			    		System.out.println("�ѳɹ��˿�");
			    		System.out.println("���Ŀγ�״̬Ϊ��" + xuesheng03.course02);
			    		shifouxuanke = 0;
	    	        }
		    	    break;
		    	}else if(tuike == 2) {
		    		System.out.println("���˳��˿�ģʽ");
		    	    break;
		    	}else {
		    		System.out.println("������ 1 or 2");
		    	}
		    	break;
		    default :
		    	System.out.println("�밴��ʾ������ȷ����");
		    }
	    }
    }
}