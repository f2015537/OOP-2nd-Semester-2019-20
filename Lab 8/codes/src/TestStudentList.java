import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList studentList = new ArrayList();
		
		studentList.add(new Student("Ramesh","Male",18));
		studentList.add(new Student("Reeta","Female",19));
		studentList.add(new Student("Seema", "Female", 18));
		studentList.add(new Student("Suresh", "Male", 20));
		
		System.out.println("Original contents of studentList:");
		Iterator itr = studentList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println();
		ListIterator litr = studentList.listIterator();
		while(litr.hasNext()) {
			Student element = (Student)litr.next();
			if(element.getGender().equals("Male")) {
				element.setName("Mr. "+element.getName());
			}
			else {
				element.setName("Miss. "+element.getName());
			}
			litr.set(element);
		}
		System.out.println("Modified contents of studentList:");
		itr = studentList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Modified list backwards: ");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println();
	}
	

}
