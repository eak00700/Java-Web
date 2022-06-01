package ex2_frame_exam;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class FrameExamMain {
	public static void main(String[] args) {
		
		Frame frame = new Frame("�޸���");
		frame.setBounds(700, 200, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(null);//�ڵ���ġ ����
		
		Font font = new Font("", Font.PLAIN, 20);
		
		//Ű���忡�� �Ѿ�� ���� �Է¹ޱ� ���� ��ü
		TextField tf = new TextField();
		tf.setBounds(10, 35, 180, 30);
		tf.setFont(font);
		
		Button btn_input = new Button("Ȯ��");
		btn_input.setBounds(195, 35, 45, 30);
		btn_input.setEnabled(false);//��ư Ŭ�� ��Ȱ��ȭ
		
		//Ű���忡�� �������� ���ÿ� �Է¹��� �� �ֵ��� �ϴ� Ŭ����
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 230, 280);
		ta.setEditable(false);//ta�� ���Ƿ� ���� �߰��� �� ������ �ϴ� ���
		
		Button btnSave = new Button("����");
		Button btnClose = new Button("����");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
		//tf�� ���� �� �ִ��� Ȯ���Ͽ� 'Ȯ��'��ư�� Ȱ��ȭ �Ǵ� ��Ȱ��ȭ
		tf.addTextListener( new TextAdapter(tf, btn_input) );
		
		//Ȯ�ι�ư Ŭ���� tf�� ���� ta�� �����ؼ� �־�����!
		btn_input.addActionListener( new InputButtonAdapter(tf, ta) );
		
		//�����ư�� �̺�Ʈ ������ ���
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);//��� �����ӵ��� ����
				frame.dispose();//���� �����Ӹ� ����
			}
		});
		
		//���� ��ư�� ������ �� ta�� ���� �����ϴ� �̺�Ʈ ������ ���
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta�� ������ ������ ��������
				String message = ta.getText();
				
				//��θ� �����ϴ� FileDialog
				FileDialog fd = new FileDialog( 
						frame, "����", FileDialog.SAVE );	
				fd.setVisible(true);
				
				//fd�� ���� ������ �����ο� ���ϸ��� �˾Ƴ���
				//(fd.setVisible() ���� �Ʒ��ʿ� �ۼ��� ��!!)
				String path = fd.getDirectory() + fd.getFile();
				System.out.println(path);
				
				try {
					//char����� ��Ʈ���� �����Ͽ� path��ο� ����
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		frame.add(tf);//frame�� TextField�߰�
		frame.add(btn_input);//frame�� Button�߰�
		frame.add(ta);//frame�� TextArea�� �߰�
		frame.add(btnSave);
		frame.add(btnClose);
		
		//������ �������� ������ ������ ���´�
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
	}//main
}
