package JavaClass1;

public class Static5 {

           static int z=5; //Static variable
           int y=10; //Global variable
	
           //static method 
 public static void a() {
	int z=10;
	System.out.println(z);	
}
 //non static method
 public  void b() {
		int z=15;
		System.out.println(z);
		a();
		}
 
public static void main(String[] args) {
	
	System.out.println(z);
	a();
	 Static5 s5  =new Static5();
	 s5.b();
	 
}	
	}
