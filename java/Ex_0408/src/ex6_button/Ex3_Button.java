package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex3_Button {
	public static void main(String[] args) {

		Frame f = new Frame("버튼 생성하기");		
		f.setBounds(500, 400, 400, 400);

		//frame은 기본적으로 add되는 모든 객체를 화면에 가득 채우도록 설계되어 있다.
		//이것을 무시하고 add되는 객체들의 위치나 크기값을 지정할 수 있도록 속성을 변경하는 코드가
		//setLayout(null)이다. 
		//이것을 '프레임의 자동배치를 끈다'라고 표현한다
		f.setLayout(null);

		//버튼 생성
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");

		//자동배치가 꺼져있는 프레임에 추가될 버튼들의 크기와 위치값을 지정
		btn1.setBounds(70, 90, 100, 50);
		btn2.setBounds(230, 90, 100, 50);

		//생성된 버튼을 frame에 추가
		f.add(btn1);
		f.add(btn2);

		//버튼들이 참조할 이벤트 감지자(인터페이스) 생성
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼에 쓰여진 내용을 출력하는 메서드
				//System.out.println( e.getActionCommand() );
				switch (e.getActionCommand()) {
				case "1":
					System.out.println("1번 버튼 클릭됨");
					break;
					
				case "2":
					System.out.println("2번 버튼 클릭됨");
					break;
				}//switch
			}
		};

		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		f.setVisible(true);

		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );

	}//main
}




















































