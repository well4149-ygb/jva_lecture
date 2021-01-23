package com.urdomain.ch11.sec03_1;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) { //매개값이 Member인지 확인
			Member member = (Member) obj; //Member 타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후,
			if (id.equals(member.id)) {   //동일하면 true를 반환
				return true;
			}
		}
		return false;//매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 flase를 리턴
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}

}
