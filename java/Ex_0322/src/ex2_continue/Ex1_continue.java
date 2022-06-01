package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		
		//continue문 : 반복분 내에서 특정 문장을 건너뛰고자 할 때
		
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					//for문에서의 continue문은 가장 가까운 for문의 증감식으로 전환
					//단, 증감식이 없을 경우 조건식으로 이동
					continue;
				}
				
				
				System.out.print( j + " " );
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
































