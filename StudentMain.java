import java.util.Scanner;
public class StudentMain {
	static String getString(String prompt) {
		final Scanner sc = new Scanner(System.in);
		System.out.print(prompt);
		return sc.next();
	}
	static int getInt(String prompt) {
		return Integer.parseInt(getString(prompt));
	}
	public static Student getDetails() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		System.out.println("Enter the name:");
		String _name = sc.nextLine();
		String name = sc.nextLine();
		int n;
		boolean invalid = false;
		do {
			invalid = false;
			System.out.println("Enter the no of subjects:");
			n = sc.nextInt();
			if(n<=0){
				System.out.println("Invalid number of subject");
					invalid = true;
				}
		}while(invalid);	
				int[] marks = new int [n];	
				for(int i=0;i<n;i++) {
					marks[i]=getInt("Enter mark for subject "+ (i+1)+":\n");
				}
				
		s.setId(id);
		s.setName(name);
		s.setMarks(marks);
		return s;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s = StudentMain.getDetails();
		s.calculateAvg();
		s.findGrade();
		
		System.out.println("Id:"+s.getId());
		System.out.println("Name:"+s.getName());
		System.out.println("Average:"+s.getAverage());
		System.out.println("Grade:"+s.getGrade());
		
	}
}
