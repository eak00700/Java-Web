package ex2_outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream( 
					                   "C:/web_14_java/fileOut.txt", true );
			
			String msg = "fileOutput �����Դϴ�\n";
			String msg2 = "�����ٵ� ����";
			
			fos.write(msg.getBytes());//���ڿ� msg�� byte[]�� �����ϴ� �޼���
			fos.write(msg2.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
	
}






