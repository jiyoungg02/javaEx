package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("연산자[+, -, *, /] ? ");
		ch = sc.next().charAt(0);
		
		if(ch =='+') {
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		}else if(ch =='-') {
			System.out.printf("%d - %d = %d\n", a, b, a-b);
		}else if(ch =='*') {
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		}else if(ch =='/') {
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		}else {
			System.out.println("연산자 입력 오류입니다.");
		}
		
		sc.close();
	}

}
