package ch04.unit01;

import java.util.Scanner;

public class Ex05_If {

	public static void main(String[] args) {
		// 세 개의 정수를 입력 받아 적은수에서 큰 수 순으로 출력
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("세 수 입력 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int t;
		if(a > b) {
			t = a; a = b; b = t;
		}
		if(a > c) {
			t = a; a = c; c = t;
		}
		if(b > c) {
			t = b; b = c; c = t;
		}
		System.out.println(a + ", "+ b + ", "+ c);
		
		/*
		if(a <= b) {
			if(a <= c) {
				if(b <= c) {
					System.out.print(a + " " + b + " " + c);
				}else {
					System.out.print(a + " " + c + " " + b);
				}
			}else{
				System.out.print(c + " " + a + " " + b);
			}
		}else if(b <= c){
			if(a <= c) {
				System.out.print(b + " " + a + " " + c);
			}else {
				System.out.print(b + " " + c + " " + a);
			}
		}else {
			System.out.print(c + " " + b + " " + a);
		}
		*/
				
		sc.close();
		
	}
}
