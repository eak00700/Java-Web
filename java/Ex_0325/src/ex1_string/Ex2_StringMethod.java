package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//�޼���(���, �Լ�) : � �۾��� �����ϱ� ���� ��ɹ����� ����
		//�ݺ������� ���Ǵ� �ڵ带 �̸� �����صΰ� �ʿ��� �� ���� �����ٰ� ����� �� �ִ�.
		String str = "Hong Gil Dong";
		int idx = str.length();
		System.out.println("str�� ���� : " + idx);
		
		idx = str.indexOf('o');
		System.out.println("ù ���� o�� ��ġ : " + idx);
		
		idx = str.lastIndexOf('o');
		System.out.println("������ ���� o�� ��ġ : " + idx);
		
		char res = str.charAt(5);
		System.out.println("5��° ��ġ�� ���� : " + res);
		
		String exam = "apple";
		if( exam.equals("apple") ) {
			System.out.println("exam�� apple�Դϴ�");
		}
		
		//��ҹ��ڸ� �����ϰ� ���ĺ��� ������ ��
		if( exam.equalsIgnoreCase("Apple") ) {
			System.out.println("�����ϴ�");
		}
		
		//trim():���ڿ� �յ��� �ǹ̾��� ��� ������ ����
		String id = " abc ";
		if( "abc".equals(id.trim()) ) {
			System.out.println("�α��� ����");
		}
		
		//���������� ���ڿ��� ���� ������ �ٲ��ִ� �޼��� -> Integer.parseInt()
		String number = "100";
		int num = Integer.parseInt(number);
		System.out.println(num + 5);
		
		//�⺻�ڷ����� wrapperŬ����
		//int -> Integer
		//char -> Character
		//boolean -> Boolean
		//byte -> Byte
		//short -> Short
		//long -> Long
		//float -> Float
		//double -> Double
		
	}//main
}






















