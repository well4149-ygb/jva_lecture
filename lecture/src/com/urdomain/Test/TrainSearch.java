package com.urdomain.Test;

public class TrainSearch {
 //   �ʵ�3-1.���� ��ȸ ���
//	     �Ӽ�:��������,
//           ���,
//           ����,
//           �¼�����  
//           ����
//	         ��¥(����,��,��)
//���->�������� ��� , �¼����� ����
//        �Ϲݽ� Ư�� ���� ���
    
	//�ʵ�
	static String[]train= {"����ȭȣ","KTX","������ȣ","itx-û��"};//��������
	static String[]seat= {"�Ϲݼ�","���Ƶ���","��ü�","2����","������","���ǵ����"};//�¼�����
	String  depart;//���
	String  arrive;//����
	int     year;//����
	int     month;//��
	int     day;//��
	
	
	//�޼���(���)
	public int editDays(int year, int month, int day) {//��¥�������
		return editDays(2021,1,1);
	}
	
	public String trainselect(String[]train) {//���� ���ñ��
		return trainselect(train);
	}
	
	public String seatselect(String[]seat) {//���� �¼�����
		return seatselect(seat);
	}
	
	public void purchaseSeat() {
	  //����	
	}//�¼����ű��
	
	public static void main(String[] args) {
		TrainSearch ts = new TrainSearch();
		ts.editDays(2021, 1, 1);
		ts.seatselect(seat);
		ts.trainselect(train);
		ts.purchaseSeat();
	}
}
