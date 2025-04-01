package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("점수 ? ");
		n = sc.nextInt();
		
		/*
		if(n>=95 && n<=100) {
			System.out.println("점수 : "+ n + ", 평점 : 4.5");
		}else if(n>=90 && n<=94) {
			System.out.println("점수 : "+ n + ", 평점 : 4.0");
		}else if(n>=85 && n<=89) {
			System.out.println("점수 : "+ n + ", 평점 : 3.5");
		}else if(n>=80 && n<=84) {
			System.out.println("점수 : "+ n + ", 평점 : 3.0");
		}else if(n>=75 && n<=79) {
			System.out.println("점수 : "+ n + ", 평점 : 2.5");
		}else if(n>=70 && n<=74) {
			System.out.println("점수 : "+ n + ", 평점 : 2.0");
		}else if(n>=65 && n<=69) {
			System.out.println("점수 : "+ n + ", 평점 : 1.5");
		}else if(n>=60 && n<=64) {
			System.out.println("점수 : "+ n + ", 평점 : 1.0");
		}else if(n>=0 && n<=59) {
			System.out.println("점수 : "+ n + ", 평점 : 0.0");
		}else {
			System.out.println("입력오류"); 
		}
		*/
		double grade;
		if(n>=0 && n<=100) {
			if(n >= 95) grade = 4.5;
			else if(n >= 90) grade = 4.0;
			else if(n >= 85) grade = 3.5;
			else if(n >= 80) grade = 3.0;
			else if(n >= 75) grade = 2.5;
			else if(n >= 70) grade = 2.0;
			else if(n >= 65) grade = 1.5;
			else if(n >= 60) grade = 1.0;
			else grade = 0.0;
			
			System.out.printf("점수 : %d, 평점 : %.1f\n", n, grade);
		}else {
			System.out.println("점수 입력 오류입니다.");
		}
		
		sc.close();
	
	}
}
