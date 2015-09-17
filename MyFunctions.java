// Program that has a function to print out whether the number 
// is greater than 10
public class MyFunctions {
	// Core method for an application, must match the signature exactly
	public static void main(String[] args) {
		// Create a variable and set it to first passed argument
		int passedValue = Integer.parseInt(args[0]);

		// Code to check if the number is greater than 10
		if( passedValue > 10) {
			System.out.println("The number " + passedValue + " is greater than 10");
		}
		// Code to check if the number is equal 10
		else if( passedValue == 10) {
			System.out.println("The number " + passedValue + " is equal 10");
		}
		// Code to check if the number is less than 10
		else if( passedValue < 10) {
			System.out.println("The number " + passedValue + " is less than 10");
		}
	}
}