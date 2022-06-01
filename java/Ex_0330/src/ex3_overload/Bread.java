package ex3_overload;

public class Bread {

	//method 1
	public void makeBread() {
		System.out.println("빵을 만들었습니다");
	} 

	//method 2
	public void makeBread(int n) {
		for( int i = 0; i < n; i++ ) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println("요청하신 " + n + "개의 빵을 만듦");
	}

	//method 3
	public void makeBread(int n, String name) {
		
		for( int i = 0; i < n; i++ ) {
			System.out.printf("%s을 만들었습니다\n", name);
		}
		
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다\n", n, name);
		
	}
	
}












