import java.util.Scanner;

public class SwitchConditionYear {

	public static void main(String[] args) {
		System.out.println("Please enter the month:");
		Scanner input = new Scanner(System.in);
		String month = input.nextLine();		
		//String month = "January",input.;
		
		switch (month)
		{
			case "January":
				System.out.println("January is the 1st month of the year");
				//break;
			case "February":
				System.out.println("February is the 2nd month of the year");
				//break;
			case "March":
				System.out.println("March is the 3rd month of the year");
				//break;
			case "April":
				System.out.println("April is the 4th month of the year");
				//break;
			case "May":
				System.out.println("May is the 5th month of the year");
				break;
			case "June":
				System.out.println("June is the 6th month of the year");
				break;
			case "July":
				System.out.println("July is the 7th month of the year");
				break;
			case "August":
				System.out.println("August is the 8th month of the year");
				break;
			case "September":
				System.out.println("September is the 9th month of the year");
				break;
			case "October":
				System.out.println("October is the 10th month of the year");
				break;
			case "November":
				System.out.println("November is the 11th month of the year");
				break;
			case "December":
				System.out.println("December is the 12th month of the year");
				break;
				default:
					System.out.println("Month doesnot match");
				
			
		}

	}

}
