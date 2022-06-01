package ex4_listener;

import java.awt.event.WindowEvent;

public class MyClosing extends MyListener{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
