import java.util.Scanner;

public class ScannerConditionWeek {

	public static void main(String[] args) {
		System.out.println("Please enter the weekday:");
		Scanner input = new Scanner(System.in);
		String week = input.nextLine();
		
		switch(week)
		{
		case "Sunday":
			System.out.println("Sunday is the last day of the week");
		break;
		case "Monday":
			System.out.println("Monday is the first day of the week");
		break;
		case "Tuesday":
			System.out.println("Tuesday is the second day of the week");
		break;
		case "Wednesday":
			System.out.println("Wednesday is the third day of the week");
		break;
		case "Thursday":
			System.out.println("Thursday is the fouth day of the week");
		break;
		case "Friday":
			System.out.println("Friday is the fifth day of the week");
		break;
		case "Saturday":
			System.out.println("Saturday is the sixth day of the week");
		break;
		default:
			System.out.println("Weekday doesnot match");
		
		
		
		}
		

	}

}
