package exercise_2_1;

class StudentList {
	public static Student[] list = new Student[10];
	public static int count = 0;
	
	public static void addStudent(Student std) {
		if(count >= 10) return; // It should be >= 10 instead of >= 20
		list[count++] = std;
	}
	
	public static Student[] getStudentsWithAge(int age) {
		int counter = 0; // Note that this is a local variable and different from static count
		for(int i = 0; i < list.length; i++)
			if(list[i].getAge() == age)
				counter++;
		Student[] list2 = new Student[counter];
		for(int i = 0,j=0; i < list.length; i++)
			if(list[i].getAge() == age)
				list2[j++] = list[i];
		return list2;
	}
	
	public static Student[] getStudentsWithLastName(String lastName) {
		int counter = 0; // Note that this is a local variable and different from static count
		for(int i = 0; i < list.length; i++)
			if(list[i].getName().getLname().equals(lastName))
				counter++;
		Student[] list2 = new Student[counter];
		for(int i = 0,j=0; i < list.length; i++)
			if(list[i].getName().getLname().equals(lastName))
				list2[j++] = list[i];
		return list2;
	}
	
	public static Student[] getStudentsInRange(int minAge, int maxAge) {
		int counter = 0; // Note that this is a local variable and different from static count
		for(int i = 0; i < list.length; i++)
			if(list[i].getAge() >= minAge && list[i].getAge() <= maxAge)
				counter++;
		Student[] list2 = new Student[counter];
		for(int i = 0,j=0; i < list.length; i++)
			if(list[i].getAge() >= minAge && list[i].getAge() <= maxAge)
				list2[j++] = list[i];
		return list2;
	}
	
}
