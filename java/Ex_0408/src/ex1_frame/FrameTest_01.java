package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest_01 {
	public static void main(String[] args) {
		
		//UI(User Interface) : ���� �������� �͵��� ������ �ϴ� �۾�
		//�ڹٴ� UI�� ���� awt, swing��Ű���� �����ϰ� �ִ�.
		Frame f = new Frame("ù ������");
		f.setSize(400, 300);//ũ��
		f.setLocation(500, 200);//�������� ������ ��ġ
		f.setBackground(Color.CYAN);//�������� ����		
		f.setVisible(true);//������ �������� ȭ�鿡 ǥ��
		
	}//main
}



































































