package JavaClass1;

public class Exception3 {

	public static void main(String[] args) {
      String s="Selenium";
       try {
    	   int i=Integer.parseInt(s);
       }catch (NumberFormatException e) {
    	   e.printStackTrace();
       }
       	System.out.println("Exception");
 
	}

}
