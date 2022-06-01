package ex3_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//test.txt의 내용을 읽어서
		//내용에 대문자와 소문자의 갯수를 출력하시오
		
		//대문자 : 7
		//소문자 : 22
		
		int upper = 0;//대문자 갯수
		int lower = 0;//소문자 갯수
		
		try {
			FileReader fr = new FileReader("C:/web_14_java/test.txt");
			
			int code = 0;
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main
}













