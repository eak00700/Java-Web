package ex4_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setBounds(500, 300, 400, 300);
		
		//MyClosing mc = new MyClosing();
		
		//�͸� Ŭ���� : �̸��� ���� Ŭ����
		//new�� ������ �������� �޸𸮸� ��� �Ҵ�޾� �״ٰ�
		//����� ������ �ڵ����� ���ŵȴ�
		f.addWindowListener( new MyClosing() );
		
		f.setVisible(true);
		
	}//main
}












