package ex1_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �Է¹޵��� �ϰ�, ���� �̿��� ���� �ԷµǾ��ٸ�
		//'������ �Է°���'�̶�� �޽����� �������
		
		//���� : 10
		//�Է¹��� �� : 10
		
		//���� : aa
		//������ �Է°���
		
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int n = sc.nextInt();
			System.out.println("�Է¹��� �� : " + n);
			
		}catch (Exception e) {
			System.out.println("������ �Է� ������");
		}
		
	}//main
}













