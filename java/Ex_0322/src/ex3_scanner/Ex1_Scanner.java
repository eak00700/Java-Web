package ex3_scanner;

//�ٸ� ��Ű���� �ִ� Ŭ������ ���� ��Ű�������� ��� �����ϵ��� ����� �޴� ����(import)
import java.util.Scanner;//ctrl + shift + o <--- �ڵ� import

public class Ex1_Scanner {

	public static void main(String[] args) {
		
		//Scanner Ŭ���� : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ��� �� �ִ� Ŭ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		
		//Ű���忡�� intŸ���� ���� �ް� ���͸� ġ�� ����
		//num������ ����ڰ� �Է¹��� ���� ��������
		int num = sc.nextInt();//Ű���忡�� �Է¹��� ������ �����ϴ� ���
		
		System.out.println("�Է¹��� �� : " + num);
		
		System.out.println("���� : ");
		String str = sc.next();//Ű���忡�� �Է¹��� ������ �����ϴ� ���
		System.out.println(str);
		
	}//main
	
}





























