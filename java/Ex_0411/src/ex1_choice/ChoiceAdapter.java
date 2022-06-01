package ex1_choice;

import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class ChoiceAdapter implements ItemListener{

	Frame f;
	
	public ChoiceAdapter( Frame f ) {
		this.f = f;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		ChoiceTest.dayStr = e.getItem().toString();
		JOptionPane.showMessageDialog( f, "¿À´Ã : " + ChoiceTest.dayStr );
		
	}

}






