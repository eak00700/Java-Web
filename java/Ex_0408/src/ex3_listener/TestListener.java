package ex3_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		//�������� frame�� ���� x��ư�� Ŭ���ϸ� ȣ��Ǵ� �޼���
		System.out.println("���� x��ư�� ������");
		System.exit(0);//�����ִ� ��� �������� �����ϴ� �޼���
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		//�ּ�ȭ ������ frame�� ����ũ��� ���ƿ��� ��
		System.out.println("�ּ�ȭ ���");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		//�������� frame�� ���� �ּ�ȭ(_)��ư�� Ŭ���ϸ� ȣ��Ǵ� �޼���
		System.out.println("�ּ�ȭ �Ǿ���");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
