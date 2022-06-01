package ex3_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("C:/web_14_java/fileWriter예제.txt");
			
			fw.write("첫번째 줄 작성합니다 hehehe");
			fw.write("\n");
			fw.write("두번째 줄도 문제 없지 hehehe");
			
			fw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}









