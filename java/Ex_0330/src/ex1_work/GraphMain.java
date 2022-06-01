package ex1_work;

import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		
		int[] nArr = new int[10];
		for( int i = 0; i < 100; i++ ) {
			//0~9사이의 난수
			int r = new Random().nextInt(10);
			System.out.print(r);
			nArr[r]++;
			
		}//for
		
		System.out.println();
		
		PrintGraph pg = new PrintGraph();
		pg.print(nArr);
		
	}//main
}









