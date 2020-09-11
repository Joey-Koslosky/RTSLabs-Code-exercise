import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class AboveBelow {
	



	public static void main(String[] args) 
	{
		//Initializing the Array
		int [] labNumbers = new int [] {1,5,2,1,10};
		//above keeps track of the amount of numbers larger than the input
		int above = 0;
		// below keeps track of the amount of numbers smaller than the input
		int below = 0;
		// The input the will be comparing
		int input = 6;
		
	    	// traverses through the array
	    	for(int i = 0; i < labNumbers.length; i++) 
	    	{
	    	/*This program does not handle the case of the users number and the number
	     	in the array being the same, if they are it does not count toward either above or below*/
			
	//checks if the number in the array is above the user number
		    	if(input < labNumbers[i]) 
		    	{
		    		above++;
		    	}
		    	//checks if the number in the array is below the user number
		    	else if(input > labNumbers[i])
		    	{
		    		below++;
		    	}
		    }
		System.out.println("For the array: " + Arrays.toString(labNumbers));
		System.out.printf("The user input was %d, there were %d numbers above "
				+ "and %d numbers below.", input, above, below);
	}


}
