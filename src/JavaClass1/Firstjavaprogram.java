package JavaClass1;

public class Firstjavaprogram {

	//Double slash used for comment a line
	//main method is the predefined method
	//Short cut write main method --Type main Press  control+space key
	int a=10; //Global variable
	static int b=15; // static variable 
	public static void main(String[] args) {
		//short to write system.out.prinln()
		//type syso inside the method and press ctrl+Space key
    System.out.println("Chandu");
    System.out.println("Navi");
    amethod();
    bmethod();
    int c=25; // Local variable 
    
	}

	//USer defined method
 public static void amethod(){
	 System.out.println("Hello");
 }
 //User defined method
 public static void bmethod() {
	 System.out.println("Java Class");
	 int d=12;// Local variable
 }
}

//Inside main method only java program execute outside methods need to execute na we need to defined i
//inside main method define those
