package ex3_scanner;

//다른 패키지에 있는 클래스를 현재 패키지에서도 사용 가능하도록 허락을 받는 개념(import)
import java.util.Scanner;//ctrl + shift + o <--- 자동 import

public class Ex1_Scanner {

	public static void main(String[] args) {
		
		//Scanner 클래스 : 키보드에서 값을 직접 입력받아 변수에 저장할 수 있도록 해 주는 클래스
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 : ");
		
		//키보드에서 int타입의 값을 받고 엔터를 치는 순간
		//num변수에 사용자가 입력받은 값을 대입해줌
		int num = sc.nextInt();//키보드에서 입력받은 정수를 저장하는 기능
		
		System.out.println("입력받은 값 : " + num);
		
		System.out.println("문장 : ");
		String str = sc.next();//키보드에서 입력받은 문장을 저장하는 기능
		System.out.println(str);
		
	}//main
	
}





























