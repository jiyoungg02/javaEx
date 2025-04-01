package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		String s;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("연산자[+, -, *, /] ? ");
		s = sc.next();

		switch(s) {
		case "+": System.out.printf("%d + %d = %d", a, b, a+b); break;
		case "-": System.out.printf("%d - %d = %d", a, b, a-b); break;
		case "*": System.out.printf("%d * %d = %d", a, b, a*b); break;
		case "/": System.out.printf("%d / %d = %d", a, b, a/b); break;
		default: System.out.printf("연산자 입력 오류"); break;
		}
		
		sc.close();
	}
}
