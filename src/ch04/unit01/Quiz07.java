package ch04.unit01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int a, b, c;
		int tot, ave; 
		
		System.out.print("이름 ? ");
		name = sc.next();
		System.out.print("세과목 점수 ?");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		tot = a + b + c;
		ave = tot / 3;
		
		if(ave>=60 && a>=40 && b>=40 && c>=40) {
			System.out.printf("%s님은 합격입니다.", name);
		}else if(ave<60) {
			System.out.printf("%s님은 불합격입니다.", name);
		}else {
			System.out.printf("%s님은 과락입니다.", name);
		}
		
		sc.close();
	}
}
