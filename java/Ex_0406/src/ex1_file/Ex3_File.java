package ex1_file;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:/web_14_java/aaa/bbb";
		File f = new File(path);
		
		//exists() : ����Ŭ������ path��η� ã�ư��� ��
		//�������� �ʴ� ������ ������ ���ٸ� true���� ��ȯ
		if( !f.exists() ) {//f.exists() == false
			System.out.println("��������");
			f.mkdirs();//��������
		}
		
	}//main
}













