package ex1_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//메서드(기능, 함수) : 어떤 작업을 수행하기 위한 명령문들의 집합
		//반복적으로 사용되는 코드를 미리 정의해두고 필요할 때 마다 가져다가 사용할 수 있다.
		String str = "Hong Gil Dong";
		int idx = str.length();
		System.out.println("str의 길이 : " + idx);
		
		idx = str.indexOf('o');
		System.out.println("첫 문자 o의 위치 : " + idx);
		
		idx = str.lastIndexOf('o');
		System.out.println("마지막 문자 o의 위치 : " + idx);
		
		char res = str.charAt(5);
		System.out.println("5번째 위치의 문자 : " + res);
		
		String exam = "apple";
		if( exam.equals("apple") ) {
			System.out.println("exam은 apple입니다");
		}
		
		//대소문자를 무시하고 알파벳이 같으면 참
		if( exam.equalsIgnoreCase("Apple") ) {
			System.out.println("같습니다");
		}
		
		//trim():문자열 앞뒤의 의미없는 모든 공백을 제거
		String id = " abc ";
		if( "abc".equals(id.trim()) ) {
			System.out.println("로그인 성공");
		}
		
		//정수형태의 문자열을 실제 정수로 바꿔주는 메서드 -> Integer.parseInt()
		String number = "100";
		int num = Integer.parseInt(number);
		System.out.println(num + 5);
		
		//기본자료형의 wrapper클래스
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






















