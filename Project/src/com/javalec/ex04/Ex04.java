package com.javalec.ex04;

public class Ex04 {

	/*
	 * Ex04 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
	 * 
	 * Enter an integer(0 ~ 9) : 12345678 Sum of digits = 36
	 */

	int inputNum; // 입력 변수
	int tot; // 누적 합계

	public Ex04() {
	}

	public Ex04(int inputNum) { // main으로부터 숫자를 하나받으면 숫자기준으로 계산됨
		this.inputNum = inputNum;

	}

	public void tot() {
		System.out.println("Enter an integer(0 ~ 9) : " + inputNum);

		while (inputNum != 0) {
			tot += inputNum % 10; // 입력값의 나머지값 산출후 누적합계에 누적
			inputNum /= 10; // 나눈값에

		}
		System.out.println("Sum of digits = " + tot);

	}

}
