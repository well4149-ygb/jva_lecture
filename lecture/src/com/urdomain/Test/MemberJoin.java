package com.urdomain.Test;

public class MemberJoin {
	//�Ӽ�:�̸�,Ȩ������ ��й�ȣ, ����߱� ��й�ȣ,�������,����,�̸����ּ�,�̸��� ���ſ���,��ȭ��ȣ,�޴���ȭ��ȣ,�ּ�
	//    �� �̿뱸��,�ſ�ī������
	//���:�ش� ���� �Է��ϱ�, �α��� �ϱ�
	//    
	
	//�ʵ�(�Ӽ�)
	String Text="�� �⺻����";
	String name;
	String homepagePassword;
	String ticketingPassword;
	String birthDay;
	String gender;
	String email;
	boolean emailCheck;//�̸��� ���ſ���
	String homephone;//����ȭ
	String mobilephone;
	String address;
	String Text2="�߰�������";
	String sector;//���̿� ����
	String creditcardnumber;
	
	boolean rewrite;
	String cancel;
	String join;
	
	//�޼���(���)
	//1.�����Է��ϱ�
	public MemberJoin(String homepagePassword,String ticketPassword,String email,String homephone,
			          String mobilephone,String address,String sector,String cerditcardnumber) {
		this.homepagePassword ="";
		this.ticketingPassword = "";
		this.email = "";
		this.homephone ="";
		this.mobilephone="";
		this.address="";
		this.sector="";
		this.creditcardnumber="";
	}
	//2.�α����ϱ�
	public void login() {
	  	
	}
	
	public static void main(String[] args) {
		MemberJoin mj = new MemberJoin("qwer4149","4149","well4149@naver.com","02-999-8888",
				                       "010-9999-9999","����� xxx xxx","����-�λ�","1111-1111-1111-1111");
		mj.login();
	}
}
