package week1.day2;

import java.util.Iterator;

public class PrimeNum {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		int  input=3;

		// Declare a boolean variable flag as false

		boolean flag=false;

		// Iterate from 2 to half of the input
		
		// Divide the input with each for loop variable and check the remainder

		for (int i = 2; i <= input/2 ; i++) { 
		
			if (input%i==0) {
				
			// Set the flag as true when there is no remainder
flag = true;
				
			// break the iterator
break;
			}
		}

		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match 
	
if (!flag) {
	System.out.println("prime no.");
	
} 
else {
	System.out.println("not a prime no.");
			
			
}
	}

}
