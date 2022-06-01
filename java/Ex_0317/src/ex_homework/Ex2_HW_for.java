package ex_homework;

public class Ex2_HW_for {
	public static void main(String[] args) {
		
		//2중 for문을 사용하여 아래의 결과를 출력하시오
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//    ..........
		//10 1 2 3 4 5 6 7 8 9
		for( int i = 1; i <= 10; i++ ) {
			
			for( int j = 0; j < 10; j++ ) {
				
				int num = i + j;
				
				if( num > 10 ) {
					num -= 10;
				}
				
				System.out.printf("%d ", num);
				
			}//inner
			
			System.out.println();
			
		}//outer
				
		System.out.println("------------------------");
		
		//2중 for문을 사용하여 아래의 결과를 출력하시오
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		for( int i = 0; i < 5; i++ ) {
			
			for( int j = 0; j < i+5; j++ ) {
				
				if( i + j > 3 ) {
					System.out.printf("* ");
				}else {
					System.out.printf("  ");
				}
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}











