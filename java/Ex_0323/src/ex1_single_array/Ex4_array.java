package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		//�迭 arr�� ����ִ� ��� ���� ���� ����Ͻÿ�
		//��� : 150
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int result = 0;//�迭�� ��� ���� ���ؼ� �����ص� ����
		
		for( int i = 0; i < arr.length; i++ ) {
			
			result += arr[i];
			
		}//for
		
		System.out.println("��� : " + result);
	}//main
}



















