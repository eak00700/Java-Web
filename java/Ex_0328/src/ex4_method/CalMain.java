package ex4_method;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �ΰ��� �����ڸ� �Է¹޴´�
		//�Է¹��� ������ ���� ������� ȭ�鿡 ���
		//(���� �ΰ��� �����ڸ� �Է¹޴� �ڵ�� main����, 
		//�������� ����ϴ� �ڵ�� CalculatorŬ�������� �ϵ��� �Ѵ�)
		//----------------------
		//��1 : 5
		//��2 : 10
		//������ : +
		//��� : 15
		Scanner sc = new Scanner(System.in);
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("������ : ");
		String op = sc.next();
		
		Calculator cal = new Calculator();
		cal.getResult(su1, su2, op);
		
	}//main
}











