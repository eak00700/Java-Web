package ex3_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		//char기반의 스트림은 Reader, Writer의 자식 클래스들을 사용
		//기본적으로 2byte를 지원하기 때문에 2byte언어로 구성된 파일도 쉽게 입출력이 가능
		
		try {
			FileReader fr = new FileReader("C:/web_14_java/test.txt");
			int code = 0;
			
			while( (code = fr.read()) != -1) {
				System.out.print( (char)code );
			}
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}












