package ex_homework;

public class Ex1_HW {
	public static void main(String[] args) {
		
		/*
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ� �� ������ �Ϸ� ���귮�� 
		 ���� 5, 6, 7��
		 
		  1)���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���
		  2)�ð��� ������ ���� ������ ���
		  
		 ��, ������ ������ �����ϴ� ������ intŸ������
		 �Ϸ翡 ����Ǵ� ������ �� ������ �����ϴ� ������ intŸ������
		 �ð��� ���� ������ ������ ������ floatŸ������ �ۼ��� ��.
		 
		 --------------------------------------
		 
		 �Ϸ���귮 : 18
		 �ð��� ���� : 0.xxxxx
		 */
		
		int pear = 5; //��
		int apple = 6; //���
		int orange = 7; //������
		
		int total = pear + apple + orange;
		//float avg = (float)total / 24;
		float avg = total / 24f;
		
		System.out.println("�Ϸ���귮 : " + total);
		System.out.println("�ð��� ���� : " + avg);
		
	}//main
}







