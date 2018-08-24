import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demoreader {

	public static void main(String[] args) {
		 InputStream obj;
		try {
			obj = new FileInputStream("student.txt");
			System.out.print(obj.available());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        		  
		// TODO Auto-generated method stub
//		BufferedReader b = new BufferedReader(new InputStreamReader(System.in) );
//		System.out.println("Pleas enter two numbers");
//		try {
//			String a =b.readLine();
//			String c =b.readLine();
//			int d=0;
//			if(Integer.parseInt(a)>Integer.parseInt(c)) {
//			d=Integer.parseInt(a);	
//			}
//			else {
//				d=Integer.parseInt(c);
//			}
//			System.out.println("Max number is :-  1" +d );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				File mf = new File("file.txt");
//				try {
//					mf.createNewFile();
//					FileWriter fw =new FileWriter("file.txt",true);
//					fw.write("damnnnn");
//					fw.close();
//					FileReader fr = new FileReader("file.txt");
//		//			char [] arr;
//		//			fr.read(arr);
//					byte val=0;
//					do {
//						int aa =fr.read();
//						System.out.print((char)aa);
//						val =(byte)aa;
//					}while(val!=-1);
//					
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//		
			}

}
