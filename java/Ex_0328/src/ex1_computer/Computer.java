package ex1_computer;

public class Computer {
	//��ǻ���� �뷮������ ���� ���赵�� ����� �۾�
	
	//Ŭ������ ���� ���
	// 1) ���, �Ӽ�, ����....
	// 2) �޼���, ���, �Լ�....
	private String brand = "hansam";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";
	
	//��ǻ���� ��� ������ Ȯ���� �� �ִ� �޼���
	//�޼���� � �۾��� �����ϱ� ���� ��ɹ����� ����
	//�ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� �ݵ�� �ʿ��� ����
	public void getInfo() {
		System.out.println("brand : " + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color);		
		System.out.println("-----------------------------");
	}
	
	//�޼����� ����
	//����������   ��ȯ��     �޼����( �Ķ����, ����, �Ű�����, �ƱԸ��� ){ �޼����� ���� ���� }
	//public    void   getInfo() {  }
	
	//����������
	//1) public : ���� ������Ʈ ���� ��� Ŭ�������� ����Ҽ� �ֵ��� �㰡
	//2) private : ���� Ŭ���� �������� ����� �� �ֵ��� ����
	//3) protected : ��Ӱ����� ��ü�鿡�Ը� ����� �㰡
	//4) default: ���� ��Ű�� �������� ����� �㰡
	
	
}














































