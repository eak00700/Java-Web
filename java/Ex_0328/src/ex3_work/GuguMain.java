package ex3_work;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		
		//Ű���忡�� ������ �Է¹޾�
		//GugudanŬ������ table()�޼��忡�� �����ϸ�
		//���޵� ���� �ش��ϴ� ������ ���
		
		//�� : 6
		//6 * 1 = 6
		//6 * 2 = 12
		// ...... 
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int n = sc.nextInt();
		
		Gugudan gugu = new Gugudan();
		gugu.table(n);
		
	}//main
}











