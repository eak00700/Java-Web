package ex2_value_type;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		//자료형(기본자료형)
		/*
		 논리형 : boolean - 1bit
		 문자형 : char - 2byte
		 정수형 : byte - 1byte ........ -128 ~ 127
		 	    short - 2byte ....... -32768 ~ 32767
		 	    int - 4byte ......... -21억 ~ 21억
		 	    long - 8byte ........ -900경 ~ 900경
		 실수형 : float - 4byte
		        double - 8byte
		 */
		
		//변수 : 특정 값을 저장하기 위한 영역
		//변수선언의 규칙
		//자료형 변수명;(선언)
		//변수명 = 값;(대입)
		//자료형 변수명 = 값;(초기화)
		
		//변수명 표기 규칙
		//1)_를 제외한 특수문자를 포함할 수 없다
		//2) 한글 사용 금지
		//3) 변수의 첫글자는 반드시 소문자
		
		//논리형(boolean)
		//true, false 즉, 참과 거짓의 두가지 값만을 저장할 수 있다
		boolean b1;//선언
		b1 = true;//대입
		
		boolean b2 = false;//초기화
		b2 = true;		
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		System.out.println("-----------------------");
		
		//문자형(char)
		//홑따옴표 안에 딱 한글자만 저장 가능한 자료형
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		ch = 65 + 1;//아스키코드 66에 해당하는 알파벳 B를 저장
		System.out.println("ch : " + ch);
		
		System.out.println("------------------------");
		//정수(byte, short, int, long)
		byte i1 = 127;
		short i2 = 32767;
		int i3 = 2100000000;
		long i4 = 2200000000L;
		
		System.out.println(i4);
		
		System.out.println("-----------------------");
		
		float f = 3.14F;
		double d = 3.14;
		
		f = 100;
		d = 100;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
	}//main
	
}































































