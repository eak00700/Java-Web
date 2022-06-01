package ex5_constructor;

public class Person {
	int age;
	String name;
	String tel;
	
	public Person() {
		age = 40;
		name = "³ëÅÂ¹®";
		tel = "010-111-1111";
	}
	
	public Person(int age, String name, String tel) {
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
}
