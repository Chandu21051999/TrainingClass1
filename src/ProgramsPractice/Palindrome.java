package ProgramsPractice;

public class Palindrome {

	public static void main(String[] args) {
 
		int number=6556,reversednum=0,remainder;
		
		int originalnum=number;
		while(number!=0) {
			 remainder = number%10;
			 reversednum=reversednum*10+remainder;
			 number/=10;
		}
		if(originalnum==reversednum) {
			System.out.println("The given number is:" +" Is Palindrome");
			
		}
		else {
			System.out.println("The given number is :"+"Is not Oalindrome" );
		}
	}

}
