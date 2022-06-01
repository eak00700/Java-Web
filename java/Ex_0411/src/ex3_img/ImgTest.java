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
		
		Frame f = new Frame("이미지");
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);//자동배치 끄기
		
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
				//배경으로 사용중인 JLabel의 아이콘을 back2로 변경
				jl_back.setIcon(back2);
				f.repaint();//현재 프레임의 내용을 갱신
			}
		});
		
		//버튼객체인 jb를 먼저 add해줘야 배경보다 위쪽에 보여진다
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
