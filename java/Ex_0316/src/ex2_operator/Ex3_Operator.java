package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� ���� �� �־�� �Ѵ�
		int a = 10;
		System.out.println( "a : " + ++a );
		
		int b = 10;
		System.out.println( "b : " + b++ );
		System.out.println(b);
		
		--b;
		--b;
		b--;
		b++;
		++b;
		--b;
		b++;
		b--;
		System.out.println(b++);

		//����(����)������
		//�ϳ��� ������ �ְ�, �� ������ ���϶��� �����϶��� ����
		//�ٸ� ������� ��ȯ���ִ� ������
		int i1 = 10;
		int i2 = 15;
		boolean res = ++i1 >= i2 ? true : false; 
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 && n1 > 10 ? 'A' : 'B';
		System.out.println(res2);
		
		System.out.println("--------------------------");
		
		a = 10;
		b = 12;
		int num = ++a >= b || 2 + (a - 4) <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		System.out.println(num);                                                               
		
	}//main
}



















