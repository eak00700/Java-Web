package ex3_abstract;

public class AbsChild extends AbsParent{

	//�߻�Ŭ������ �θ� ��ӹ��� �ڽ�Ŭ������
	//�θ� ������ �ִ� �̿ϼ�(�߻�)�޼��带 �������̵� �Ͽ� ������ �־�� �Ѵ�.
	//�ڽ��� ������ �������ؼ� �ϼ���ų �ʿ�� ������, �޼��� ��ü�� �ݵ�� �޾Ƶξ�� �Ѵ�
	@Override
	public void setValue(int n) {
		
		System.out.println("�߻�޼��� ��������");
		
	}

}
