package ex3_abstract;

abstract public class AbsParent {
	//�߻�޼��带 �Ѱ��� ������ �ִ� Ŭ������
	//abstractŰ���带 �ٿ� �߻�Ŭ������ �����ص־� �Ѵ�
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//�߻�޼���� body�� ���� ������ �̸� '�̿ϼ��� ����'�̶�� �Ѵ�
	//�׷��Ƿ� �� �̿ϼ��� �޼��带 �ڽ��� �����޾Ƽ� �ϼ���Ű���� �ϴ°��� ������ �ȴ�
	abstract public void setValue(int n);
	//public abstract void setValue(int n);
	
}























