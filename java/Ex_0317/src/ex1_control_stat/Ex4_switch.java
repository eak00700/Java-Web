package ex1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		
		//switch : �񱳰��� ���ǰ��� ���� ����� ����ϴ� ���
		//switch( �񱳰� ){
		//	case ���ǰ�:
		//		�񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		//		break;
		//}
		
		int n = 5;
		
		//1) �񱳰��� ���ǰ��� Ÿ���� �ݵ�� ��ġ�ؾ� �Ѵ�
		//2) �ߺ��Ǵ� ���ǰ��� ���� �� ����
		
		switch( n ) {//�񱳰�
		case 1://���ǰ�
			System.out.println("���ӽ���");
			break;//���� switch���� ���������� Ű����
			
		case 2:
			System.out.println("���ӼҰ�");
			break;
			
		case 3:
			System.out.println("��������");
			break;
			
		default:
			//�񱳰��� ���ǰ��� ��ġ�ϴ°��� �Ѱ��� ���� ���
			//�ݵ�� ����Ǵ� ����
			System.out.println("1 ~ 3 ������ ���� �Է��ϼ���");
			break;
		}//switch
		
	}//main
}





























