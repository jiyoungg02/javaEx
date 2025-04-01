package ch04.unit03.forEx;

public class Ex07 {

	public static void main(String[] args) {
		//1~100까지 홀수합
		int s;
		s = 0;
		for(int n=1 ; n<=100; n+=2) { // n의 유효범위는 for문
			s += n;
		}
		System.out.println("1~100까지 홀수 합 : " + s);
		
		//1~100까지 짝수합
		// int s = 0; //컴오류
		s = 0;
		for(int n=2 ; n <= 100; n+=2) {
			s += n;
		}
		System.out.println("결과 : " + s);
	}
}
