package ex1_control_stat;

public class Ex7_switch {

	public static void main(String[] args) {
		//4���� 30�ϱ��� �ֽ��ϴ�
		
		int month = 9;
		
		switch( month ) {
		
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "���� 31�� ����");
			break;
			
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "���� 30�� ����");
			break;
		
		case 2:
			System.out.println("2���� 28�ϱ���");
			break;
			
		}//switch
		
	}//main
	
}


















