package ex2_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		//Random : 난수 생성을 위한 클래스
		
		//2314 ~ 8172사이의 난수를 생성
		//new Random().nextInt(발생시킬 난수의 범위) + 시작수;
		//new Random().nextInt( 끝 수 - 시작수 + 1 ) + 시작수;
		int rnd = new Random().nextInt(8172 - 2314 + 1) + 2314;
		System.out.println("난수 : " + rnd);
		
	}//main
}


















