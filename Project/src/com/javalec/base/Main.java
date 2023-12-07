package com.javalec.base;

import com.javalec.ex01.Ex01;
import com.javalec.ex02.Ex02;
import com.javalec.ex03.Ex03;
import com.javalec.ex04.Ex04;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int cnt = 0; // 종료 선언문을 위한 카운트 값

		while (true) { // 종료를 누르기 전 까지 무한 반복
			for (int i = 1; i <= 5; i++) { // 문제 1-5까지 출력하기 위함
				System.out.println(i + ". Ex" + i);
			}
			System.out.print("원하는 결과물을 선택하세요 >>> ");
			int inputnum = sc.nextInt();

			System.out.println("--------------------------");

			switch (inputnum) { // 원하는 결과물(i)에 따라 다르게 출력할것이기 때문에 swich문 사용
			case 1:
				System.out.println("10의 제곱을 계산하는 문제 입니다.");

				Ex01 ex01 = new Ex01();
				System.out.println("--------------------------");
				continue;

			case 2: // 2번 문제를 선택했을 때
				System.out.println("팩토리얼 계산하는 문제 입니다.");
				System.out.print("숫자를 입력하시오 : ");
				int ex02InputNum = sc.nextInt(); // 팩토리얼을 계산할 숫자 입력받기

				Ex02 ex02 = new Ex02(ex02InputNum); // ex02 객체에 입력 받은 값 삽입

				System.out.println("--------------------------");

				continue;

			case 3:
				System.out.println("입력한 숫자부터 +4한 숫자 까지의 구구단을 계산하는 문제 입니다.");
				System.out.print("숫자를 입력하시오 : ");
				int ex03InputNum = sc.nextInt(); // 숫자 입력받기

				Ex03 ex03 = new Ex03(ex03InputNum); // ex03 객체에 입력 받은 값 삽입
				ex03.ex03(); // ex03 출력

				System.out.println("--------------------------");

				continue;
			case 4:
				System.out.println("입력한 한 자릿수 정수의 합을 계산하는 문제 입니다.");
				System.out.print("숫자를 입력하시오 : ");
				int ex04InputNum = sc.nextInt(); // 계산 할 숫자 입력 받기

				Ex04 ex04 = new Ex04(ex04InputNum); // ex04 객체에 입력 받은 값 삽입
				ex04.tot();

				System.out.println("--------------------------");
				continue;

			case 5:
				System.out.println("종료합니다.");
				cnt++;
			}

			if (cnt == 1) {
				break;
			}

		}

	}

}
