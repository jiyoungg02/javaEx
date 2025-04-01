package ch04.unit03;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int temp;
		int sum;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//입력 받은 두수중 적은수는 a, 큰수는 b에 저장
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		//적은수에서 큰수까지 합구하기
		sum = 0;
		int n = a;
		while(n <= b) {
			sum += n;
			n++;
		}
		System.out.printf("%d ~ %d 까지의 합 = %d\n", a, b, sum);
		
		sc.close();
	}
}
