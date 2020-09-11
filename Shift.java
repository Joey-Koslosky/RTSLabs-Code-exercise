import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Shift {

	
	
	public static void main(String[] args) 
	{
		//creates new scanner
		Scanner scan = new Scanner(System.in);
		//Makes the string 
		String testString = "Hello World";
		//gets the amount to shift from the user
		System.out.print("Enter a number:");
	 	// gets user input and stores it in userNumber
		int userNum = scan.nextInt();
		//shifts the string the desired amount
	String newString = testString.substring(testString.length() - userNum) + 
	testString.substring(0, testString.length() - userNum);
		
		System.out.printf("Original string: %s, Shifted string: %s", testString, newString);

	}

}
