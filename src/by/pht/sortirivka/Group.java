package by.pht.sortirivka;

public class Group{
	
	private Student[] students;
	private int studentsCount = 0;
	
	
	public Group(int size) {
		students = new Student[size];		
	}
	
		
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		if ( studentsCount < students.length) {
			students[studentsCount] = student;
			studentsCount++;
		} else
			System.out.println("Group is full of students!");
	}
	
	public Group sortStudentsByAge() {
		
		for (int i = students.length-1; i>0; i--) {
			for( int j=0; j<i; j++) {
				if(students[j].compareTo(students[j+1])>0){ 
					Student tmp = students[j];
					students[j] = students[j+1];
					students[j+1] = tmp;
				}				
			}			
		}
		return null;
	}
	
	public Group sortStudentsByNameAge() {
		
		StudentComparator comparator = new StudentComparator();
		
		int q = 0;
		for (int i = students.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (q < comparator.compare(students[j], students[j + 1])) {
					Student buff = students[j];
					students[j] = students[j + 1];
					students[j + 1] = buff;
				}
			}
		}
		return null;
		
	}
}
