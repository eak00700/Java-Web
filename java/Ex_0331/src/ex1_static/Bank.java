package ex1_static;

public class Bank {
	//static : 객체가 아무리 많이 생성되어도
	//메모리상에 딱 한개만 만들어지는 변수나 메서드
	private String name = "우리은행";
	private String point;
	private String tel;
	static float interest = 10f;//이자율
	
	public Bank( String point, String tel ) {
		this.point = point;
		this.tel = tel;
	}
	
	//결과출력용 메서드
	public void wooriBank() {
		System.out.println("이름 : " + name);
		System.out.println("위치 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("-------------------");
	}
	
}













