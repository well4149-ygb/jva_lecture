package com.urdomain.Test.Notice;

public class Notice extends General{//공지글
	//필드
	public String category;//카테고리
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//생성자
	public Notice(String id,String writer,String title,int views,int number ) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.views = views;
		this.number = number;
	}
	//메서드
	@Override
	public void Write() {
		System.out.println("공지글을 게시합니다.");
		System.out.println("["+category+"]"+id+" "+writer+" "+title+" "+views+" "+number);
	}
	@Override
	public void Update() {
		System.out.println("공지글을 수정합니다.");
	}
	@Override
	public void Delete() {
		System.out.println("공지글을 삭제합니다.");
	}
	@Override
	public void Select() {
		System.out.println("공지글을 찾습니다.");
	}
}
