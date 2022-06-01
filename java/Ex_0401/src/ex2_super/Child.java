package ex2_super;

public class Child extends Parent{
	
	//super : 부모클래스	
	public Child() {
		super(10);//부모클래스의 생성자를 호출
		System.out.println("Child의 생성자");
	}
	
	@Override
	public int result() {
		//super.result() : Parent클래스의 result()메서드를 호출
		return super.result();
	}
	
}










