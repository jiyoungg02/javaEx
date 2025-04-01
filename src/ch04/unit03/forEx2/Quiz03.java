package ch04.unit03.forEx2;

public class Quiz03 {

	public static void main(String[] args) {
		//a+b+c=25 
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int h=1; h<=9; h++) {
					if(i+j+h==25) {
						System.out.printf("%d+%d+%d=%d\n", i, j, h, i+j+h);
					}
				}
			}
		}
	}
}
