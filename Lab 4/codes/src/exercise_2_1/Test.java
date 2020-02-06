package exercise_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
	
	public static Student readStudent() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name");
		String fname = br.readLine();
		System.out.println("Enter middle name");
		String mname = br.readLine();
		System.out.println("Enter last name");
		String lname = br.readLine();
		System.out.println("Enter 1 for comma, 2 for semicolon");
		int choice = Integer.parseInt(br.readLine());
		System.out.println("Enter age");
		int age = Integer.parseInt(br.readLine());
		
		if(choice ==1) 
			return new Student(new Name(fname+","+mname+","+lname),age);
		
		return new Student(new Name(lname+";"+mname+";"+fname),age);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter details of student " + (i+1));
			StudentList.addStudent(readStudent());;
		}
		
		System.out.println(Arrays.toString(StudentList.getStudentsWithAge(20)));
		System.out.println(Arrays.toString(StudentList.getStudentsWithLastName("Sharma")));
		System.out.println(Arrays.toString(StudentList.getStudentsInRange(16, 20)));
		
		
	}

}
