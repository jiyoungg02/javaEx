package ch04.unit01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("첫번째수 ? ");
		a = sc.nextInt();
		System.out.print("두번째수 ? ");
		b = sc.nextInt();
		
		if(a >= b) {
			System.out.println("두수의 차이 : " + (a-b));
		}else {
			System.out.println("두수의 차이 : " + (b-a));
		}
		
		/*
		 int result;
		 result = a - b;
		 if(result<0){
		 	result = - result;
		 }
		 System.out.println("두수의 차이 : " + result);
		 */
		
		sc.close();
	}

}
