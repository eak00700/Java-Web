package ex1_control_stat;

public class Ex5_switch {
	public static void main(String[] args) {

		char ch = 'B';

		switch( ch ) {//비교값
		case 'A'://조건값
			System.out.println("90이상");
			//break;

		case 'B':
			System.out.println("80 ~ 89");
			break;

		case 'C':
			System.out.println("70 ~ 79");
			break;

		case 'D':
			System.out.println("60 ~ 69");
			break;

		case 'F':
			System.out.println("59점 이하");
			break;

		default:
			System.out.println("성적이 올바르게 입력되지 않았습니다");
			break;
		}//switch

	}//main
}







