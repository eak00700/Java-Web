package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		
		Frame f = new Frame("��ư �����ϱ�");		
		f.setBounds(500, 400, 400, 400);
		
		//frame�� �⺻������ add�Ǵ� ��� ��ü�� ȭ�鿡 ���� ä�쵵�� ����Ǿ� �ִ�.
		//�̰��� �����ϰ� add�Ǵ� ��ü���� ��ġ�� ũ�Ⱚ�� ������ �� �ֵ��� �Ӽ��� �����ϴ� �ڵ尡
		//setLayout(null)�̴�. 
		//�̰��� '�������� �ڵ���ġ�� ����'��� ǥ���Ѵ�
		f.setLayout(null);
		
		//��ư ����
		Button btnOK = new Button("Ȯ��");
		Button btnClose = new Button("�ݱ�");
		
		//�ڵ���ġ�� �����ִ� �����ӿ� �߰��� ��ư���� ũ��� ��ġ���� ����
		btnOK.setBounds(70, 90, 100, 50);
		btnClose.setBounds(230, 90, 100, 50);
		
		//������ ��ư�� frame�� �߰�
		f.add(btnOK);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
	}//main
}




















































