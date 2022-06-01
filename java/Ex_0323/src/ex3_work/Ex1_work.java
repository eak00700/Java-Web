package ex3_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다
		//단 3450, 2100, 60과 같이 1의자리 숫자는 반드시 0이 되도록 한다
		
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지를 판단하는 코드를 작성
		//가능한한 적은 수의 동전을 사용하도록 한다
		
		//4170
		//500원 : 8
		//100원 : 1
		//50원 : 1
		//10원 : 2
		
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt( 500 ) + 1;
		money *= 10;
		System.out.println("금액 : " + money);
		
		
	}//main
}








