package ex1_control_stat;

public class Ex6_switch {
	public static void main(String[] args) {
		
		//switch문의 비교값으로 사용 가능한 자료형
		//1) 정수(byte, short, int)
		//2) 문자(char)
		//3) 문자열(String)
		
		String name = "홍";
		
		switch( name ) {//비교값
		case "박"://조건값
			System.out.println("박길동");
			break;
			
		case "홍":
			System.out.println("홍길동");
			break;
			
		case "독고":
			System.out.println("독고길동");
			break;
		
		}//switch
		
	}//main
}











