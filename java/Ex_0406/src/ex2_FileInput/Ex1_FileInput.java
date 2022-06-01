package ex2_FileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		//...Stream : byte����� ��Ʈ��
		//...Reader, ...Writer : char����� ��Ʈ��
		
		String path = "C:/web_14_java/test.txt";
		File f = new File(path);
		
		if( f.exists() ) {
			
			try {
				//����Ŭ������ ���� ��η� �����ϱ� ���� �Է½�Ʈ�� ����
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				//read()�޼���� �ѹ��� 1byte�� �о���ٰ�
				//���̻� �о�� �ܾ ���ٸ� ������ ��(End Of File)�� -1�� �����´�
				while( (code = fis.read()) != -1 ) {
					System.out.print( (char)code );
				}
				
				//��Ʈ���� ����� �Ϸ�� ���� close�� ���� �ݾ��ִ°��� ����
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}













