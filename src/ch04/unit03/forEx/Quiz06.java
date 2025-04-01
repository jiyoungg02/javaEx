package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//10개 정수를 입력 받아 최소값 출력
		Scanner sc = new Scanner(System.in);
		// 가장 처음 입력 받은 수를 초기값으로 할당
		/*
		int n, min; // 0x7FFFFFFF 가 젤 큰 정수 -> 젤 큰 정수로 초기값을 설정해도 됨	
		System.out.println("10개의 정수를 입력 하세요...");
		n = sc.nextInt();
		min = n;
		for(int i=1; i<10 ; i++) {
			n = sc.nextInt();
			if(n < min)
				min = n;
		}
		System.out.println("최소값 : " + min);
		*/
		
		/*
		int n, max; // 0x7FFFFFFF 가 젤 큰 정수 -> 젤 큰 정수로 초기값을 설정해도 됨	
		min = 0;
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10 ; i++) {
			n = sc.nextInt();
			if(i==1 || min < n) { // i==1은 처음 입력 받은 경우
				min = n;
			}	
		}
		System.out.println("최대값 : " + min);
		*/
		
		//가장 큰 수를 초기값으로 할당
		int n, min; // 0x7FFFFFFF 가 젤 큰 정수 -> 젤 큰 정수로 초기값을 설정해도 됨	
		min = 0x7FFFFFFF; // 정수 중 가장 큰 수
		System.out.println("10개의 정수를 입력 하세요...");
		for(int i=1; i<=10 ; i++) {
			n = sc.nextInt();
			if(min > n) { // i==1은 처음 입력 받은 경우
				min = n;
			}	
		}
		System.out.println("최대값 : " + min);
		
		sc.close();
	}
}
