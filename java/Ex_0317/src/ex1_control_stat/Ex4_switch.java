package ex1_control_stat;

public class Ex4_switch {
	public static void main(String[] args) {
		
		//switch : 비교값과 조건값을 통해 결과를 출력하는 제어문
		//switch( 비교값 ){
		//	case 조건값:
		//		비교값과 조건값이 일치하는 경우 실행되는 영역
		//		break;
		//}
		
		int n = 5;
		
		//1) 비교값과 조건값의 타입은 반드시 일치해야 한다
		//2) 중복되는 조건값을 가질 수 없다
		
		switch( n ) {//비교값
		case 1://조건값
			System.out.println("게임시작");
			break;//현재 switch문을 빠져나오는 키워드
			
		case 2:
			System.out.println("게임소개");
			break;
			
		case 3:
			System.out.println("게임종료");
			break;
			
		default:
			//비교값과 조건값이 일치하는것이 한개도 없는 경우
			//반드시 실행되는 영역
			System.out.println("1 ~ 3 사이의 값만 입력하세요");
			break;
		}//switch
		
	}//main
}





























