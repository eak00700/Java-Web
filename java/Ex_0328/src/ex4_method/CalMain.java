package ex4_method;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//키보드에서 정수 두개와 연산자를 입력받는다
		//입력받은 정보를 통해 계산결과를 화면에 출력
		//(정수 두개와 연산자를 입력받는 코드는 main에서, 
		//연산결과를 출력하는 코드는 Calculator클래스에서 하도록 한다)
		//----------------------
		//수1 : 5
		//수2 : 10
		//연산자 : +
		//결과 : 15
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(su1, su2, op);
		
	}//main
}











