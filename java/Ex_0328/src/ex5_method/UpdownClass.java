package ex5_method;

import java.util.Random;

public class UpdownClass {

	int random = new Random().nextInt(50) + 1;
	int count = 0;
	
	//����ڰ� �Է��� ���� up����, down����, ���������� �Ǵ��ϴ� �޼���
	public String check( int n ){
		
		count++;
		
		if( n < random ) {
			System.out.println("UP");
			
		}else if( n > random ) {
			System.out.println("DOWN");
			
		}else {
			System.out.println(count + "ȸ ���� ����!!");
			return "����";
		}
		
		return "����";
	}//check()
	
}













