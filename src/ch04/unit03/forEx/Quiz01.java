package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 입력 받은 수까지 합 구하기
		Scanner sc = new Scanner(System.in);
		int s = 0, n;
		
		do {
			System.out.print("수 ? ");
			n = sc.nextInt();
		}while(n<1 || n>1000);
		
		for(int i=1 ; i<=n ; i++) {
			s += i;
		}
		
		System.out.printf("1~%d까지 합 : %d\n", n, s);
	
		sc.close();
	}
}
