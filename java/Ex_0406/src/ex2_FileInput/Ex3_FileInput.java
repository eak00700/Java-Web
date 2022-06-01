package ex2_FileInput;

import java.io.IOException;
import java.util.Scanner;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		byte[] keyboard = new byte[100];
		
		try {
			System.out.print("°ª : ");
			System.in.read( keyboard );
			
			String s = new String(keyboard).trim();
			
			System.out.println( s );
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			//sc.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}






