package by.pht.sortirivka;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	
	public int compare(Student stud1, Student stud2) {
		String s1= stud1.getName();
		String s2= stud2.getName();
		if (s1.compareTo(s2)>0) {
			return 1;
		} else if(s1.compareTo(s2) == 0) {
			return 1;
		}else {
			return 0;
		}
		
	}
}
