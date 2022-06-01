package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_Button {
	public static void main(String[] args) {

		Frame f = new Frame("��ư �����ϱ�");		
		f.setBounds(500, 400, 400, 400);

		//frame�� �⺻������ add�Ǵ� ��� ��ü�� ȭ�鿡 ���� ä�쵵�� ����Ǿ� �ִ�.
		//�̰��� �����ϰ� add�Ǵ� ��ü���� ��ġ�� ũ�Ⱚ�� ������ �� �ֵ��� �Ӽ��� �����ϴ� �ڵ尡
		//setLayout(null)�̴�. 
		//�̰��� '�������� �ڵ���ġ�� ����'��� ǥ���Ѵ�
		f.setLayout(null);

		//��ư ����
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");

		//�ڵ���ġ�� �����ִ� �����ӿ� �߰��� ��ư���� ũ��� ��ġ���� ����
		btn1.setBounds(70, 90, 100, 50);
		btn2.setBounds(230, 90, 100, 50);

		//������ ��ư�� frame�� �߰�
		f.add(btn1);
		f.add(btn2);

		//��ư�鿡�� Ŭ�� �̺�Ʈ ������ ���
		btn1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1�� ��ư ������");
			}
		} );

		btn2.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2�� ��ư ������");
			}
		} );

		f.setVisible(true);

		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );

	}//main
}




















































