package com.urdomain.Test;

public class TrainTicketing {
	// �ʵ�
	String oneWay;// ��
	String roundtrip;// �պ�
	String departure;// ���
	String arrive;// ����
	int year;
	int month;
	int day;
	int time;
	String age;// ����
	String seat;// �¼�
	String option;// �ɼ�
	String purchaseregister;// ���ŵ��
	String trainsearch;// ���� ��ȸ

	// �޼���

	// ����� ����
	public int changeDepartday(int year, int month, int day, int time) {
		// ����� ����
		return changeDepartday(0, 0, 0, 0);
	}

	// �¼� �� ���� ����
	public String changeSeatandAge(String age, String seat) {
		return changeSeatandAge("24", "1");
	}

	// ���,������ ����
	public String editDay(String departure, String arrive) {
		return editDay("����", "�뱸");
	}

	// �����ŵ��
	public void register() {
		// ���
	}

	// ������ȸ
	public void trainsearch() {
		// ��ȸ
	}

	public static void main(String[] args) {
		TrainTicketing tt = new TrainTicketing();

		tt.changeDepartday(2020, 12, 31, 14);
		tt.changeSeatandAge("30", "1");
		tt.register();// �����ŵ��
		tt.trainsearch();// ������ȸ
	}
}
