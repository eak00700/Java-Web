package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ���
		
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					//���� ����� �ݺ����� ������ Ż��
					//break�ڵ带 ������ ���� �ݺ����� ��°�� ���������� ������
					//break�ڵ� �ٷ� �Ʒ����� ��� �ڵ嵵 �ۼ��� �� ����.
					break;
					//System.out.println();
				}
				
				System.out.printf("%d ", j);
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}











