package ex1_setter_getter;

public class Computer {
	//setter & getter
	//private���� ������� ������ ���� �����ϰų� �������� ���� �� ����ϴ� �޼����� ����
	
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



























