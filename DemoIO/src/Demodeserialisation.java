import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Demodeserialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fi = new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Object obj=oi.readObject();
			Object obj2=oi.readObject();
			
			
			Student ss =(Student)obj;
			Student ss2 =(Student)obj2;
			System.out.println("Rollno, total, name ");
			System.out.println(ss.getRollno() + ",  "+ss.getTotal()+",  " + ss.getName());
			System.out.println(ss2.getRollno() + ",  "+ss2.getTotal()+",  " + ss2
					.getName());
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
		
		
	}

}
