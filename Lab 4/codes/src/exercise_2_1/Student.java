package exercise_2_1;

class Student {
	
	private Name name;
	private int age;
	
	
	Student(Name name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public Name getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return name.getName()+" "+age;
	}
	
	
	
}
