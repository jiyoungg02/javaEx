package ch05.unit01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		int []num = new int[6];
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("구매개수[1~5] ? ");
			n = sc.nextInt();
		}while(n < 1 || n > 5);
		
		for(int i=0; i<n; i++) { // 구매 개수
			//로또 한 게임
			for(int j=0 ; j<num.length; j++) {
				num[j] = (int)(Math.random()*45) + 1; // 난수 생성
				//중복수 필터링
				for(int k=0; k<j; k++) {
					if(num[j] == num[k]) {
						j--;
						break;
					}
				}
			}
			
			Arrays.sort(num); // 정렬
			
			//출력
			System.out.print(i+1 + "번째 : ");
			for(int j : num) {
				System.out.printf("%2d ",j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
