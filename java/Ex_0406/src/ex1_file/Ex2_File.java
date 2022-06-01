package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java";
		File f = new File(path);
		
		if( f.isDirectory() ) {//!f.isFile()
			
			String[] names = f.list();//f경로의 하위요소들을 names배열에 저장
			
			for( String s : names ) {
				System.out.println(s);
			}
			
		}
		
	}//main
}











