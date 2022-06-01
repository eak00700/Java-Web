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
		
		Frame frame = new Frame("메모장");
		frame.setBounds(700, 200, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(null);//자동배치 끄기
		
		Font font = new Font("", Font.PLAIN, 20);
		
		//키보드에서 넘어온 값을 입력받기 위한 객체
		TextField tf = new TextField();
		tf.setBounds(10, 35, 180, 30);
		tf.setFont(font);
		
		Button btn_input = new Button("확인");
		btn_input.setBounds(195, 35, 45, 30);
		btn_input.setEnabled(false);//버튼 클릭 비활성화
		
		//키보드에서 여러줄을 동시에 입력받을 수 있도록 하는 클래스
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 70, 230, 280);
		ta.setEditable(false);//ta에 임의로 값을 추가할 수 없도록 하는 기능
		
		Button btnSave = new Button("저장");
		Button btnClose = new Button("종료");
		btnSave.setBounds(10, 356, 110, 30);
		btnClose.setBounds(130, 356, 110, 30);
		
		//tf에 값이 들어가 있는지 확인하여 '확인'버튼을 활성화 또는 비활성화
		tf.addTextListener( new TextAdapter(tf, btn_input) );
		
		//확인버튼 클릭시 tf의 값을 ta로 복사해서 넣어주자!
		btn_input.addActionListener( new InputButtonAdapter(tf, ta) );
		
		//종료버튼에 이벤트 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);//모든 프레임들을 종료
				frame.dispose();//현재 프레임만 종료
			}
		});
		
		//저장 버튼을 눌렀을 때 ta의 값을 저장하는 이벤트 감지자 등록
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta에 쓰여진 내용을 가져오자
				String message = ta.getText();
				
				//경로를 설정하는 FileDialog
				FileDialog fd = new FileDialog( 
						frame, "저장", FileDialog.SAVE );	
				fd.setVisible(true);
				
				//fd를 통해 지정한 저장경로와 파일명을 알아내자
				//(fd.setVisible() 보다 아래쪽에 작성할 것!!)
				String path = fd.getDirectory() + fd.getFile();
				System.out.println(path);
				
				try {
					//char기반의 스트림을 생성하여 path경로에 저장
					FileWriter fw = new FileWriter(path);
					fw.write(message);
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		frame.add(tf);//frame에 TextField추가
		frame.add(btn_input);//frame에 Button추가
		frame.add(ta);//frame에 TextArea를 추가
		frame.add(btnSave);
		frame.add(btnClose);
		
		//생성된 프레임의 사이즈 변경을 막는다
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
