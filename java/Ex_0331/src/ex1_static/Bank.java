package ex1_static;

public class Bank {
	//static : ��ü�� �ƹ��� ���� �����Ǿ
	//�޸𸮻� �� �Ѱ��� ��������� ������ �޼���
	private String name = "�츮����";
	private String point;
	private String tel;
	static float interest = 10f;//������
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
	}
	
	//�����¿� �޼���
	public void wooriBank() {
		System.out.println("�̸� : " + name);
		System.out.println("��ġ : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ : " + interest + "%");
		System.out.println("-------------------");
	}
	
}













