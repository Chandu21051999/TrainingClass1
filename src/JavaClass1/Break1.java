package JavaClass1;

public class Break1 {

	public static void main(String[] args) {
         //outer loop
		for(int i=1;i<3;i++) {
			//Inner loop
			for (int j=1;j<3;j++) {
				//If statement
				if(i==2 &&j==2) {
					break;
					
				}
				System.out.println(i + ""+j);
			}
			System.out.println("control came out from the inner loop");
		}
		System.out.println("Control came out from the outer loop");
	}

}
