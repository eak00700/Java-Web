package ex4_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setBounds(500, 300, 400, 300);
		
		//MyClosing mc = new MyClosing();
		
		//익명 클래스 : 이름이 없는 클래스
		//new로 생성된 시점에서 메모리를 잠시 할당받아 뒀다가
		//사용이 끝나면 자동으로 제거된다
		f.addWindowListener( new MyClosing() );
		
		f.setVisible(true);
		
	}//main
}












