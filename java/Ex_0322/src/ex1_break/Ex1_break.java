package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		
		//break문 : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나갈 때 사용
		
		for( int i = 1; i <= 2; i++ ) {
			
			for( int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					//가장 가까운 반복문을 강제로 탈출
					//break코드를 만나는 순간 반복문을 통째로 빠져나가기 때문에
					//break코드 바로 아래에는 어떠한 코드도 작성될 수 없다.
					break;
					//System.out.println();
				}
				
				System.out.printf("%d ", j);
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}











