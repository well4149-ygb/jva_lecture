package com.urdomain.Test.Notice;

public class Notice extends General{//������
	//�ʵ�
	public String category;//ī�װ�
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//������
	public Notice(String id,String writer,String title,int views,int number ) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.views = views;
		this.number = number;
	}
	//�޼���
	@Override
	public void Write() {
		System.out.println("�������� �Խ��մϴ�.");
		System.out.println("["+category+"]"+id+" "+writer+" "+title+" "+views+" "+number);
	}
	@Override
	public void Update() {
		System.out.println("�������� �����մϴ�.");
	}
	@Override
	public void Delete() {
		System.out.println("�������� �����մϴ�.");
	}
	@Override
	public void Select() {
		System.out.println("�������� ã���ϴ�.");
	}
}
