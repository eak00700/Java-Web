package ex2_frame_exam;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputButtonAdapter implements ActionListener{

	private TextField tf;
	private TextArea ta;
	
	public InputButtonAdapter( TextField tf, TextArea ta ) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//ta내부의 모든 값을 변경하는 메서드 setText
		//ta.setText( tf.getText() );
		
		//ta가 가진 기존 값에 새로운 값을 이어붙이자( append )
		ta.append( tf.getText() + "\n" );
		
		tf.requestFocus();//tf로 커서를 이동시킨다
		tf.setText("");
	}

}











