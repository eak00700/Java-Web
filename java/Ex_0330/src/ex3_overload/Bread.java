package ex3_overload;

public class Bread {

	//method 1
	public void makeBread() {
		System.out.println("���� ��������ϴ�");
	} 

	//method 2
	public void makeBread(int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.println("���� ��������ϴ�");
		}
		System.out.println("��û�Ͻ� " + n + "���� ���� ����");
	}

	//method 3
	public void makeBread(int n, String name) {
		
		for( int i = 0; i < n; i++ ) {
			System.out.printf("%s�� ��������ϴ�\n", name);
		}
		
		System.out.printf("��û�Ͻ� %d���� %s���� ��������ϴ�\n", n, name);
		
	}
	
}












