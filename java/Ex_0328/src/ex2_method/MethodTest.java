package ex2_method;

public class MethodTest {
	
	public void test1() {
		System.out.println("test1() 메서드를 호출함");
	}

	
	public void value( int n ) {
		n++;
		System.out.println("value() 메서드 : " + n);
	}
	
	//반환형은 모든 기본자료형과 모든 클래스 타입으로 지정이 가능
	public String exam( int n1, int n2 ) {
		
		System.out.println(n1 + n2);
		
		//반환형이 void가 아닌 모든 경우에는
		//최소한 한개의 return코드가 작성되어야 한다
		return "안녕";//반환형과 return타입은 반드시 일치해야 한다
	}
	
	public int exam2( char c ) {
		System.out.println(c);
		
		//return코드 아래쪽에는 어떤 코드도 추가될 수 없다
		return c;
		//System.out.println();
	}
	
}











