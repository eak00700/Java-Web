package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java";
		File f = new File(path);
		
		if( f.isDirectory() ) {//!f.isFile()
			
			String[] names = f.list();//f����� ������ҵ��� names�迭�� ����
			
			for( String s : names ) {
				System.out.println(s);
			}
			
		}
		
	}//main
}











