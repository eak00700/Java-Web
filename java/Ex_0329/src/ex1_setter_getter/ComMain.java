package ex1_setter_getter;

public class ComMain {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.setSsd(1024);
		com.setBrand("LG");

		
		System.out.println(com.getBrand());
		System.out.println(com.getSsd());
		
	}//main
}
