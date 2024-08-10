package JavaClass1;

public class Array1 {

	public static void main(String[] args) {
		//declare an array
       int a[] = new int[5];
       //length of array
       System.out.println(a.length);
       
       for (int i=0;i<a.length;i++) {
    	   System.out.println(a[i]);
       }
       //assigned value an array
       a[0]=65;
       a[1]=35;
       a[2]=89;
       a[3]=56;
       a[4]=72;
       //a[5]=25;// java.lang.ArrayIndexOutOfBoundsException
       System.out.println(a[4]);
       //print all array elements
       for (int i=0;i<a.length;i++) {
    	   System.out.println(a[i]);
    	   
       }
	}

}
