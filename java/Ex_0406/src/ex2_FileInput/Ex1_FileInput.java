package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		//...Stream : byte기반의 스트림
		//...Reader, ...Writer : char기반의 스트림
		
		String path = "C:/web_14_java/test.txt";
		File f = new File(path);
		
		if( f.exists() ) {
			
			try {
				//파일클래스가 가진 경로로 접근하기 위한 입력스트림 생성
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				//read()메서드는 한번에 1byte씩 읽어오다가
				//더이상 읽어올 단어가 없다면 문장의 끝(End Of File)인 -1을 가져온다
				while( (code = fis.read()) != -1 ) {
					System.out.print( (char)code );
				}
				
				//스트림은 사용이 완료된 이후 close를 통해 닫아주는것이 좋다
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}













