package ex2_value_type;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		//�ڷ���(�⺻�ڷ���)
		/*
		 ���� : boolean - 1bit
		 ������ : char - 2byte
		 ������ : byte - 1byte ........ -128 ~ 127
		 	    short - 2byte ....... -32768 ~ 32767
		 	    int - 4byte ......... -21�� ~ 21��
		 	    long - 8byte ........ -900�� ~ 900��
		 �Ǽ��� : float - 4byte
		        double - 8byte
		 */
		
		//���� : Ư�� ���� �����ϱ� ���� ����
		//���������� ��Ģ
		//�ڷ��� ������;(����)
		//������ = ��;(����)
		//�ڷ��� ������ = ��;(�ʱ�ȭ)
		
		//������ ǥ�� ��Ģ
		//1)_�� ������ Ư�����ڸ� ������ �� ����
		//2) �ѱ� ��� ����
		//3) ������ ù���ڴ� �ݵ�� �ҹ���
		
		//����(boolean)
		//true, false ��, ���� ������ �ΰ��� ������ ������ �� �ִ�
		boolean b1;//����
		b1 = true;//����
		
		boolean b2 = false;//�ʱ�ȭ
		b2 = true;		
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		System.out.println("-----------------------");
		
		//������(char)
		//Ȭ����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = 65 + 1;//�ƽ�Ű�ڵ� 66�� �ش��ϴ� ���ĺ� B�� ����
		System.out.println("ch : " + ch);
		
		System.out.println("------------------------");
		//����(byte, short, int, long)
		byte i1 = 127;
		short i2 = 32767;
		int i3 = 2100000000;
		long i4 = 2200000000L;
		
		System.out.println(i4);
		
		System.out.println("-----------------------");
		
		float f = 3.14F;
		double d = 3.14;
		
		f = 100;
		d = 100;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
	}//main
	
}































































