package ch04.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("문자 ? ");
		ch = sc.next().charAt(0);
		
		if(ch>='A'&& ch<='Z') {
			System.out.println(ch + " => " + (char)(ch+32));
		}else if(ch>='a' && ch<='z') {
			System.out.println(ch + " => " + (char)(ch-32));
		}else {
			System.out.println(ch);
		}
		
		/*
		char result;
		result = ch;
		if(ch>='A' && ch<='Z') {
			result += 32;
		}else if(ch>='a' && ch<='z') {
			result -= 32;
		}
		System.out.println(ch + " => " + result);
		*/
		
		sc.close();
	}
}
