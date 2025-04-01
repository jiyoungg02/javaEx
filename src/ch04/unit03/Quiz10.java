package ch04.unit03;

public class Quiz10 {
	public static void main(String[] args) {

		int a, b;
		b = 0;

		while (b < 9) {// 곱하는수
			b++;
			a = 1;
			while (a < 9) {// 단
				a++;
				System.out.printf("%d*%d= %2d\t", a, b, a * b);
			}
			System.out.println();
		}
	}
}
