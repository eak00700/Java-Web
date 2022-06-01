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
				
				//���� byte[]�� read���� test.txt���� �о�� �����͵��� ����Ǿ� �ִ�.
				//�̸� ���ڿ� ���·� �������Ͽ� ����� �� �ִ�.
				String res = new String(read);
				
				System.out.println(res);
				
				//��Ʈ�� ����� �Ϸ��� �ڿ��� �ݵ�� �ݾ�����!!
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//main
}













