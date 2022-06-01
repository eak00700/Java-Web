package ex2_this;

public class Person {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		//this : 현재 클래스 자신
		//this.age : Person클래스가 가진 전역변수 age를 의미
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}









