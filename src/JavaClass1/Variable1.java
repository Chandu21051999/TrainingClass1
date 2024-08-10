package JavaClass1;

public class Variable1 {
	public static void main(String[] args) {
		int a =5; //int type Local variable
		System.out.println(a);
		int x	=50; // int type local variable
		System.out.println(x); //calling variable
		
		x=150; // modification value
		System.out.println(x);//150
		
		char c='a';//Local Variable,should be placed  inside single quote	
		System.out.println(c);
		boolean b=true;
		b= false;// modify value
		System.out.println(b); // false
		
		System.out.println(3>12);
		System.out.println(3<12);

		int e=100; //int type local variable
		int f=200;// int type local variable
		
		boolean z=e>f;
		System.out.println(z);//false
	}

}
