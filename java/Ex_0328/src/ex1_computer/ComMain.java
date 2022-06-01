package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		//private변수는 외부클래스에서 접근이 불가
		//c1.brand = "에이수스";
		c1.getInfo();
		
		Computer c2 = new Computer();
		c2.ram = 32;
		c2.getInfo();
		
		
	}//main
}







