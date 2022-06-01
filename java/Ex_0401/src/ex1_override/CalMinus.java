package ex1_override;

public class CalMinus extends Calculator{

	@Override
	public int getResult(int n1, int n2) {
		return n1 - n2;
	}
	
}
