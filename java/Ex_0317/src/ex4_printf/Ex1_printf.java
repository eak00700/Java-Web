package ex4_printf;

public class Ex1_printf {
	public static void main(String[] args) {

		int age = 30;
		// 저의 나이는 30세 입니다
		System.out.printf("저의 나이는 %d세 입니다\n", age);

		// 저의 나이는 30세 이고, 키는 170입니다
		System.out.printf("저의 나이는 %d세 이고, 키는 %d입니다\n", 30, 170);

		// 3 * 1 = 3
		System.out.printf("%d * %d = %d\n", 3, 1, (3 * 1));

		// 나이는 20이고 혈액형은 A형 입니다
		System.out.printf("나이는 %d이고 혈액형은 %c형 입니다\n", 20, 'A');

		// 이름은 홍길동 이고 키는 170.3입니다
		System.out.printf("이름은 %s이고 키는 %.2f입니다\n", "홍길동", 170.3f);

		//2022-03-21
		System.out.printf("%d-%02d-%02d\n", 2022, 3, 21);
		
		/*
		 formatter의 타입 저장 키워드
		 %d : 정수
		 %c : 문자
		 %f : 실수
		 %s : 문자열
		 */
		
	}// main
}












