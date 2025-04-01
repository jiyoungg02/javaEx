package ch02.unit04;

public class Ex07_Escape {

	public static void main(String[] args) {
		// 확장열
		System.out.println("a\tb\tc");
		System.out.println("a\tb\nc");
		System.out.println("x\\y"); // \ 출력
		System.out.println('\101'); // 8진수 101, 65 => A
		System.out.println('\u0043'); // 유니코드, 67 => C
		
	}

}
