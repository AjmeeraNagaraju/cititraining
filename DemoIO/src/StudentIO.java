import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentIO {

	public Student[] readfromuser() {
		Student [] list = new Student[5]; 
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in) );
		int counter =1;
		System.out.println("Pleas enter students details  ");
		while(counter <6) {
		System.out.println("Pleas enter student "+counter +" details  ");
		try {
			String roll =b.readLine();
			String marks =b.readLine();
			String name =b.readLine();
			
			Student ob = new Student(Integer.parseInt(roll), Integer.parseInt(marks), name);
			list[counter-1]=ob;
			counter++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return list;
	}
	public void writetouser(Student [] std) {
		
		for (Student student : std) {
			System.out.println(student.getRollno() +" "+student.getTotal() +" "+student.getName());
		}
	}
}
