package com.urdomain.ch05;

public class ArrayCopyExample {
 public static void main(String[] args) {
  String[] oldStrArray = {"java","array","copy"};
  String[] newStrArray =new String[5];
  //oldStrArray의 첫번째 배열부터 oldStrArray의 길이만큼 newStrArray에 0번째 부터 복사를 시작한다.
  System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
  
  for(int i=0;i<newStrArray.length;i++) {
	  System.out.print(newStrArray[i]+",");
  }
 }
}
