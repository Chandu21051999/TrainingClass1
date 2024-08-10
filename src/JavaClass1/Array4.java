package JavaClass1;

public class Array4 {

	public static void main(String[] args) {
		// multi dimension array
		 int a[][]= {{1,2,3,7},{4,5,6,8},{7,8,9,6}};
		  int row=a.length;
		  int columns =a[1].length;
		  System.out.println("Total columns : "+ columns);
		  int row1 =a.length;
		  System.out.println("Total rows : "+ row1);
		 
		 //print matrix
		  //Inner loop
		  for (int i=0;i<row;i++) {
			  //outer loop
			  for (int j=0; j<columns;j++) {
				  System.out.println(a[i][j]+" ");	
			  }
			  System.out.println();
		  }
		 

	}

}
