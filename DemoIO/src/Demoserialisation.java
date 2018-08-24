import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demoserialisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Student st = new Student(1, 400, "ajmeera");
			Student st2 = new Student(2, 500, "raju");
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(st);
			oo.writeObject(st2);
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
