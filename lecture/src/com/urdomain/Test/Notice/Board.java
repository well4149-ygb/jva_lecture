package com.urdomain.Test.Notice;

public class Board extends General{//�Խ���
	String[] tag;//�±�
	
	public String[] getTag() {
		return tag;
	}
    public void setTag(String[] tag) {
		this.tag = tag;
	}
	//������
	public Board(String writer,String title,String id,int views) {
		this.writer = writer;
		this.title  = title;
		this.id     = id;
		this.views  = views;
	}
	//�޼���
	public void clickLike() {
		System.out.println("���ƿ並 �������ϴ�.");
	}
	public void clickShare() {
		System.out.println("�����ϱ⸦ �������ϴ�.");
	}
	@Override
	public void Write() {
		System.out.println("����� �ۼ��߽��ϴ�.");
		for(String ouput: tag){
			System.out.print(ouput+" ");
		}
		System.out.println();
	}
	@Override
	public void Update() {
		System.out.println("����� �����߽��ϴ�.");
	}
	@Override
	public void Delete() {
		System.out.println("����� �����߽��ϴ�.");
	}
}
