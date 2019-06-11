
import java.util.Scanner;
public class Student {
	private int id;
	private String name;
	private int[] marks;
	private float average;
	private char grade;
	
	void setId(int id) {
		this.id=id;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	
	public void calculateAvg() {
		float sum =0;
		for(int m:this.marks) {
			sum+=m;
		}
		this.setAverage(sum/this.marks.length);
	}
	
	public void findGrade() {
		if(this.getAverage()<=100 && this.getAverage()>=80)
				setGrade('O');
		else if(this.getAverage()<80 && this.getAverage()>=50)
			setGrade('A');
		else  
			setGrade('F');
	 
	}
}
