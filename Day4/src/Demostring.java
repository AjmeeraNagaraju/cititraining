import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Scanner;
public class Demostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "good";
//		System.out.println(name);
//		name=name.concat("after");
//		System.out.println(name);
//		Scanner s = new Scanner(System.in);
//		String temp =s.next();
//		s.close();
//		System.out.println(temp.length());
//		System.out.println(temp.substring(0, 3));
//		System.out.println(temp.startsWith("ab"));
//		System.out.println(temp.endsWith("don"));
//		System.out.println(temp.concat("cool"));
//		System.out.println(temp.charAt(3));
//		System.out.println(temp.indexOf("mee"));	
//			String a ="citi";
//			String b ="citi";
//			String c =new String("citi");
//			if(a==c) {
//				System.out.println("cool");
//			}
//			else {
//				System.out.println("notcool");
//			}
//			StringBuilder build = new StringBuilder("stud");
//			build.append("vbjj");
//			build.length();
		try {
			Class cl = Class.forName("java.lang.String");
			Constructor[] con = cl.getConstructors();
			for (Constructor constructor : con) {
				Type[] tp =constructor.getGenericParameterTypes();
					for (Type type : tp) {
					System.out.println(type.getTypeName());
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
