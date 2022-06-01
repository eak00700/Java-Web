package ex3_abstract;

public class AbsChild extends AbsParent{

	//추상클래스인 부모를 상속받은 자식클래스는
	//부모가 가지고 있는 미완성(추상)메서드를 오버라이딩 하여 가지고 있어야 한다.
	//자식이 무조건 재정의해서 완성시킬 필요는 없으나, 메서드 자체는 반드시 받아두어야 한다
	@Override
	public void setValue(int n) {
		
		System.out.println("추상메서드 재정의함");
		
	}

}
