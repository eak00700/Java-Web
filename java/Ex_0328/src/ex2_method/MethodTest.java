package ex2_method;

public class MethodTest {
	
	public void test1() {
		System.out.println("test1() �޼��带 ȣ����");
	}

	
	public void value( int n ) {
		n++;
		System.out.println("value() �޼��� : " + n);
	}
	
	//��ȯ���� ��� �⺻�ڷ����� ��� Ŭ���� Ÿ������ ������ ����
	public String exam( int n1, int n2 ) {
		
		System.out.println(n1 + n2);
		
		//��ȯ���� void�� �ƴ� ��� ��쿡��
		//�ּ��� �Ѱ��� return�ڵ尡 �ۼ��Ǿ�� �Ѵ�
		return "�ȳ�";//��ȯ���� returnŸ���� �ݵ�� ��ġ�ؾ� �Ѵ�
	}
	
	public int exam2( char c ) {
		System.out.println(c);
		
		//return�ڵ� �Ʒ��ʿ��� � �ڵ嵵 �߰��� �� ����
		return c;
		//System.out.println();
	}
	
}











