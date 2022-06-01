package ex3_abstract;

abstract public class AbsParent {
	//추상메서드를 한개라도 가지고 있는 클래스는
	//abstract키워드를 붙여 추상클래스로 정의해둬야 한다
	
	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//추상메서드는 body가 없기 때문에 이를 '미완성적 개념'이라고 한다
	//그러므로 이 미완성된 메서드를 자식이 물려받아서 완성시키도록 하는것이 조건이 된다
	abstract public void setValue(int n);
	//public abstract void setValue(int n);
	
}























