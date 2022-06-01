package ex1_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//demotion : 작은 자료형에 큰 자료형이 대입되는 것(자동X)
		char c = 'A'; //2byte
		int n = c + 1; //4byte
		c = (char)n;
		System.out.println("c : " + c);
		
		float f = 5.5f; //4.x 
		int i = 0;//4
		i = (int)f;
		System.out.println("i : " + i);
		
		int num = 10;
		System.out.println( (float)num );
		
	}//main
}















































