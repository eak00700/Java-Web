package ex1_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	
	static String dayStr = "�Ͽ���";
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		//�������� ȭ���� ����ä��� �ڵ���ġ�� ����
		f.setLayout(null);
		
		//�׸��� ����
		Choice day = new Choice();
		day.add("�Ͽ���");
		day.add("������");
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		//choice��ü�� ���̴� �ȿ� �߰��Ǿ� �ִ� ������ ũ�⿡ ���� �޶����Ƿ�
		//���̰��� height�Ӽ��� 0���� �ֵ� ����
		day.setSize(150, 0);
		day.setLocation(50, 100);
		
		day.addItemListener( new ChoiceAdapter(f) );
		
		//������� Choice��ü�� day�� frame�� �߰�
		f.add(day);
		
		f.setBounds(400, 100, 500, 250);
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
	}//main
}


























