package ch03.unit05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//두 정수를 입력 받아 입력 받은 수 사이의 정수 개수 구하기
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("두정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a > b ? (a-b+1) : (a < b ? (b-a+1) : 1); // 같으면 정수 개수가 1인걸까?
		c = (a > b ? a-b : b-a) + 1;
		
		System.out.println("두수사이 정수의 개수 : "+ c);
		
		sc.close();
	
	}
}
