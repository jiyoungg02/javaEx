package ch04.unit03.forEx2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 7에 가장 가까운 정수
		Scanner sc = new Scanner(System.in);
		int n, result=0;
		int cnt1=0, cnt2;
		
		System.out.println("5개의 숫자를 입력하세요...");
		for(int i=1; i<=5; i++) {
			n = sc.nextInt();
			/*
			cnt2 = n-7;
			if(cnt2<0) {
				cnt2 = -cnt2;
			}
			*/
			cnt2 = n > 7 ? n-7 : 7-n;
			if(i==1 || cnt1 > cnt2) {
				cnt1 = cnt2;
				result = n;
			}
		}
		System.out.println("7에 가장 가까운수 : " + result);
		
		sc.close();
	}
}
