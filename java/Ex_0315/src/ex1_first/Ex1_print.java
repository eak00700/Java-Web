package ex1_first;

public class Ex1_print {

	public static void main(String[] args) { 
		//주석 : 컴파일시에 컴퓨터(JVM)는 인지하지 못하는 
		//개발자들간의 메모등을 위해 작성하는 코드
		
		//main() : 메인 메서드  -> 컴파일시 가장 먼저 실행되는 영역
		System.out.println(100);
		System.out.println(150 + 50);
		System.out.println("안녕하세요");
		
		//문자열("") 뒤의 +기호는 더한다의 의미가 아닌 '이어붙인다'의 의미로 사용
		System.out.println("hi" + 10);
		
		System.out.println("2 + 2 = " + 2 + 2 );
		System.out.println("2 + 2 = " + (2 + 2) );
		
		System.out.println(10 + 5 + ":" + 10 + 5);
		
	}
	
}


































