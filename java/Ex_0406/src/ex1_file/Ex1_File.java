package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO(Input, Output) : ����� ��Ʈ��
		//��Ʈ���̶� �����͸� ������ϱ� ���� ���
		//JVM���� �ַܼ� ���� ���������� Output, �ܼ��� ���� JVM���� �о�ö��� Input
		
		String path = "C:/web_14_java/test.txt";
		File f = new File(path);//FileŬ������ �����Ǹ鼭 path��α��� ��Ʈ���� ����
		
		//f.isFile() : ����Ŭ������ ������ ���� �������� ���������� ��� true
		if( f.isFile() ) {
			System.out.println( f.length() + "byte");
		}
		
	}//main
}










































