package ex1_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
		//'정수만 입력가능'이라는 메시지를 출력하자
		
		//정수 : 10
		//입력받은 수 : 10
		
		//정수 : aa
		//정수만 입력가능
		
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int n = sc.nextInt();
			System.out.println("입력받은 수 : " + n);
			
		}catch (Exception e) {
			System.out.println("정수만 입력 가능함");
		}
		
	}//main
}













