package ex3_animal;

public class Snake extends Animal{

	String sensor = "������ �ߴ�";
	
	//�޼����� �������̵� : '�޼����� ������'�� �ǹ̸� ������.
	//��Ӱ����� ��ü���� �θ��� �޼��带 �ڽ��� ������ ����ϵ�
	//�̸��� �״�� �ΰ�, ���븸 ���� �ڽ�Ŭ������ ������ �µ��� ������ �ϴ� ��.
	@Override
	public int getLeg() {
		return 0;
	}
	
}
