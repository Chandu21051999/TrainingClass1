package JavaClass1;

public class Array3 {

	  static int c[]= {22,2,45,5};
	  
	public static void passingArrayToMethod() {
             
		int b=c[0];
		for (int i=0;i<c.length;i++) {
			if (b>=c[i]) {
				System.out.println(b);
				
			}
			else {
				System.out.println("ABNV");
			}
			
		}
	}
	public static void main(String[] args) {
		passingArrayToMethod();
	}

}
