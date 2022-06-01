package ex1_control_stat;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		//if-else문
		//if( 조건식 ){
		//	조건식이 참일때 실행되는 영역
		//}else{
		//	조건식이 거짓일 때 실행되는 영역
		//}
		
		int n = 50;
		String s = "";
		
		if( n++ >= 50 ) {
			s = "n은 50이상의 수";
			
		}else{
			s = "n은 50미만의 수";
			
		}
		
		System.out.println( s );
		
		System.out.println("-------------------------");
		
		//변수 age에 나이를 대입하고 30세 이상이면
		//'드실만큼 드셨군요'를, 그렇지 않으면 '더 드셔도 될듯ㅋ'을
		//출력하는 코드를 작성하시오
		int age = 21;
		
		if( age >= 30 ) {
			System.out.println("드실만큼 드셨군요");
			
		}else {
			System.out.println("더 드셔도 돼요");
			
		}		

		System.out.println("-------------------------");
		
		//위의 코드를 삼항연산자로 변경하여 작성하시오
		String str = age >= 30 ? "드실만큼..." : "더 드셔도...";
		System.out.println(str);
		
	}//main
}


















































