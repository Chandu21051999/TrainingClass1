package JavaClass1;

public class Constructor2 {
	int id;//Global variable
	String name; //Global variable
	String address; //Global variable
	
	//Default constructor
	
	Constructor2(){
		System.out.println("Default constructor");
	}
	//Parameterized constructor
	Constructor2(int a, String b, String c){
		this.id=a;
		name =b;
		address =c;
		
	}
	public void displayInfo() {
		System.out.println(id +" " +name+ " " +address);
	}
	public static void main(String[] args) {
		Constructor2 c3 = new Constructor2( 1,"Chandu","Navi");
		c3.displayInfo();
		
		Constructor2 c4 =new Constructor2(2,"sff","sfff");
		c4.displayInfo();
		
	}
	
		

}
