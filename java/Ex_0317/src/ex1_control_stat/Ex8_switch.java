package ex1_control_stat;

public class Ex8_switch {
	public static void main(String[] args) {
		//10 - 5 = 5 
		
		int su1 = 10;
		int su2 = 5;
		String op = "*";
		
		switch( op ) {
		case "+":
			System.out.println(su1 + " + " + su2 + " = " + (su1 + su2));
			break;
		
		case "-":
			System.out.println(su1 + " - " + su2 + " = " + (su1 - su2));
			break;
			
		case "*":
			System.out.println(su1 + " * " + su2 + " = " + (su1 * su2));
			break;
			
		case "/":
			System.out.println(su1 + " / " + su2 + " = " + (su1 / su2));
		}//switch
		
	}//main
}
















