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
			//tf�� �ƹ��͵� �������� ������ ��ư ��Ȱ��
			btn_input.setEnabled(false);
		}else {
			//tf�� ���� ���������� ��ư�� Ȱ��
			btn_input.setEnabled(true);
		}
		
	}

}





