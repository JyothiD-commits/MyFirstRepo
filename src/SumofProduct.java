import java.util.Scanner;

public class SumofProduct {

	public static void main(String[] args) {
		System.out.println("Please enter the number:");
		
		Scanner num = new Scanner(System.in);
		int j = num.nextInt();
		
		int i,a;
		
		int p=0;
		
		for(i=1;i<=10;i++)
		{
			 a=i*j;
			 p=p+a;
			 
		}
		
		System.out.println( "Sum of the products is " +p);
				
	}
	

}
