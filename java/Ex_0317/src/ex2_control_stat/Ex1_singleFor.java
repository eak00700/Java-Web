package ex2_control_stat;

public class Ex1_singleFor {

	public static void main(String[] args) {
		
		//반복문 : 특정수행문을 원하는 만큼 반복할 수 있도록 해주는 제어문
		
		//for( 초기식; 조건식; 증감식 ){
		//	조건식이 참일때 실행되는 영역
		//}
		
		for( int i = 0; i < 3; i++ ) {
			//지역변수인 i는 for문 내에서 생성되었기 때문에
			//현재 for문을 벗어나면 활용할 수 없게 된다
			System.out.println(i);
			
		}
		
		System.out.println("---------------------");
		
		for( int i = 1; i < 3; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		//10 부터 1까지 감소하는 값을 출력하는 for문을 작성
		for( int i = 10; i > 0; i-- ) {
			System.out.println(i);
		}
		
	}//main
	
}









