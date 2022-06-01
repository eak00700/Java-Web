package ex3_img;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImgTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("�̹���");
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);//�ڵ���ġ ����
		
		ImageIcon back = new ImageIcon("src/images/s.png");
		JLabel jl_back = new JLabel(back);
		jl_back.setBounds(0, 0, 500, 500);
		
		ImageIcon btnIcon = new ImageIcon("src/images/ic.png");
		JButton jb = new JButton(btnIcon);
		jb.setBounds(20, 40, 106, 106);

		ImageIcon back2 = new ImageIcon("src/images/s2.jpg");
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//������� ������� JLabel�� �������� back2�� ����
				jl_back.setIcon(back2);
				f.repaint();//���� �������� ������ ����
			}
		});
		
		//��ư��ü�� jb�� ���� add����� ��溸�� ���ʿ� ��������
		f.add(jb);
		f.add(jl_back);
		
		f.setVisible(true);
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
	}//main
}
