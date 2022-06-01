package ex1_single_array;

public class Ex4_array {
	public static void main(String[] args) {
		//배열 arr에 담겨있는 모든 값의 합을 출력하시오
		//결과 : 150
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int result = 0;//배열의 모든 값을 더해서 저장해둘 변수
		
		for( int i = 0; i < arr.length; i++ ) {
			
			result += arr[i];
			
		}//for
		
		System.out.println("결과 : " + result);
	}//main
}



















