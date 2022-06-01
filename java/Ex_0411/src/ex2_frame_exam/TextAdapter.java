package ex2_frame_exam;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextAdapter implements TextListener{

	private TextField tf;
	private Button btn_input;
	
	public TextAdapter(TextField tf, Button btn_input) {
		this.tf = tf;
		this.btn_input = btn_input;
	}
	
	@Override
	public void textValueChanged(TextEvent e) {

		if( tf.getText().equals("") ) {
			//tf에 아무것도 쓰여있지 않으면 버튼 비활성
			btn_input.setEnabled(false);
		}else {
			//tf에 뭔가 쓰여있으면 버튼을 활성
			btn_input.setEnabled(true);
		}
		
	}

}





