package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		
		MethodTest m1 = new MethodTest();
		m1.test1();
		
		int su = 10;
		m1.value(su);
		
		System.out.println("su : " + su);
		
		System.out.println("-------------------------");
		
		int i1 = 10;
		int i2 = 5;
		String res = m1.exam(i1, i2);
		System.out.println(res);
		
		int r = m1.exam2('B');
		System.out.println(r);
	}//main
}














