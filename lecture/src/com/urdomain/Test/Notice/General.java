package com.urdomain.Test.Notice;

public class General {//공지글과 게시글의 공통 부모 클래스
		//필드
		public String id;	    //작성id
		public String title;  	//제목
		public String writer;   //작성자
		public int    postDate; //게시작성일
		public int    views;    //조회수
		public int    number;   //번호
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWriter() {
			return writer;
		}
		public void setWriter(String writer) {
			this.writer = writer;
		}
		public int getPostDate() {
			return postDate;
		}
		public void setPostDate(int postDate) {
			this.postDate = postDate;
		}
		public int getViews() {
			return views;
		}
		public void setViews(int views) {
			this.views = views;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		//메서드
		public void Write() {
			System.out.println("글을 씁니다.");
		}
		public void Update() {
			System.out.println("글을 수정합니다.");
		}
		public void Delete() {
			System.out.println("글을 삭제합니다.");
		}
		public void Select(){
			System.out.println("글을 조회합니다.");
		}
		public void Board() {
			System.out.println("게시글입니다.");
		}
}
