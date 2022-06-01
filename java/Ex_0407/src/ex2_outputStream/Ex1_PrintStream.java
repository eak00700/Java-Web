package ex2_outputStream;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		
		//화면에 데이터를 출력하도록 하는 대표적인 클래스
		PrintStream ps = System.out;
		
		ps.write('A');
		ps.write('B');
		ps.write('\n');
		ps.write('C');
		
		try {
			
			byte[] by = {'J', 'A', 'V', 'A'};
			ps.write(by);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ps.close();
	}//main
}












