package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame("����� Ȱ���ϱ�");
		
		f.setBounds(500, 300, 300, 300);
		
		//f�� ���� ��ư Ŭ�� �̺�Ʈ ������ ���
		//�޼����� �Ķ���� ���ο� �����Ǵ� �̸����� Ŭ���� -> �͸� ����Ŭ����
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
		f.setVisible(true);
	}//main
}






































