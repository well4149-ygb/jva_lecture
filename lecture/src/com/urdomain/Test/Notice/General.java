package com.urdomain.Test.Notice;

public class General {//�����۰� �Խñ��� ���� �θ� Ŭ����
		//�ʵ�
		public String id;	    //�ۼ�id
		public String title;  	//����
		public String writer;   //�ۼ���
		public int    postDate; //�Խ��ۼ���
		public int    views;    //��ȸ��
		public int    number;   //��ȣ
		
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
		//�޼���
		public void Write() {
			System.out.println("���� ���ϴ�.");
		}
		public void Update() {
			System.out.println("���� �����մϴ�.");
		}
		public void Delete() {
			System.out.println("���� �����մϴ�.");
		}
		public void Select(){
			System.out.println("���� ��ȸ�մϴ�.");
		}
		public void Board() {
			System.out.println("�Խñ��Դϴ�.");
		}
}
