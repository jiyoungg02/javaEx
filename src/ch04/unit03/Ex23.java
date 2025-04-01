package ch04.unit03;

public class Ex23 {

	public static void main(String[] args) {
		int a, b;
		
		a = 0;
		while(a < 9) {
			a++;
			System.out.println("** " + a + "단 **");
			
			b = 0; //초기값 위치 주의 while문 밖에 있으면 2단밖에 나오지 않음
			while(b < 9) {
				b++;
				System.out.printf("%d * %d = %d\n", a, b, a*b);
			}
			System.out.println("-------------------");
		}
		
	}
}
