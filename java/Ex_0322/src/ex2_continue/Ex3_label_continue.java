package ex2_continue;

public class Ex3_label_continue {

	public static void main(String[] args) {
		
		//label : 특정 반복문에 이름표를 붙여 한번에 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드
		out: for (int i = 1; i <= 3; i++) {
			
			for (int j = 1; j <= 10; j++) {

				if (j % 2 == 0) {
					//label을 가진 for문의 증감식으로 이동
					continue out;
				}

				System.out.print(j + " ");

			} // inner

			System.out.println();

		} // outer
		
	}//main
	
}







































