package ex2_overload;

public class Ex_Overload {
	//�޼����� �����ε� : �޼����� '�ߺ�����'��� �ϸ� �ϳ��� Ŭ���� ������
	//���� �̸��� ���� �޼��尡 ������ ���ǵǴ� ��
	
	//**�޼��� �����ε��� ��Ģ**
	//1) �Ķ������ ������ �ٸ� ���
	//2) �Ķ������ ������ ���Ƶ� Ÿ���� �ٸ����
	//3) �Ķ������ ������ ���Ƶ� ������ �ٸ����
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
		//return;
	}
	
	public void result( int n ) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result( char n ) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}
	
	public void result( String s, int n ) {
		System.out.println("���ڿ�, ������ ���ڷ� �޴� �޼���");
	}
	
	public void result( int n, String s ) {
		System.out.println("����, ���ڿ��� ���ڷ� �޴� �޼���");
	}
}


















































