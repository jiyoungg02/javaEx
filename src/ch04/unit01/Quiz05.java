package ch04.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, rate=10000;
		int pay;
		System.out.print("근무시간 ? ");
		h = sc.nextInt();
		
		if(h>8) {
			pay = rate*8 + (int)((h-8)*rate*1.5);
		}else {
			pay = h*rate;
		}
		
		System.out.printf("급여 : %,d원\n", pay);
			
		sc.close();
	}
}
