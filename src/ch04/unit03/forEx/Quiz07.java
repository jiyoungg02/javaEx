package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		//2개 정수를 입력 받아 두 정수 사이 3또는 5의 배수인 수들의 합과 평균 출력
		Scanner sc = new Scanner(System.in);
		int n1, n2, t, cnt=0, add=0;
		
		System.out.print("두정수 ? ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		// 적은 수는 n1, 큰 수는 n2
		if(n1>n2) {
			t = n1;
			n1 = n2;
			n2 = t;
		}
		
		for(int i=n1; i<=n2; i++) {
			if(i%3==0 || i%5==0) {
				add += i;
				cnt++;
			}
		}
		
		if(cnt != 0) {
			System.out.println("합: "+add);
			System.out.println("평균: "+ (add/cnt));
		}else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
		
		sc.close();
	}
}
