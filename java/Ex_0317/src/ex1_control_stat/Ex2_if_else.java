package ex1_control_stat;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else��
		//if( ���ǽ� ){
		//	���ǽ��� ���϶� ����Ǵ� ����
		//}else{
		//	���ǽ��� ������ �� ����Ǵ� ����
		//}
		
		int n = 50;
		String s = "";
		
		if( n++ >= 50 ) {
			s = "n�� 50�̻��� ��";
			
		}else{
			s = "n�� 50�̸��� ��";
			
		}
		
		System.out.println( s );
		
		System.out.println("-------------------------");
		
		//���� age�� ���̸� �����ϰ� 30�� �̻��̸�
		//'��Ǹ�ŭ ��̱���'��, �׷��� ������ '�� ��ŵ� �ɵ�'��
		//����ϴ� �ڵ带 �ۼ��Ͻÿ�
		int age = 21;
		
		if( age >= 30 ) {
			System.out.println("��Ǹ�ŭ ��̱���");
			
		}else {
			System.out.println("�� ��ŵ� �ſ�");
			
		}		

		System.out.println("-------------------------");
		
		//���� �ڵ带 ���׿����ڷ� �����Ͽ� �ۼ��Ͻÿ�
		String str = age >= 30 ? "��Ǹ�ŭ..." : "�� ��ŵ�...";
		System.out.println(str);
		
	}//main
}


















































