package ex4_printf;

public class Ex1_printf {
	public static void main(String[] args) {

		int age = 30;
		// ���� ���̴� 30�� �Դϴ�
		System.out.printf("���� ���̴� %d�� �Դϴ�\n", age);

		// ���� ���̴� 30�� �̰�, Ű�� 170�Դϴ�
		System.out.printf("���� ���̴� %d�� �̰�, Ű�� %d�Դϴ�\n", 30, 170);

		// 3 * 1 = 3
		System.out.printf("%d * %d = %d\n", 3, 1, (3 * 1));

		// ���̴� 20�̰� �������� A�� �Դϴ�
		System.out.printf("���̴� %d�̰� �������� %c�� �Դϴ�\n", 20, 'A');

		// �̸��� ȫ�浿 �̰� Ű�� 170.3�Դϴ�
		System.out.printf("�̸��� %s�̰� Ű�� %.2f�Դϴ�\n", "ȫ�浿", 170.3f);

		//2022-03-21
		System.out.printf("%d-%02d-%02d\n", 2022, 3, 21);
		
		/*
		 formatter�� Ÿ�� ���� Ű����
		 %d : ����
		 %c : ����
		 %f : �Ǽ�
		 %s : ���ڿ�
		 */
		
	}// main
}












