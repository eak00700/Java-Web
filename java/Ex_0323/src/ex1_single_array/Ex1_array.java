package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//�迭 : ���� �ڷ������� ��Ƶ� �ϳ��� ����
		//ȿ������ �ڷ������ ���� �ݵ�� �ʿ�
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) �迭 ����
		int[] arr; 
		
		//2) �迭 ����
		//�迭�� index�� ������ ó�� �����ص� �������� ������ �ø��ų� ���� �� ����
		arr = new int[6];
		
		//3) �迭 �ʱ�ȭ
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//arr.length : �迭�� �� ����
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//for
		
	}//main
}














