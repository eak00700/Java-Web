package ex3_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		//���� ��������ϴ�   <----- method 1�� ȣ���ؼ� ���� ���
		//------------------
		
		//���� ��������ϴ� <----- method 2�� ȣ���ؼ� ���� ���
		//���� ��������ϴ�
		//��û�Ͻ� 2���� ���� ��������ϴ�
		//------------------
		
		//ũ������ ��������ϴ�  <---- method 3�� ȣ���ؼ� ���� ���
		//ũ������ ��������ϴ�
		//��û�Ͻ� 2���� ũ������ ��������ϴ�
		Bread bread = new Bread();
		bread.makeBread();
		
		System.out.println("-------------");
		
		bread.makeBread(3);
		
		System.out.println("--------------");
		
		bread.makeBread(2, "���ڻ�");
	}//main
}










