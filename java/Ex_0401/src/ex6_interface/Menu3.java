package ex6_interface;

public interface Menu3 extends Menu1, Menu2{
	
	//인터페이스는 자체 구현능력이 전혀 없기 때문에 인터페이스간 다중상속이 가능하다
	String boggembab();
	String yusanseul();
	
}
