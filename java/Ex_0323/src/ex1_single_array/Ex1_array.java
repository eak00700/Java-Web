package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : 같은 자료형끼리 모아둔 하나의 묶음
		//효율적인 자료관리를 위해 반드시 필요
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		//1) 배열 선언
		int[] arr; 
		
		//2) 배열 생성
		//배열의 index수 갯수는 처음 지정해둔 갯수에서 강제로 늘리거나 줄일 수 없다
		arr = new int[6];
		
		//3) 배열 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//arr.length : 배열의 방 갯수
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//for
		
	}//main
}














