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
				fis.read( read );//fis�� �о�� ������ byte�迭�� ����
				
				//read�迭�� StringŸ������ ����
				String ori = new String(read);
				String rev = "";
				//String rev = null;
				
				//�������ڿ��� ori�� ����� rev��ü�� ����
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}//for
				
				if( ori.equals(rev) ) {
					System.out.println(ori + " - ȸ����");
				}else {
					System.out.println(ori + " - ��ȸ����");
				}
				
				fis.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}
























