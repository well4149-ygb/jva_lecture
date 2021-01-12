package com.urdomain.Test.Notice;

public class Board extends General{//게시판
	String[] tag;//태그
	
	public String[] getTag() {
		return tag;
	}
    public void setTag(String[] tag) {
		this.tag = tag;
	}
	//생성자
	public Board(String writer,String title,String id,int views) {
		this.writer = writer;
		this.title  = title;
		this.id     = id;
		this.views  = views;
	}
	//메서드
	public void clickLike() {
		System.out.println("좋아요를 눌렀습니다.");
	}
	public void clickShare() {
		System.out.println("공유하기를 눌렀습니다.");
	}
	@Override
	public void Write() {
		System.out.println("댓글을 작성했습니다.");
		for(String ouput: tag){
			System.out.print(ouput+" ");
		}
		System.out.println();
	}
	@Override
	public void Update() {
		System.out.println("댓글을 수정했습니다.");
	}
	@Override
	public void Delete() {
		System.out.println("댓글을 삭제했습니다.");
	}
}
