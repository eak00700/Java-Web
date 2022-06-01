package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Frame {
	public static void main(String[] args) {
		
		Frame f = new Frame("어댑터 활용하기");
		
		f.setBounds(500, 300, 300, 300);
		
		//f에 우상단 버튼 클릭 이벤트 감지자 등록
		//메서드의 파라미터 내부에 생성되는 이름없는 클래스 -> 익명 내부클래스
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
		f.setVisible(true);
	}//main
}






































