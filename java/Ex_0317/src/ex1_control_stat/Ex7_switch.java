package ex1_control_stat;

public class Ex7_switch {

	public static void main(String[] args) {
		//4월은 30일까지 있습니다
		
		int month = 9;
		
		switch( month ) {
		
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "월은 31일 까지");
			break;
			
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "월은 30일 까지");
			break;
		
		case 2:
			System.out.println("2월은 28일까지");
			break;
			
		}//switch
		
	}//main
	
}


















