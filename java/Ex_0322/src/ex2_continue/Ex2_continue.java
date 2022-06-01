package ex2_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		int n = 0;
		
		while( n < 10 ) {
			
			n++;
			
			if( n % 2 == 0 ) {
				//while문에서 continue를 만나면 조건식으로 이동
				continue;
			}
			
			System.out.println(n);
			
		}
		
		System.out.println("---------------------");
		
		n = 0;
		
		while( n < 10 ) {
			
			n++;
			
			switch( n ) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				break;//반복문이 아닌 스위치문만 빠져나간다
				
			case 2:
				System.out.println("switch문 2번 거쳐감");
				continue;
				
			}//switch
			
			System.out.println(n);
			
		}//while
		
	}//main
}



















