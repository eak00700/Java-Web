package ex2_control_stat;

public class Ex2_multiFor {
	public static void main(String[] args) {

		//����for�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���

		//0 1 2 3
		//0 1 2 3
		//0 1 2 3
		int i = 0;
		int j = 1;

		for( i = 0; i < 3; i++ ) {//y��

			for( j = 0; j < 4; j++) {//x��

				System.out.print(j + " ");

			}//inner

			System.out.println();//�ٹٲ�

		}//outer

		System.out.println("----------------------");

		//A B C D
		//A B C D
		//A B C D
		for(int k = 1; k <= 3; k++) {

			for( int l = 'A'; l <= 'D'; l++ ) {

				System.out.print( (char)l + " ");

			}//inner

			System.out.println();

		}//outer

		System.out.println("---------------------------");

		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';

		for( int k = 0; k < 3; k++ ) {

			for( int l = 0; l < 4; l++  ) {

				System.out.print( ch++ + " " );

			}//inner

			System.out.println();

		}//outer

		System.out.println("----------------------");

		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for( int k = 1; k <= 5; k++ ) {

			for( int l = 0; l < k; l++ ) {

				System.out.print("* ");

			}//inner

			System.out.println();

		}//outer

	}
}















