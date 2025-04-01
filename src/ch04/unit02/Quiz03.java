package ch04.unit02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month;
		int m1=31, m2=28, m3=31, m4=30, m5=31, m6=30, m7=31, m8=31, m9=30, m10=31, m11=30, m12=31; 
		
		System.out.print("년도 ? ");
		year = sc.nextInt();
		System.out.print("월 ? ");
		month = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			m2 += 1;
		}
		
		switch(month) {
		case 1: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m1); break;
		case 2: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m2); break;
		case 3: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m3); break;
		case 4: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m4); break;
		case 5: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m5); break;
		case 6: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m6); break;
		case 7: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m7); break;
		case 8: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m8); break;
		case 9: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m9); break;
		case 10: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m10); break;
		case 11: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m11); break;
		case 12: System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, m12); break;
		default: System.out.println("입력 오류"); break;
		}
		
		sc.close();
	}
}
