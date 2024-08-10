package JavaClass1;

public class Exception7 {

      public static void a( int age ) {
    	  try {
    		  
    	  
      
        	if (age < 18) {
        		
        		throw new ArithmeticException("Not applicable");
        	} else {
        		System.out.println("Applicable");
        	
        	
        	}
        		
        	}catch (Exception e) {
        		e.printStackTrace();
        	
        	}
        	
        	
        
 }
        		public static void main(String[] args) {
        			a(15);
        			a(19);
        			
        			
        		
        }
        	
		
 
}

