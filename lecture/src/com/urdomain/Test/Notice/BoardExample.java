package com.urdomain.Test.Notice;

public class BoardExample {
	public static void main(String[] args) {
		General general = new General();
		Board   board   = new Board("�͸�","�ȳ��ϼ���.","asdfs",10);
		Notice  notice  = new Notice("asdfs","�͸�","�ȳ��ϼ���.",1,1);
		
		String category = "�߿�";
		String[] tags   = {"����","�ֿϵ���","������ī"};
		
		general.Board();
		notice.setCategory(category);
		notice.Write();
		System.out.println("------------------");
		board.setTag(tags);
		board.Write();
		board.clickLike();
		board.clickShare();
	}
}
