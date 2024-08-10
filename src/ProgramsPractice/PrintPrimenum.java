package ProgramsPractice;

public class PrintPrimenum {

	public static void main(String[] args) {
 
		int n=10;
		System.out.println(("print prime numbers 1 to" + n +":" ));
	
	
		for( int i=2;i<=n;i++) {
			boolean isPrime=true;
			for (int j=2;j<i;j++) {
				if(i%j==0)
				isPrime=false;
			}
			if(isPrime) {
				System.out.println(i +"");
			}
				
		}
	}

}
