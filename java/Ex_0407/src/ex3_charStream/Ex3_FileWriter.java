package ex3_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("C:/web_14_java/fileWriter����.txt");
			
			fw.write("ù��° �� �ۼ��մϴ� hehehe");
			fw.write("\n");
			fw.write("�ι�° �ٵ� ���� ���� hehehe");
			
			fw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//main
}









