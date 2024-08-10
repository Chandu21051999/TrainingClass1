package JavaClass1;

public class Exception6 {

	public static void main(String[] args) {
        
		try {
			int a = 10/2;
		} finally {
			System.out.println("Finally execute");
			try {
				int a=5/0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exception handled");
	}

}
