package JavaClass1;

public class Exception2 {

	public static void main(String[] args) {
		String  s= null;
		
		try {
		System.out.println(s.length());
		}catch (Exception a){
			a.printStackTrace();
			
		}
		System.out.println("Excepton handling");

	}

}
