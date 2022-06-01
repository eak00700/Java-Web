package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 비교할 수 있어야 한다
		int a = 10;
		System.out.println( "a : " + ++a );
		
		int b = 10;
		System.out.println( "b : " + b++ );
		System.out.println(b);
		
		--b;
		--b;
		b--;
		b++;
		++b;
		--b;
		b++;
		b--;
		System.out.println(b++);

		//삼항(조건)연산자
		//하나의 조건을 주고, 그 조건이 참일때와 거짓일때에 따라
		//다른 결과값을 반환해주는 연산자
		int i1 = 10;
		int i2 = 15;
		boolean res = ++i1 >= i2 ? true : false; 
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = ( n1 += n1 ) == n2 && n1 > 10 ? 'A' : 'B';
		System.out.println(res2);
		
		System.out.println("--------------------------");
		
		a = 10;
		b = 12;
		int num = ++a >= b || 2 + (a - 4) <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0;
		System.out.println(num);                                                               
		
	}//main
}



















