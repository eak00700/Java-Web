package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		//�񱳿�����
		//������ ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("res : " + res);
		
		res = n1 >= n2;
		System.out.println("res : " + res);
		
		res = n1 == n2;// == : �� ������ ���� ������ �Ǵ�
		System.out.println("res : " + res);
		
		res = n1 != n2;// != : �� ������ ���� �ٸ��� �Ǵ�
		System.out.println("res : " + res);
		
		System.out.println("----------------------");
		
		//��������
		//�� �����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
		int age = 21;
		int limit = 25;
		
		//&&(and) ������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�
		//�� && �� = ��
		//�� && ���� = ����
		//���� && �� = ����
		//���� && ���� = ����
		res = limit - age >= 5 && (age += 2) > 20;	
		System.out.println(age);
		System.out.println("&&���� : " + res);
		
		//||(or) ������ : ���� ������ true��� ������ ������ �������� �ʴ´�
		//�� || �� = ��
		//�� || ���� = ��
		//���� || �� = ��
		//���� || ���� = ����
		int i1 = 10;
		int i2 = 20;
		res = ( i1 += 10 ) > 20 || i2 - 10 == 11;
		System.out.println("||���� : " + res);
		
		//!(not)������ 
		//���� ��������, ������ ������ �Ͻ������� ���� �ٲ��ִ� ������
		System.out.println("!���� : " + !res);
		System.out.println( res );
		
	}//main
}










































