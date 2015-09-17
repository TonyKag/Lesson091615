// class Calculate
// adding arguments, separated by spaces
// version 1.0

public class Calculate {
 public static void main(String[] args) {
  int total = 0;
  for(int i = 0; i < args.length; i++) {
   total += Integer.parseInt(args[i]);
  } 
  System.out.println("The total is " + total);
 }
}