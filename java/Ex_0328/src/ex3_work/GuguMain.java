package ex3_work;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받아
		//Gugudan클래스의 table()메서드에게 전달하면
		//전달된 값에 해당하는 구구단 출력
		
		//단 : 6
		//6 * 1 = 6
		//6 * 2 = 12
		// ...... 
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int n = sc.nextInt();
		
		Gugudan gugu = new Gugudan();
		gugu.table(n);
		
	}//main
}











