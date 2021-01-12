package com.urdomain.Test.Notice;

public class BoardExample {
	public static void main(String[] args) {
		General general = new General();
		Board   board   = new Board("익명","안녕하세요.","asdfs",10);
		Notice  notice  = new Notice("asdfs","익명","안녕하세요.",1,1);
		
		String category = "중요";
		String[] tags   = {"여행","애완동물","스포츠카"};
		
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
