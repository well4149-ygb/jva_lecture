package com.urdomain.Test;

public class MemberJoin {
	//속성:이름,홈페이지 비밀번호, 현장발권 비밀번호,생년월일,성별,이메일주소,이메일 수신여부,전화번호,휴대전화번호,주소
	//    주 이용구간,신용카드정보
	//기능:해당 정보 입력하기, 로그인 하기
	//    
	
	//필드(속성)
	String Text="고객 기본정보";
	String name;
	String homepagePassword;
	String ticketingPassword;
	String birthDay;
	String gender;
	String email;
	boolean emailCheck;//이메일 수신여부
	String homephone;//집전화
	String mobilephone;
	String address;
	String Text2="추가고객정보";
	String sector;//주이용 구간
	String creditcardnumber;
	
	boolean rewrite;
	String cancel;
	String join;
	
	//메서드(기능)
	//1.정보입력하기
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
	//2.로그인하기
	public void login() {
	  	
	}
	
	public static void main(String[] args) {
		MemberJoin mj = new MemberJoin("qwer4149","4149","well4149@naver.com","02-999-8888",
				                       "010-9999-9999","서울시 xxx xxx","서울-부산","1111-1111-1111-1111");
		mj.login();
	}
}
