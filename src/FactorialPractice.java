import java.util.Scanner;

public class FactorialPractice {

	public static void main(String[] args) {
		System.out.println("Please enter the number:");
		Scanner num = new Scanner(System.in);
		int j = num.nextInt();
		int i;
		int a=1;
				
		for (i=1;i<=j;i++)
		{			
		    a=i*a;	
		   			
		}
		System.out.println("factorial of the number is "+a);
	}
}

