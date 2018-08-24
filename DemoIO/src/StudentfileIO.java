import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentfileIO {

	public Student[] readstudents() {
		
		try {
			FileInputStream fi = new FileInputStream("file.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj=oi.readObject();
			
			
			
			Student[] ss =(Student [])obj;
			return ss;
//			System.out.println("Rollno, total, name ");
//			 for (Student student : ss) {
//				System.out.println(student.getRollno() + ",  "+student.getTotal()+",  " + student.getName());
//			}
			
//			ss.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public boolean check(int r) {
		try {
			FileInputStream fi = new FileInputStream("file.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj=oi.readObject();
			
			
			
			Student[] ss =(Student [])obj;
			
			System.out.println("Rollno, total, name ");
			 for (Student student : ss) {
				 if(student.getRollno()==r) {
					 System.out.println("Cool ...You have found it");
					 System.out.println(student.getRollno() + ",  "+student.getTotal()+",  " + student.getName());
					 return true;
				 }
				
			}
			
//			ss.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public void writestudents(Student [] std)  {
		
		try {
			
			FileOutputStream fo = new FileOutputStream("file.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(std);
			oo.close();
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
