package ch05.unit02;


/*
    행은 감소 열은 증가
	5의 배수이면 행 증가
	행이 범위를 벗어나면 행은 최대 행으로 이동
	열이 범위를 벗어나면 최소 열로 이동 
*/

public class Quiz08 {

	public static void main(String[] args) {
		//마방진
		int n = 3;
		int [][]num = new int[n][n]; // 홀수만 가능
		
		int row, col;
		
		row = 0;
		col = n/2;
		
		for(int i=1; i<=n*n; i++) {
			num[row][col] = i;
			
			if(i % n == 0) {
				row++;
			}else {
				row--;
				col++;
			}
			
			if(row < 0) {
				row = n - 1;
			}
			if(col >= n) {
				col = 0;
			}
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		
	}
}
