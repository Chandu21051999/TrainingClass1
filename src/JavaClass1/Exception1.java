package JavaClass1;

public class Exception1 {
	
	public static void main(String[] args) {
		try {
			
		
	 int a = 5 / 0;
	 
		} catch  (ArithmeticException a) {
			a.printStackTrace(); //
			System.out.println(a); //Print only exception
		}catch (NullPointerException n) {
			System.out.println(n);
		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
	} catch ( Exception e) {
		System.out.println(e);
	}
		
	 System.out.println("Exception handling");
	 
	}
}

