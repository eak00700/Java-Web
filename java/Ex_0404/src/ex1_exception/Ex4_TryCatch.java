package ex1_exception;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
		//정수 : 100
		//결과 : 100
		
		//정수 : aab
		//결과 : aab은(는) 정수가 아닙니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		String n = "";
		
		try {
			
			n = sc.next();
			int num = Integer.parseInt(n);
			System.out.println("결과 : " + num);
			
		}catch (Exception e) {
			System.out.println(n + "은 정수가 아님");
		}
		
	}//main
}








































