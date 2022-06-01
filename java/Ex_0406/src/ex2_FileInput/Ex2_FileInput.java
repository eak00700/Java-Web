package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java/test.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		if( f.exists() ) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read( read );
				
				//현재 byte[]인 read에는 test.txt에서 읽어온 데이터들이 저장되어 있다.
				//이를 문자열 형태로 재조합하여 출력할 수 있다.
				String res = new String(read);
				
				System.out.println(res);
				
				//스트림 사용을 완료한 뒤에는 반드시 닫아주자!!
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}













