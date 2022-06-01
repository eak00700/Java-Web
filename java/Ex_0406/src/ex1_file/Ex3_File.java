package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java/aaa/bbb";
		File f = new File(path);
		
		//exists() : 파일클래스가 path경로로 찾아가는 중
		//존재하지 않는 폴더나 파일이 없다면 true값을 반환
		if( !f.exists() ) {//f.exists() == false
			System.out.println("폴더생성");
			f.mkdirs();//폴더생성
		}
		
	}//main
}













