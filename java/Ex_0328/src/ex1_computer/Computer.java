package ex1_computer;

public class Computer {
	//컴퓨터의 대량생산을 위한 설계도를 만드는 작업
	
	//클래스의 구성 요소
	// 1) 멤버, 속성, 변수....
	// 2) 메서드, 기능, 함수....
	private String brand = "hansam";
	int ssd = 256;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";
	
	//컴퓨터의 모든 정보를 확인할 수 있는 메서드
	//메서드란 어떤 작업을 수행하기 위한 명령문들의 집합
	//반복적으로 사용되는 코드를 줄이기 위해서 반드시 필요한 개념
	public void getInfo() {
		System.out.println("brand : " + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color);		
		System.out.println("-----------------------------");
	}
	
	//메서드의 구성
	//접근제한자   반환형     메서드명( 파라미터, 인자, 매개변수, 아규먼츠 ){ 메서드의 실행 영역 }
	//public    void   getInfo() {  }
	
	//접근제한자
	//1) public : 같은 프로젝트 내의 모든 클래스에서 사용할수 있도록 허가
	//2) private : 현재 클래스 내에서만 사용할 수 있도록 제한
	//3) protected : 상속관계의 객체들에게만 사용을 허가
	//4) default: 같은 패키지 내에서만 사용을 허가
	
	
}














































