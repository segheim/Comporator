package by.pht.sortirivka;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", "Ivanov", 33);
		Student st2 = new Student("Petr", "Petrov", 19);
		Student st3 = new Student("Boris", "Borisov", 22);
		Student st4 = new Student("Bob", "Fedorov", 40);
		Student st5 = new Student("Nikita", "Nikitov", 20);
		
		
		Group group = new Group(5);
		
		group.addStudent(st1);
		group.addStudent(st2);
		group.addStudent(st3);
		group.addStudent(st4);
		group.addStudent(st5);
		
		group.sortStudentsByAge();
		
		for (Student s : group.getStudents()) {
			System.out.println(s);
		}
		
		System.out.println("");
		
		group.sortStudentsByNameAge();
		
		for (Student s1 : group.getStudents()) {
			System.out.println(s1);
		}
	
	}

}
