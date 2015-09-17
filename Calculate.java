// class Calculate
// adding arguments, separated by spaces
// version 1.0

// Can only have one public class
// This class name needs to match the file name Calculate.java
// Creates a file with same name that ends in *.class
public class Calculate {
 // Core method for an application, must match the signature exactly
 public static void main(String[] arg) {
  // Set a variable of type int named total to 0
  int total = 0;
  // Iterate through a loop, 
   // Init: Set int type variable i = 0
   // Condition: As long as i is less than the total length of args array
   // Increment: increas i by 1 for each iteration
  for(int i = 0; i < arg.length; i++) {
   // add a value to the total for each element in the args array
   total += Integer.parseInt(arg[i]);
  } 
  // Print out to the console the total of all the elements combined
  System.out.println("The total is " + total);
 }
}