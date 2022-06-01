package ex3_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("이벤트 감지자");
		
		//f.setSize(300, 300);
		//f.setLocation(500, 300);
		
		//setSize(), setLocation()를 하나로 합쳐놓은 메서드
		f.setBounds(500, 300, 300, 300);
		
		//frame에 클릭을 감지하는 이벤트 감지자 등록
		TestListener tl = new TestListener();
		
		//프레임의 우상단 버튼들에 대한 이벤트를 감지하는 감지자
		f.addWindowListener( tl );
		
		f.setVisible(true);
		
	}//main
}










