package by.epam.training.entity;

public class Student {
	
	public String surname;
	public String initials;
	public int groupNumber;
	public int[] grades;
	public boolean excellent;
	
	public Student() {
		grades = new int[5];
		excellent = true;
	}

}
