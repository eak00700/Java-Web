package ex1_setter_getter;

public class Computer {
	//setter & getter
	//private으로 만들어진 변수의 값을 변경하거나 가져오고 싶을 때 사용하는 메서드의 개념
	
	private String brand = "gumsung";
	private int ssd = 512;
	
	public int getSsd(){
		return ssd;
	}
	
	public void setSsd( int a ) {
		ssd = a;
	}
	
	public void setBrand( String a ) {
		brand = a;
	}
	
	public String getBrand() {
		return brand;
	}
}



























