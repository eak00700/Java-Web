package ex1_casting;

public class Ex1_promotion {

	public static void main(String[] args) {
		
		//ĳ����(����ȯ)
		//1.promotion
		// - ū �ڷ����� ���� �ڷ����� �����ϴ� ��(�ڵ�)
		
		double d = 100.5; //8byte
		int n = 200; //4byte
		d = n;	
		System.out.println("d : " + d);
		
		char c = 'D'; //2byte
		n = 100; //4byte
		n = c;
		System.out.println("n : " + n);
		
	}//main
	
}

















