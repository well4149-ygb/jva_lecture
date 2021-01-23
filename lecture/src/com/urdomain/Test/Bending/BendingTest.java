package com.urdomain.Test.Bending;

public class BendingTest {
	public static void main(String[] args) {
		BendingMachine bm = new BendingMachine();

		bm.init();
		bm.inputMoney();//돈을 넣는행위
		bm.showmenu();//메뉴를 보여줌
		bm.purchaseItem();
		bm.output();//결과물 출력
	}
}
