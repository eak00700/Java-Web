package ex2_outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream( 
					                   "C:/web_14_java/fileOut.txt", true );
			
			String msg = "fileOutput 예제입니다\n";
			String msg2 = "여러줄도 가능";
			
			fos.write(msg.getBytes());//문자열 msg를 byte[]로 변경하는 메서드
			fos.write(msg2.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
	
}






