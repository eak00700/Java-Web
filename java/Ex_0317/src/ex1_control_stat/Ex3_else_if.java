package ex1_control_stat;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if�� : �������� ���Ǻ񱳰� �ʿ��� ��� ���
		//if( ���ǽ�1 ){
		//	���ǽ�1�� ���϶� ����Ǵ� ����
		//}else if( ���ǽ�2 ){
		//	���ǽ�2�� ���϶� ����Ǵ� ����
		//}else{
		//	���� ��� ������ �����϶� �ݵ�� ����Ǵ� ����
		//}
	
		int num = 75;
		String str = "";
		
		if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ) {
			str = "B";
		}else if( num >= 70) {
			str = "C";
		}else if( num >= 60 ) {
			str = "D";
		}else {
			//���� �غ��ص� ��� ������ �����϶�
			//�������� �ݵ�� ���İ��� ����
			str = "F";
		}
		
		System.out.println(str);
	}//main
}











