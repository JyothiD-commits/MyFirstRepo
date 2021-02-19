import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		int j = i%2;
		
				
		if (j==0)
		{
			
			System.out.println("Number is even");
		}
		else {
			System.out.println("number is odd");
		}

	}

}
