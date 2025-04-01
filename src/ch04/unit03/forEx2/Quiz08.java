package ch04.unit03.forEx2;

public class Quiz08 {

	public static void main(String[] args) {
		int cnt=0;
		for(int a = 1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				for(int c=1; c<=10; c++) {
					if(a*a + b*b == c*c) {
						System.out.printf("a=%d, b=%d, c=%d\n",a, b, c);
						cnt++;
					}
				}
			}
		}
		System.out.println("전체개수 : "+cnt);
	}
}
