package by.pht.sortirivka;

public class Student implements Comparable<Student>{
	
	private String name;
	private String suname;
	private int age;
	
	public Student(String name, String suname, int age) {
		this.name = name;
		this.suname = suname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}
	


	@Override
	public String toString() {
		return "Student [name=" + name + ", suname=" + suname + ", age=" + age + "]";
	}

	public int compareTo(Student student) {
		int studentNextAge = student.getAge();
		return this.age - studentNextAge;
	}
	
	

}
