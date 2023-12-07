package com.javalec.ex02;

public class Ex02 {
	
	// main 출력값
//	System.out.print("Input your decimal no. : ");
//	int facNum = sc.nextInt();
//	Ex02 ex02 = new Ex02(facNum);
	

	// Field
	int num;				// constructor의 parameter를 넣기 위한 인트 변수 설정
	
	
	
	// Constructor
	public Ex02() {
		// TODO Auto-generated constructor stub
	}
	
	public Ex02(int facNum) {		// main으로부터 num을 하나 받으면 그 num을 기준으로 factorial 실
		this.num = facNum;
		ex02();
	}
	
	// Method
	public void ex02() {
		int sum = 1;				// 덥셈 값 설정
		
		for(int i = num; i > 0; i --) {
			sum *= i;
			
		}
		System.out.println(num + "'s factorial value =   " + sum);
	}
	
	
	
	

}
