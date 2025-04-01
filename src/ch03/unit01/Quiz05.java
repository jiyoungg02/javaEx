package ch03.unit01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int d, sp;
		int h, m;
		double s, t;
		
		System.out.print("주행 거리(km) ? ");
		d = sc.nextInt();
		System.out.print("시속(km/h) ? ");
		sp = sc.nextInt();
		
		t = (double) d / sp; // 단위 시간 (hour)
		h = (int)t;
		m = (int)((t * 60) % 60) ; 
		s = (t * 3600) % 60;
		
		s = (int)(s * 100) / 100.0; // 소수점 3째자리 버림
		
		System.out.printf("%d km => %d시간 %d분 %.2f초 소요\n", d, h, m, s);
		
		sc.close();
	}
}
