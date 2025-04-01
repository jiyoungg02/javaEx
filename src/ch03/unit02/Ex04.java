package ch03.unit02;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		System.out.println("a : 20, b : 20");
		
		a = 20; b = 20;
		c = ++a > 20 && ++b > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 21 true
	
		a = 20; b = 20;
		c = a++ > 20 && b++ > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 20(단축연산으로 계산이 되지 않음) false
		
		a = 20; b = 20;
		c = ++a > 20 && b++ > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 21 false
		
		a = 20; b = 20;
		c = ++a > 20 || ++b > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 20(단축연산으로 계산이 되지 않음) true
		
		a = 20; b = 20;
		c = a++ > 20 || b++ > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 21 false
		
		a = 20; b = 20;
		c = ++a > 20 || b++ > 20;
		System.out.println(a + ", " + b + ", " + c);
			// 21 20(단축연산으로 계산이 되지 않음) true
		
	}
}
