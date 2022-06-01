package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest_01 {
	public static void main(String[] args) {
		
		//UI(User Interface) : 눈에 보여지는 것들을 디자인 하는 작업
		//자바는 UI를 위해 awt, swing패키지를 제공하고 있다.
		Frame f = new Frame("첫 프레임");
		f.setSize(400, 300);//크기
		f.setLocation(500, 200);//프레임이 생성될 위치
		f.setBackground(Color.CYAN);//프레임의 배경색		
		f.setVisible(true);//생성한 프레임을 화면에 표기
		
	}//main
}



































































