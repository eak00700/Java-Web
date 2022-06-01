package ex1_override;

public class CalMain {
	public static void main(String[] args) {
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println("plus : " + cp.getResult(10, 20));//30
		System.out.println("minus : " + cm.getResult(30, 10));//20
	}//main
}
