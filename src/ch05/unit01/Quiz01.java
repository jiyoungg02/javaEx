package ch05.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		String []tti = new String[] {"원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양"};
		int y;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("년도 ? ");
			y = sc.nextInt();
		}while(y < 1900);
		
		int s = y%12;
		System.out.printf("%d년도는 %s띠의 해입니다.\n", y, tti[s]);
		
		sc.close();
	}
}
