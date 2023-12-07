package com.javalec.ex01;

public class Ex01 {


		
	public Ex01() {
	
		resultEx01();
	}
	
	
	public void resultEx01() {	
	for (long i = 0, num = 1; i <= 10;i++) {
		num *=10; 
	System.out.println("10^" + String.format("%2d", i) + " =" + String.format("%13d", num/10));
			}
	
		
	}



}