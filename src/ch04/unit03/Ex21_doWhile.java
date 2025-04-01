package ch04.unit03;

import java.util.Scanner;

public class Ex21_doWhile {

	public static void main(String[] args) {
		//1~9 사이의 단을 입력 받아 구구단 출력
		// 단, 입력 받은 단이 1~9 사이의 수가 아니면 다시 입력 받는다.
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		i = 1;
		
		do {
			System.out.print("단 ? ");
			n = sc.nextInt();	
		}while(n < 1 || n > 9);
		
		do {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
			i++;
		}while(i<10);
		
		sc.close();
	}
}
