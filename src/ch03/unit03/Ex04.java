package ch03.unit03;

public class Ex04 {

	public static void main(String[] args) {
		int a = 13, b =20;
		int c, d;
		
		// 홀수 짝수 판별하기
		c = a & 1; // 1
		d = b & 1; // 0
		System.out.println(c + ", " + d);
		
	}
}
