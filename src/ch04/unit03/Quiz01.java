package ch04.unit03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		int sum, evenSum, oddSum;
		
		System.out.print("수 ? ");
		num = sc.nextInt();
		
		i = 1;
		sum = evenSum = oddSum= 0;
		
		while(i <= num) {
			sum += i; //합
			if(i%2==0) {
				evenSum += i; //짝수합
			}else {
				oddSum += i; //홀수합
			}
			i++;
		}
		System.out.printf("%d ~ %d 까지 합 = %d\n", 1, num, sum);
		System.out.printf("%d ~ %d 까지 짝수 합 = %d\n", 1, num, evenSum);
		System.out.printf("%d ~ %d 까지 홀수 합 = %d\n", 1, num, oddSum);
		
		sc.close();
	}
}
