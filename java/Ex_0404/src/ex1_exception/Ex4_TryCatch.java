package ex1_exception;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
		//���� : 100
		//��� : 100
		
		//���� : aab
		//��� : aab��(��) ������ �ƴմϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String n = "";
		
		try {
			
			n = sc.next();
			int num = Integer.parseInt(n);
			System.out.println("��� : " + num);
			
		}catch (Exception e) {
			System.out.println(n + "�� ������ �ƴ�");
		}
		
	}//main
}








































