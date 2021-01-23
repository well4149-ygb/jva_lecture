package com.urdomain.ch11.sec03_1;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) { //�Ű����� Member���� Ȯ��
			Member member = (Member) obj; //Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id �ʵ尪�� �������� �˻��� ��,
			if (id.equals(member.id)) {   //�����ϸ� true�� ��ȯ
				return true;
			}
		}
		return false;//�Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ� ��� flase�� ����
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}

}
