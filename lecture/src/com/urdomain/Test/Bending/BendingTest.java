package com.urdomain.Test.Bending;

public class BendingTest {
	public static void main(String[] args) {
		BendingMachine bm = new BendingMachine();

		bm.init();
		bm.inputMoney();//���� �ִ�����
		bm.showmenu();//�޴��� ������
		bm.purchaseItem();
		bm.output();//����� ���
	}
}
