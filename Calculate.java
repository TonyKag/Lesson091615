// class Calculate
// adding arguments, separated by spaces
// version 1.0

public class Calculate {					// init class
 public static void main(String[] args) {	// create main method
  int total = 0;							// init result variable and init as 0
  for(int i = 0; i < args.length; i++) {	// loop for calculating all arguments
   total += Integer.parseInt(args[i]);		// parse each argument into int type
  } 
  System.out.println("The total is " + total); // Output result
 }
}