package ex2_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		
		//������
		//1.�ְ����� : . , ()
		//2.���������� : ++ , --
		//3.��������� : + , - , * , / , %
		//4.����Ʈ������ : >> , <<
		//5.�񱳿����� : > , < , >= , <= , == , !=
		//6.��Ʈ������ : & , | , ^ , ~
		//7.�������� : &&, ||, !
		//8.����(����)������ : ? , :
		//9.���Կ����� : = , *= , /= , %= , += , -=
		
		//��������� : 4Ģ����� ������ �����ڸ� ������ �ִ�.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println( "n3 : " + n3 );
		
		n3 = n1 / n2; //��
		System.out.println("n1 / n2 : " + n3);
		
		n3 = n1 % n2; //������
		System.out.println("n1 % n2 : " + n3);
		
		System.out.println("-----------------------");
		
		//���Կ����� : Ư�� ���� ������ �����Ͽ� ����ų �� ����ϴ� ������
		int i1 = 10;
		int i2 = 3;
		
		//i1 = i1 + i2
		i1 += i2;
		System.out.println("+= : " + i1);
		
		//i1 = i1 / i2;
		i1 /= i2;
		System.out.println("/= : " + i1);
		
		//i1 = i1 % i2;
		i1 %= i2;
		System.out.println("%= : " + i1);
		
		
	}//main
}

































