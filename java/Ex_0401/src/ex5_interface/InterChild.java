package ex5_interface;

public class InterChild implements InterTest{

	//InterTest인터페이스를 implements키워들 통해서 '구현'한다
	//인터페이스는 동시에 여러개를 구현하는 '다중구현'이 가능
	
	@Override
	public int getA() {
		return 100;
	}

}
