package com.urdomain.Test;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8,9,10};
		
		//1.두 배열의 길이를 합치기. 
		//2.두 배열을 복사하기.
		int[]arr3 = new int[arr1.length+arr2.length];//1과 2만큼의 길이를 합친다. 길이는 10
		System.out.println("배열의 길이생성:"+Arrays.toString(arr3));
		System.out.println();
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		System.arraycopy(arr1, 0, arr3,  arr2.length,arr1.length);
		Arrays.sort(arr3);//오름차순으로 정렬
		System.out.println("오름차순으로 정렬:"+Arrays.toString(arr3));
		
		//내림차순으로 정렬
		Integer[]arr4 = new Integer[arr3.length];//객체형 배열을 다시 받고 초기화하기
		
		for (int i = 0; i < arr3.length; i++) {//arr3배열의 길이만큼 arr4에 넣기 
			arr4[i]= arr3[i];   
		}
		System.out.println();
		Arrays.sort(arr4,Collections.reverseOrder());//해당배열을 내림차순으로 정렬하기.
	    
		System.out.println("내림차순 정렬:"+Arrays.toString(arr4));//출력
	}
}
