package ch04.unit03;

public class Quiz07 {

	public static void main(String[] args) {
		int n, x, y;
		n = 0;
		x = 100;
		y = 0;
		
		while(x > y) {
			n++;
			x += 2;
			y += 5;
		}
		System.out.printf("x : %d, y : %d\n", x, y);
		System.out.println("걸린시간 : " + n + "초");
		
	}
}
