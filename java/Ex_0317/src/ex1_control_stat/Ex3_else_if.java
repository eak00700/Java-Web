package ex1_control_stat;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if문 : 여러개의 조건비교가 필요한 경우 사용
		//if( 조건식1 ){
		//	조건식1이 참일때 실행되는 영역
		//}else if( 조건식2 ){
		//	조건식2가 참일때 실행되는 영역
		//}else{
		//	위의 모든 조건이 거짓일때 반드시 실행되는 영역
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
			//위에 준비해둔 모든 조건이 거짓일때
			//마지막에 반드시 거쳐가는 영역
			str = "F";
		}
		
		System.out.println(str);
	}//main
}











