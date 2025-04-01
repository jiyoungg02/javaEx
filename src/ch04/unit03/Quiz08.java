package ch04.unit03;

public class Quiz08 {

	public static void main(String[] args) {
		// 1 + 2 + 4 + 7 + 11 + ...: 20개
		// 1   2   3   4  ...
		
		int n, s, cnt;
		n = 0;
		s = 0;
		cnt = 1;
		
		while(n < 20) {
			s += cnt;
			n++;
			cnt += n;
		}
		System.out.println("결과 : " + s);
	}
}
