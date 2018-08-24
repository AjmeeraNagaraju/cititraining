import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter 5 student details");
		StudentIO ff = new StudentIO();
		Student [] inp=ff.readfromuser();
		StudentfileIO fo = new StudentfileIO();
		fo.writestudents(inp);
		Student [] out = fo.readstudents();
		Scanner s = new Scanner(System.in);
		System.out.println("Wanna display or check");
		String aa =s.next();
		if(aa.equals("display")){
			ff.writetouser(out);
		}
		else {
			System.out.println("-------------------------------");
			
			System.out.println("Please ente roll no to check for anyone");
			
			int r =s.nextInt();
			s.close();
			
			if(!fo.check(r)) {
				System.out.println("Sorry not found");
			};
		}
		
		
	}

}
