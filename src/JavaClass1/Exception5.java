package JavaClass1;

public class Exception5 {

	public static void main(String[] args) {
		
		try {
     int i = 10/0;
     
		}catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("Finally will always execute");
		}
     
	}

}
