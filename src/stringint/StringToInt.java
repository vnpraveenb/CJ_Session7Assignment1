package stringint;

import java.util.Scanner; // Importing Scanner Class

/**
 * This class is used to convert an int variable to String using an inbuilt function of String class.
 * @author Praveen
 */
public class StringToInt {


	public static void main(String[] args){
		
		 
		// Getting the user input for the integer variable
		Scanner scan =new Scanner(System.in); //Creating object of Scanner Class		
		System.out.println("Please enter integer To Convert into String: ");
		
		int i = scan.nextInt(); // Initialising the the user input to int variable i
		scan.close();

		/* Using String.valueOf() method to convert the integer value into String 
		 * and storing it in the String object str 
		 */
 		String str = String.valueOf(i); 
		
		System.out.println("The integer value is: " + i);
		System.out.println("The integer Value after conversion to String is: " + str);
	}
}
