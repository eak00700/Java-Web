package ex1_control_stat;

public class Ex5_switch {
	public static void main(String[] args) {

		char ch = 'B';

		switch( ch ) {//�񱳰�
		case 'A'://���ǰ�
			System.out.println("90�̻�");
			//break;

		case 'B':
			System.out.println("80 ~ 89");
			break;

		case 'C':
			System.out.println("70 ~ 79");
			break;

		case 'D':
			System.out.println("60 ~ 69");
			break;

		case 'F':
			System.out.println("59�� ����");
			break;

		default:
			System.out.println("������ �ùٸ��� �Էµ��� �ʾҽ��ϴ�");
			break;
		}//switch

	}//main
}







