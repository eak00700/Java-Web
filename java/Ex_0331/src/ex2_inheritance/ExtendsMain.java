package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		//ChildŬ������ ParentŬ������ ��ӹ��� �����̹Ƿ�
		//�θ�� ���� ��ӹ��� money, str���� ������ ������� ������ ����� �� �ִ�.
		Child c1 = new Child();
		System.out.println( c1.car );
		System.out.println( c1.money );
		System.out.println( c1.str );
		
		//��Ӱ����� ������ �θ�Ŭ������
		//�ڽ��� ����� ������� �����ٰ� ����� �� ����.
		Parent p1 = new Parent();
		System.out.println(p1.money);
		System.out.println(p1.str);
		
		//c1�� Parent�� ��Ӱ�����
		//instanceof Ű���带 ���ؼ� true���� ���� �� �ִ�.		
		if( c1 instanceof Parent ) {
			System.out.println( "c1�� Parent�� �ڽ�!!" );
		}
		
	}//main
}










