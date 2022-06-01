package ex5_method;

import java.util.Random;

public class UpdownClass {

	int random = new Random().nextInt(50) + 1;
	int count = 0;
	
	//사용자가 입력한 값이 up인지, down인지, 정답인지를 판단하는 메서드
	public String check( int n ){
		
		count++;
		
		if( n < random ) {
			System.out.println("UP");
			
		}else if( n > random ) {
			System.out.println("DOWN");
			
		}else {
			System.out.println(count + "회 만에 정답!!");
			return "정답";
		}
		
		return "오답";
	}//check()
	
}













