package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//StringŬ������ �� ���� Ư¡�� ������ �ִ�.
		//1)��ü �������� �� ����(�Ͻ���, �����)
		//2)�� �� ������ ���ڿ��� ������ ������ �ʴ´�(�Һ��� Ư¡)
		String s1 = "abc";//�Ͻ��� ��ü����
		String s2 = "abc";
		
		String s3 = new String("abc");//����� ��ü����
		String s4 = new String("abc");
		
		// == �����ڴ� �⺻�ڷ����� ���Ҷ��� ���� ���Ѵ�
		// �׷��� ��ü���� ���Ҷ��� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��
		if(s1 == s3) {
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ� : ");
		String s5 = sc.next();
		
		if( s5.equals( s1 ) ) {
			System.out.println("���� �����ϴ�");
		}else {
			System.out.println("���� �ٸ��ϴ�");
		}
		
		System.out.println("--------------------");
		//�Һ��� Ư¡
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println( greet );
		
	}//main
}













