package ch03.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 ? ");
		int m = sc.nextInt();
		
		System.out.printf("오만원권 : %d\n", m / 50000);
		System.out.printf("만원권 : %d\n", (m % 50000) / 10000);
		System.out.printf("오천원권 : %d\n", (m % 10000) / 5000);
		System.out.printf("천원권 : %d\n", (m % 5000) / 1000);
		System.out.printf("오백원권 : %d\n", (m % 1000) / 500);
		System.out.printf("백원권 : %d\n", (m % 500) / 100);
		System.out.printf("오십원권 : %d\n", (m % 100) / 50);
		System.out.printf("십원권 : %d\n", (m % 50) / 10);
		System.out.printf("오원권 : %d\n", (m % 10) / 5);
		System.out.printf("일원권 : %d\n", (m % 5) /1);

		sc.close();
	}
}
