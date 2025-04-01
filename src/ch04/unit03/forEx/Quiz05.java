package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//10개 정수를 입력 받아 최댓값 출력
		Scanner sc = new Scanner(System.in);
		// 가장 처음 입력 받은 수를 초기값으로 할당
		/*
		int n, max; // 0x80000000 가 젤 작은 정수 -> 젤 작은 정수로 초기값을 설정해도 됨	
		System.out.println("10개의 정수를 입력 하세요...");
		n = sc.nextInt();
		max = n;
		for(int i=1; i<10 ; i++) {
			n = sc.nextInt();
			if(n > max)
				max = n;
		}
		System.out.println("최대값 : " + max);
		*/
		
		/*
		int n, max; // 0x80000000 가 젤 작은 정수 -> 젤 작은 정수로 초기값을 설정해도 됨	
		max = 0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10 ; i++) {
			n = sc.nextInt();
			if(i==1 || max < n) { // i==1은 처음 입력 받은 경우
				max = n;
			}	
		}
		System.out.println("최대값 : " + max);
		*/
		
		//가장 적은 수를 초기값으로 할당
		int n, max; // 0x80000000 가 젤 작은 정수 -> 젤 작은 정수로 초기값을 설정해도 됨	
		max = 0x80000000; // 정수 중 가장 적은 수
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10 ; i++) {
			n = sc.nextInt();
			if(max < n) { // i==1은 처음 입력 받은 경우
				max = n;
			}	
		}
		System.out.println("최대값 : " + max);
		
		sc.close();
	}
}
