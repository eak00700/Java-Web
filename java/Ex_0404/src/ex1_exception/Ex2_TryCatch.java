package ex1_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		
		int res = 0;
		int[] arr = new int[2];
		
		try {
			
			res = 10 / 2;
			arr[1] = 10;
			
		}catch( ArithmeticException e ) {
			System.out.println("0���� ���� �� �����ϴ�");
			
		}catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� �ʴ� index���� �����Դϴ�");
			
		}finally{
			//try���������� ���ܹ߻� ���ο� �������
			//�������� �ݵ�� ȣ��Ǵ� ����
			System.out.println("finally");
		}
		
		System.out.println(res);
		
	}//main
}
















