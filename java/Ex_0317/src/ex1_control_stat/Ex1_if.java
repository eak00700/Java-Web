package ex1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//1) 분기문 : if , switch
		//2) 반복문 : for , while
		
		//if문
		//if( 조건식 ){
		//	조건식이 참일 때 실행되는 영역
		//}
		
		int n = 51;
		
		//String은 쌍따옴표 안에 여러글자(문자열)를 저장할 수 있는 자료형
		String str = "";
		
		if( n == 50 ) {
			str = "n은 50입니다";
		}
		
		if( n != 50 ) {
			str = "n은 50이 아닙니다";
		}
		
		System.out.println(str);
		
	}//main
}



























