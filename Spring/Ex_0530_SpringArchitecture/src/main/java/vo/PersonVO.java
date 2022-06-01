package vo;

public class PersonVO {
	
	private String name, tel;
	private int age;
	
	public PersonVO() {
		System.out.println("--PersonVO의 기본 생성자--");
	}
	public PersonVO(String name, String tel, int age) {
		
		System.out.println("--오버로딩된 생성자--");
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("이름세팅");
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		System.out.println("전화세팅");
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("나이세팅");
		this.age = age;
	}

	
	
}
