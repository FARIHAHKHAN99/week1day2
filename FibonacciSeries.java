package week1.day2;

import java.util.Arrays;

public class FibonacciSeries {
	
	public static void main(String [] args) {

			    int n = 8, firstnum = 0, secondnum = 1;
			    System.out.println("Fibonacci Series till " + n + " terms:");

			    for (int i = 1; i <= n;i++) {
			      System.out.print(firstnum + ", ");
			      
			      int sum = firstnum + secondnum;
			      firstnum = secondnum;
			      secondnum =sum;
			      System.out.println(sum);
			    }
			  }		
		}

				


	

