package JavaClass1;

public class Encapslation1 {
	String name;
	int b;
	final int c=1;//final variable--final is a keyword which can be invoke with class as well as method
	
	public void a() {
		//c=3; we can but change final variable
	}
	final void d() {
		System.out.println("final method");
	}
	
	public void SetName(String args) {
		this.name=a;
		this.b=5;
		System.out.println(b);
		System.out.println(a);
		
	}
	

}
