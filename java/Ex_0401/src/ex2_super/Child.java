package ex2_super;

public class Child extends Parent{
	
	//super : �θ�Ŭ����	
	public Child() {
		super(10);//�θ�Ŭ������ �����ڸ� ȣ��
		System.out.println("Child�� ������");
	}
	
	@Override
	public int result() {
		//super.result() : ParentŬ������ result()�޼��带 ȣ��
		return super.result();
	}
	
}










