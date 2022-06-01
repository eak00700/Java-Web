package ex5_method;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UpdownClass uc = new UpdownClass();
		
		while(true) {
			
			//키보드에서 정답이라고 생각되는 값을 UpdownClass에게 보내준다.
			//UpdownClass의 check()메서드가 정답인지 오답인지를 판별한 데이터를 받는다
			//정답을 입력받았을 때 break를 통해서 현재 while문을 빠져나오기!!
			System.out.print("값 : ");
			int num = sc.nextInt();
			
			String res = uc.check(num);
			
			if( res.equals("정답") ) {
				break;
			}
			
		}//while
		
	}//main
}








