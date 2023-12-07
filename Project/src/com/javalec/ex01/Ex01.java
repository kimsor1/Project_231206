package com.javalec.ex01;

public class Ex01 {

	/*	
	Description : 10의 10의 0승에서 ~ 10의 10승까지의 제곱승을 구하라.
	Date : 23.12.06
	Version : 1.0
	Author : 기태우
	*/

		
	public Ex01() {
	
		(resultEx01)
		
	}
	
	
	public void resultEx01() {	
	for (long i = 0, num = 1; i <= 10;i++) { 
		num *=10; 		// 10의 재곱을 더하는 식.
	System.out.println("10^" + String.format("%2d", i) + " =" + String.format("%13d", num/10)); // 10으로 나누어 출력하기.
			}
	
		
	}



}