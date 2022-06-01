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
		//ta������ ��� ���� �����ϴ� �޼��� setText
		//ta.setText( tf.getText() );
		
		//ta�� ���� ���� ���� ���ο� ���� �̾������( append )
		ta.append( tf.getText() + "\n" );
		
		tf.requestFocus();//tf�� Ŀ���� �̵���Ų��
		tf.setText("");
	}

}











