package ch05.unit02;

public class Quiz02 {

	public static void main(String[] args) {
		char [][]ch = new char[5][5];
		char a = 'A';
		
		for(int i=0; i<5; i++) { //열
			for(int j=ch.length-1; j>=0; j--) { //행
				ch[j][i] = a++;
			}
		}
		
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.printf("%3c ", ch[i][j]);
			}
			System.out.println();
		}
	}
}
