package JavaClass1;

public class Methodoverride4 extends Methodoverride3 {
	public void run() {
		System.out.println("you are running");
		
	}
	public static void main(String[] args) {
		Methodoverride4 mo4= new Methodoverride4();
		mo4.run();
		Methodoverride3 mo3 = new Methodoverride3();
		mo3.run();
	}

}
