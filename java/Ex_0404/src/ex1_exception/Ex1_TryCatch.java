package ex1_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		//�ڹٿ��� ���α׷��� ����Ǵ� ���� ����(����)�� �߻��ϸ� �� �������� ���α׷��� 
		//������ ����ȴ�. �̰��� �ùٸ� �Ǵ�������, ���δ� ���󰡴��� ������ �ְų�
		//���� �߻��� �̸� �����ϰ� ������ �۾��� �����ؾ� �ϴ� ��찡 �ִ�.
		//����ó���� ���� ���α׷��� ���������� ���Ḧ �ٿ�����!!!
		
		//try{
		//	�����ڵ�
		//}catch(Exception e){
		//	try���� �����ڵ尡 �߰ߵǸ� ȣ��Ǵ� ����
		//}
		
		int result = 0;
		char[] arr = new char[3];
		
		try {
			result = 10 / 0;
			arr[2] = 'A';
			
		}catch(Exception e) {
			//try�������� ������ �߻��ϸ� catch�������� �̵��Ͽ�
			//�ڵ带 ������ �� ����������
			//System.out.println("�����߻�");
			e.printStackTrace();
		}
		
		System.out.println(result);
		
	}//main
}


























