package ex5_method;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UpdownClass uc = new UpdownClass();
		
		while(true) {
			
			//Ű���忡�� �����̶�� �����Ǵ� ���� UpdownClass���� �����ش�.
			//UpdownClass�� check()�޼��尡 �������� ���������� �Ǻ��� �����͸� �޴´�
			//������ �Է¹޾��� �� break�� ���ؼ� ���� while���� ����������!!
			System.out.print("�� : ");
			int num = sc.nextInt();
			
			String res = uc.check(num);
			
			if( res.equals("����") ) {
				break;
			}
			
		}//while
		
	}//main
}








