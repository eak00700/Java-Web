package ex3_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("�̺�Ʈ ������");
		
		//f.setSize(300, 300);
		//f.setLocation(500, 300);
		
		//setSize(), setLocation()�� �ϳ��� ���ĳ��� �޼���
		f.setBounds(500, 300, 300, 300);
		
		//frame�� Ŭ���� �����ϴ� �̺�Ʈ ������ ���
		TestListener tl = new TestListener();
		
		//�������� ���� ��ư�鿡 ���� �̺�Ʈ�� �����ϴ� ������
		f.addWindowListener( tl );
		
		f.setVisible(true);
		
	}//main
}










