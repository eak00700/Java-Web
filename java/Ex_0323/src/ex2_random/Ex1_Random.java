package ex2_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		//Random : ���� ������ ���� Ŭ����
		
		//2314 ~ 8172������ ������ ����
		//new Random().nextInt(�߻���ų ������ ����) + ���ۼ�;
		//new Random().nextInt( �� �� - ���ۼ� + 1 ) + ���ۼ�;
		int rnd = new Random().nextInt(8172 - 2314 + 1) + 2314;
		System.out.println("���� : " + rnd);
		
	}//main
}


















