package JavaClass1;

public class UnaryOperator2 {

	public static void main(String[] args) {
         int a =10; // Local Variable
         int b=10; // Local Variable
         
         System.out.println(a++);//10,11
         System.out.println(a++  +  ++a);//11+1 12 1+12 13  13
         System.out.println(a + a++); //13 + 13+1 14
         System.out.println(b++ + b--);//11 10
         System.out.println(b++ + b--);//11 10
         System.out.println(b);//10
         
	}

}
