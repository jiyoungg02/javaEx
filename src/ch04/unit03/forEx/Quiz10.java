package ch04.unit03.forEx;

public class Quiz10 {
	public static void main(String[] args) {	
	
		for(int i=1; i<=100 ; i++) {
			if(i%3==0 && i%4==0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
	}
}
