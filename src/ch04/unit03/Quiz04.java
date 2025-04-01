package ch04.unit03;

public class Quiz04 {

	public static void main(String[] args) {
		int n, cnt;
		int sum, ave;
		n = 0;
		cnt = 0;
		sum = 0;
		ave = 0;
		
		while(n < 100) {
			n++;
			if(n%3==0 || n%5==0) {
				sum += n; //합
				cnt++; // 평균
			}
		}
		ave = sum / cnt;
		
		System.out.printf("합 : %d\n", sum);
		System.out.printf("평균 : %d\n", ave);
		
	}
}
