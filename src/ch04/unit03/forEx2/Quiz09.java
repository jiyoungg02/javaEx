package ch04.unit03.forEx2;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// 가위바위보게임
		Scanner sc = new Scanner(System.in);
		int user, com;
		
		while(true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.종료 => ");
				user = sc.nextInt();
			}while(user < 1 || user>4);
			
			if(user == 4) {
				System.out.println("게임을 종료합니다..");
				break;
			}
			
			com = (int)(Math.random()*3) +1; // 1~3사이 난수
			
			/*
			String s ="가위", r="바위", p="보";
			String u, c;
			
			if(user==1) u = s;
			else if(user==2) u = r;
			else u = p;
			
			if(com==1) c = s;
			else if(com==2) c = r;
			else c = p;
			
			int cnt = user-com;
			if(cnt == -2 || cnt == 1) {
				System.out.printf("당신 : %s\n", u);
				System.out.printf("컴퓨터 : %s\n", c);
				System.out.println("당신이 이겼습니다.");
			}else if(cnt==0) {
				System.out.printf("당신 : %s\n", u);
				System.out.printf("컴퓨터 : %s\n", c);
				System.out.println("비겼습니다.");
			}else {
				System.out.printf("당신 : %s\n", u);
				System.out.printf("컴퓨터 : %s\n", c);
				System.out.println("당신이 졌습니다.");
			}
			System.out.println();
			*/
			
			String s;
			s = user==1 ? "가위" : (user==2 ? "바위" : "보");
			System.out.println("유저 : " +s);
			
			s = com==1 ? "가위" : (com==2 ? "바위" : "보");
			System.out.println("컴퓨터 : " +s);
		
			
			if(user == com) {
				System.out.println("비겼습니다.\n");
			}else if(user-com==-2 || user-com==1) {
				System.out.println("유저의 승\n");
			}else {
				System.out.println("컴퓨터의 승\n");
			}
			
		}
		sc.close();
	}
}
