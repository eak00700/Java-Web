package ex4_homework;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받은 후, 그 숫자가 소수인지 아닌지를 판단하는 코드를 작성
		//1은 소수가 아님
		
		//정수 : 11
		//11은(는) 소수입니다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		int n = sc.nextInt();
		
		int i = 0;
		
		for( i = 2; i <= n; i++ ) {
			
			if( n % i == 0 ) {
				break;
			}
			
		}//for
		
		if( i == n ) {
			System.out.println(n + "은 소수입니다");
		}else {
			System.out.println(n + "은 소수가 아님");
		}
		
	}//main
}



















































