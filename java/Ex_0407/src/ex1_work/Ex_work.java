package ex1_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex_work {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java/file.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		try {
			if( f.exists() ) {
				FileInputStream fis = new FileInputStream(f);
				fis.read( read );//fis가 읽어온 내용을 byte배열에 저장
				
				//read배열을 String타입으로 변경
				String ori = new String(read);
				String rev = "";
				//String rev = null;
				
				//원본문자열인 ori를 뒤집어서 rev객체에 저장
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}//for
				
				if( ori.equals(rev) ) {
					System.out.println(ori + " - 회문수");
				}else {
					System.out.println(ori + " - 안회문수");
				}
				
				fis.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}
























