package ch04.unit03.forEx2;

public class Quiz02 {

	public static void main(String[] args) {
		//3x+6y=27
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(i*3 + 6*j == 27) {
					System.out.printf("[%d,%d]\n", i, j);
				}
			}
		}
	}
}
