package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//10개 정수를 입력 받아 홀수 짝수 갯수 출력
		Scanner sc = new Scanner(System.in);
		int n, even = 0, odd = 0;
		
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i = 1; i<=10 ; i++) {
			n = sc.nextInt();
			if(n%2==0)
				even++;
			else odd++;
		}
		
		System.out.println("홀수의 개수 : " + odd);
		System.out.println("짝수의 개수 : " + even);
		
		sc.close();
	}
}
