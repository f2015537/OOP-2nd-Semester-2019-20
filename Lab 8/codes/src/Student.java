
public class Student {
	private String name;
	private String gender;
	private int age;
	
	public Student(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
