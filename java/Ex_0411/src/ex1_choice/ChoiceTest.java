package ex1_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	
	static String dayStr = "일요일";
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		//프레임의 화면을 가득채우는 자동배치를 끈다
		f.setLayout(null);
		
		//항목선택 상자
		Choice day = new Choice();
		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		//choice객체의 높이는 안에 추가되어 있는 내용의 크기에 따라 달라지므로
		//높이값인 height속성은 0으로 둬도 무관
		day.setSize(150, 0);
		day.setLocation(50, 100);
		
		day.addItemListener( new ChoiceAdapter(f) );
		
		//만들어진 Choice객체인 day를 frame에 추가
		f.add(day);
		
		f.setBounds(400, 100, 500, 250);
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
		
	}//main
}


























