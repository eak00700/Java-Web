package ex4_homework;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �Է¹��� ��, �� ���ڰ� �Ҽ����� �ƴ����� �Ǵ��ϴ� �ڵ带 �ۼ�
		//1�� �Ҽ��� �ƴ�
		
		//���� : 11
		//11��(��) �Ҽ��Դϴ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		int n = sc.nextInt();
		
		int i = 0;
		
		for( i = 2; i <= n; i++ ) {
			
			if( n % i == 0 ) {
				break;
			}
			
		}//for
		
		if( i == n ) {
			System.out.println(n + "�� �Ҽ��Դϴ�");
		}else {
			System.out.println(n + "�� �Ҽ��� �ƴ�");
		}
		
	}//main
}



















































