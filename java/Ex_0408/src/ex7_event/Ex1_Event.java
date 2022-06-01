package ex7_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex1_Event {
	
	//�̺�Ʈ �����ڿ��� ���� �����ϸ� ����� ����(static���� �����ص־� ������ �ȿ��� ����� ����)
	static String radioStr = "";
	
	public static void main(String[] args) {

		Frame f = new Frame("���� ������Ʈ");

		f.setLayout(null);//�ڵ���ġ ����

		//���ڿ� ���õ� Ŭ����
		Font font = new Font("�ü�ü", Font.BOLD, 30);

		//ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����
		Label q1 = new Label("���� �оߴ� �����Դϱ�?");
		q1.setFont(font);
		q1.setBounds(10, 30, 400, 50);

		//���߼����� ������ CheckBox����
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox music = new Checkbox("����");
		movie.setBounds(10, 90, 70, 30);
		music.setBounds(80, 90, 70, 30);

		f.add(q1);//�����ӿ� ���̺� �߰�
		f.add(movie);//�����ӿ� üũ�ڽ��� �Ѱ� �߰�
		f.add(music);

		//üũ�ڽ��� ���� �̺�Ʈ ������
		ItemListener checkListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//üũ�ڽ��� ������ �ؽ�Ʈ�� �����´�
				//System.out.println( e.getItem().toString() );
				String res = "";

				switch( e.getItem().toString() ) {

				case "��ȭ":
					res = e.getStateChange() == 1 ? "��ȭ����" : "��ȭ���";
					break;

				case "����":
					res = e.getStateChange() == 1 ? "���Ǽ���" : "�������";
					break;
				}//switch

				System.out.println(res);

			}
		};

		//üũ�ڽ��� ������ �߰�
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);

		//ȭ�鿡 �ؽ�Ʈ�� ����ϴ� Ŭ����
		Label q2 = new Label("�̰� �Դϱ� ���� �Դϱ�?");
		q2.setFont(font);
		q2.setBounds(10, 130, 400, 50);

		f.add(q2);
		
		//������ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1 = new Checkbox("�̰�", group, false);
		Checkbox c2 = new Checkbox("����", group, false);
		c1.setBounds(10, 190, 70, 30);
		c2.setBounds(90, 190, 70, 30);

		//�����ӿ� ������ü �߰�
		f.add(c1);
		f.add(c2);
		
		
		
		//������ư �̺�Ʈ ó���� ���� ������ ����
		ItemListener radioListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				radioStr = e.getItem().toString();
				//System.out.println(radioStr);
				JOptionPane.showMessageDialog( f, radioStr + "������" );
				
			}
		};
		
		//������ư�� �̺�Ʈ ������ ���
		c1.addItemListener(radioListener);
		c2.addItemListener(radioListener);
		
		f.setBounds( 500, 100, 800, 250 );
		f.setVisible(true);

		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
	}//main
}





































