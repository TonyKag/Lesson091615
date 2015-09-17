// Write a  java program to print the name of month using switch statement

public class MonthName {
	public static void main(String[] args) {
		
		String month = "";
		Boolean error = false;
		int i = Integer.parseInt(args[0]);
		
		switch (i) {

		case 1: 
		month = "January";
		//System.out.println("Your month: " + month);
		break;

		case 2: 
		month = "February";
		//System.out.println("Your month: " + month);
		break;

		case 3: 
		month = "March";
		//System.out.println("Your month: " + month);
		break;

		case 4: 
		month = "April";
		//System.out.println("Your month: " + month);
		break;

		case 5: 
		month = "May";
		//System.out.println("Your month: " + month);
		break;

		case 6: 
		month = "June";
		//System.out.println("Your month: " + month);
		break;

		case 7: 
		month = "July";
		//System.out.println("Your month: " + month);
		break;

		case 8: 
		month = "August";
		//System.out.println("Your month: " + month);
		break;

		case 9: 
		month = "September";
		//System.out.println("Your month: " + month);
		break;

		case 10: 
		month = "October";
		//System.out.println("Your month: " + month);
		break;

		case 11: 
		month = "November";
		//System.out.println("Your month: " + month);
		break;

		case 12: 
		month = "December";
		//System.out.println("Your month: " + month);
		break;

		default: System.out.println("Number must be fron 1 to 12");
		error = true;
		break;
		}
		
		if (error == false)
			System.out.println("Your month: " + month);
	}
}