package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input, Output) : 입출력 스트림
		//스트림이란 데이터를 입출력하기 위한 통로
		//JVM에서 콘솔로 값을 내보낼때는 Output, 콘솔의 값을 JVM에서 읽어올때는 Input
		
		String path = "C:/web_14_java/test.txt";
		File f = new File(path);//File클래스가 생성되면서 path경로까지 스트림을 생성
		
		//f.isFile() : 파일클래스가 접근한 최종 목적지가 파일형식일 경우 true
		if( f.isFile() ) {
			System.out.println( f.length() + "byte");
		}
		
	}//main
}










































