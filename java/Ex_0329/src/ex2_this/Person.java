package ex2_this;

public class Person {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		//this : ���� Ŭ���� �ڽ�
		//this.age : PersonŬ������ ���� �������� age�� �ǹ�
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}









