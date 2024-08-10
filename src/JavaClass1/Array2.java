package JavaClass1;

public class Array2 {

	public static <object> void main(String[] args) {
		// we can write an array in below fashion as well 
		int b[]= {1,2,3,4,5};//defining an int array
		String s[]={"Hi","Hello"}; // define string array,2,3,
		Object a[]= {1,2,3,4,5,"Selenium",4,5,5};
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		System.out.println(a[5]);
        System.out.println(b[4]);
        System.out.println(s[1]);
        a[5]="Testing";
        System.out.println(a[5]);

	}

}
