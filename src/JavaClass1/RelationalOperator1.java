package JavaClass1;

public class RelationalOperator1 {

	public static void main(String[] args) {
         int a=300; // Local Variable
         int b=200;// Local Variable
         
         if (a!=b) {
        	  System.out.println(" a is not euql to b");
        	  
         }
         else {
        	 System.out.println("a is equal to b");
         }
         String p="HELLO";
         String q="hello";
         //String comparision -1st way - case sensitive
         if (p==q) {
        	 System.out.println("p and q are equal 1st way");
         }
         else {
        	 System.out.println("p and q are not equal 1st way");
         }
       //String comparision -2nd way - case sensitive
         if (p.equals(q)) {
        	 System.out.println("p and q are equal 2nd way");
         }
         else {
        	 System.out.println("p and q are not equal 2nd  way");
         }
       //String comparision -3rd way - case sensitive
         if (p.equalsIgnoreCase(q)) {
        	 System.out.println("p and q are equal 3rd way");
         }
         else {
        	 System.out.println("p and q are not equal 3rd way");
         }
	}
	

}
