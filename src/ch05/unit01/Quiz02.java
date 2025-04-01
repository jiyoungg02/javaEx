package ch05.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		int []score = new int[5];
		int sum = 0, result;
		int max, min;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			do {
				System.out.print(i+1 + "번째 점수 : ");
				score[i] = sc.nextInt();
			}while(score[i]<0 || score[i]>10);
			sum += score[i];
		}
		//최대 / 최소 : 가장 처음값을 초기값으로
		max = min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}else if(min > score[i]) {
				min = score[i];
			}
		}
		result = sum - max - min;
		
		System.out.print("\n점수 리스트 : ");
		for(int n : score) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n취득 점수 : " + result);
		
		sc.close();
	}
}
