package ch04.unit03;

public class Quiz03 {

	public static void main(String[] args) {
		char ch;
		int cnt;
		
		ch = 'A';
		cnt = 0;
		
		while(ch <= 'Z') {
			System.out.print(ch + (++cnt%5==0 ? "\n" :"\t"));
			ch++;
		}
		System.out.println();
	}
}
