package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("res : " + res);
		
		res = n1 >= n2;
		System.out.println("res : " + res);
		
		res = n1 == n2;// == : 두 변수의 값이 같은지 판단
		System.out.println("res : " + res);
		
		res = n1 != n2;// != : 두 변수의 값이 다른지 판단
		System.out.println("res : " + res);
		
		System.out.println("----------------------");
		
		//논리연산자
		//비교 연산자를 통한 연산이 두 개 이상 필요할 때 사용
		int age = 21;
		int limit = 25;
		
		//&&(and) 연산자 : 앞의 연산이 거짓이면 뒤의 연산을 수행하지 않는다
		//참 && 참 = 참
		//참 && 거짓 = 거짓
		//거짓 && 참 = 거짓
		//거짓 && 거짓 = 거짓
		res = limit - age >= 5 && (age += 2) > 20;	
		System.out.println(age);
		System.out.println("&&연산 : " + res);
		
		//||(or) 연산자 : 앞의 연산이 true라면 뒤쪽의 연산을 수행하지 않는다
		//참 || 참 = 참
		//참 || 거짓 = 참
		//거짓 || 참 = 참
		//거짓 || 거짓 = 거짓
		int i1 = 10;
		int i2 = 20;
		res = ( i1 += 10 ) > 20 || i2 - 10 == 11;
		System.out.println("||연산 : " + res);
		
		//!(not)연산자 
		//참은 거짓으로, 거짓은 참으로 일시적으로 값을 바꿔주는 연산자
		System.out.println("!연산 : " + !res);
		System.out.println( res );
		
	}//main
}










































