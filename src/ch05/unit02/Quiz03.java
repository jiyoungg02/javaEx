package ch05.unit02;

public class Quiz03 {

	public static void main(String[] args) {
		int [][]a = new int[4][5];
		int n = 0;
		
		/*
		for(int i=0; i<5; i++) { //열
			for(int j=0; j<4; j++) { //행
				n++;
				if(i%2==0) {
					a[j][i] = n;
				}else {
					a[3-j][i] = n;
				}
				
			}
		}
		*/
		int row;
		for(int i=0; i<5; i++) { //열
			for(int j=0; j<4; j++) { //행
				row = i%2==0 ? j: 3-j;
				a[row][i] = ++n;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
