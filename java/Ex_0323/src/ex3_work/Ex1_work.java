package ex3_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�
		//�� 3450, 2100, 60�� ���� 1���ڸ� ���ڴ� �ݵ�� 0�� �ǵ��� �Ѵ�
		
		//�߻��� ���� money�� �������� �ٲٸ� �� ������ ��� �ʿ������� �Ǵ��ϴ� �ڵ带 �ۼ�
		//�������� ���� ���� ������ ����ϵ��� �Ѵ�
		
		//4170
		//500�� : 8
		//100�� : 1
		//50�� : 1
		//10�� : 2
		
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt( 500 ) + 1;
		money *= 10;
		System.out.println("�ݾ� : " + money);
		
		
	}//main
}








