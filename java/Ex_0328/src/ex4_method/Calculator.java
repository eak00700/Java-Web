package ex4_method;

public class Calculator {
	public void getResult( int n1, int n2, String op ) {
		
		int res1 = 0;
		float res2 = 0;
		
		switch( op ){
			
		case "+":
			res1 = n1 + n2;
			break;
		
		case "-":
			res1 = n1 - n2;
			break;
			
		case "/":
			res2 = (float)n1 / n2;
			break;
			
		}//switch
		
		if(!op.equals("/")) {
			System.out.println("��� : " + res1);
		}else {
			System.out.printf("��� : %.1f", res2);
		}
		
	}
}








