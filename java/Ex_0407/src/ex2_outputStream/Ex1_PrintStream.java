package ex2_outputStream;

import java.io.IOException;
import java.io.PrintStream;

public class Ex1_PrintStream {
	public static void main(String[] args) {
		
		//ȭ�鿡 �����͸� ����ϵ��� �ϴ� ��ǥ���� Ŭ����
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












