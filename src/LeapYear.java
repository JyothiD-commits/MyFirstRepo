import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please enter a year");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int year1 =year%4;
		
		if (year1==0)
		{
			System.out.println("This is a Leap Year");
		}
		else
		{
			System.out.println("This is not a Leap Year");
		}
		

	}

}
