package ex7_event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class Ex1_Event {
	
	//이벤트 감지자에서 값을 변경하며 사용할 변수(static으로 선언해둬야 감지자 안에서 사용이 가능)
	static String radioStr = "";
	
	public static void main(String[] args) {

		Frame f = new Frame("각종 컴포넌트");

		f.setLayout(null);//자동배치 끄기

		//글자와 관련된 클래스
		Font font = new Font("궁서체", Font.BOLD, 30);

		//화면에 텍스트를 출력하는 클래스
		Label q1 = new Label("관심 분야는 무엇입니까?");
		q1.setFont(font);
		q1.setBounds(10, 30, 400, 50);

		//다중선택이 가능한 CheckBox생성
		Checkbox movie = new Checkbox("영화");
		Checkbox music = new Checkbox("음악");
		movie.setBounds(10, 90, 70, 30);
		music.setBounds(80, 90, 70, 30);

		f.add(q1);//프레임에 레이블 추가
		f.add(movie);//프레임에 체크박스가 한개 추가
		f.add(music);

		//체크박스에 대한 이벤트 감지자
		ItemListener checkListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//체크박스에 쓰여진 텍스트를 가져온다
				//System.out.println( e.getItem().toString() );
				String res = "";

				switch( e.getItem().toString() ) {

				case "영화":
					res = e.getStateChange() == 1 ? "영화선택" : "영화취소";
					break;

				case "음악":
					res = e.getStateChange() == 1 ? "음악선택" : "음악취소";
					break;
				}//switch

				System.out.println(res);

			}
		};

		//체크박스에 감지자 추가
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);

		//화면에 텍스트를 출력하는 클래스
		Label q2 = new Label("이과 입니까 문과 입니까?");
		q2.setFont(font);
		q2.setBounds(10, 130, 400, 50);

		f.add(q2);
		
		//라디오버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1 = new Checkbox("이과", group, false);
		Checkbox c2 = new Checkbox("문과", group, false);
		c1.setBounds(10, 190, 70, 30);
		c2.setBounds(90, 190, 70, 30);

		//프레임에 라디오객체 추가
		f.add(c1);
		f.add(c2);
		
		
		
		//라디오버튼 이벤트 처리를 위한 감지자 생성
		ItemListener radioListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				radioStr = e.getItem().toString();
				//System.out.println(radioStr);
				JOptionPane.showMessageDialog( f, radioStr + "선택함" );
				
			}
		};
		
		//라디오버튼에 이벤트 감지자 등록
		c1.addItemListener(radioListener);
		c2.addItemListener(radioListener);
		
		f.setBounds( 500, 100, 800, 250 );
		f.setVisible(true);

		f.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};		
		} );
	}//main
}





































