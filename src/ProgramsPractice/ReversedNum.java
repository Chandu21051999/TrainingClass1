package ProgramsPractice;

public class ReversedNum {

	public static void main(String[] args) {
		
     int number=25632,reversednum=0;

     while(number!=0) {
    	 int remainder =number%10;
    	 reversednum = reversednum*10+remainder;
    	 number=number/10;
     }
     
    	 System.out.println("The reverse of the given number:" +  reversednum);
    	 
    	 
     }
	}


