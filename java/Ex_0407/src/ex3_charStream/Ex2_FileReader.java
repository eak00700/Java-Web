package ex3_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//test.txt�� ������ �о
		//���뿡 �빮�ڿ� �ҹ����� ������ ����Ͻÿ�
		
		//�빮�� : 7
		//�ҹ��� : 22
		
		int upper = 0;//�빮�� ����
		int lower = 0;//�ҹ��� ����
		
		try {
			FileReader fr = new FileReader("C:/web_14_java/test.txt");
			
			int code = 0;
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				
				if( code >= 'a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main
}













