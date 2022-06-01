package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		//String클래스는 두 가지 특징을 가지고 있다.
		//1)객체 생성법이 두 가지(암시적, 명시적)
		//2)한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		String s1 = "abc";//암시적 객체생성
		String s2 = "abc";
		
		String s3 = new String("abc");//명시적 객체생성
		String s4 = new String("abc");
		
		// == 연산자는 기본자료형을 비교할때는 값을 비교한다
		// 그러나 객체끼리 비교할때는 주소를 비교하는 연산자로 기능이 바뀐다
		if(s1 == s3) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String s5 = sc.next();
		
		if( s5.equals( s1 ) ) {
			System.out.println("값을 같습니다");
		}else {
			System.out.println("값을 다릅니다");
		}
		
		System.out.println("--------------------");
		//불변의 특징
		
		String greet = "안녕";
		greet += "하세요";
		System.out.println( greet );
		
	}//main
}













