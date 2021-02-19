
public class InstanceVariable {
 int c;
 int a; 
 int b; 
 
 public void addition() {
	 a = 20;
	 b = 30;
	 c = a+b;
	 System.out.println("Sum of a and b is "+c);}
	 
public void difference() {
		 int x = 40;
		 int y = 30;
		 c = x-y;
		 System.out.println("Difference of x and y is "+c);
			 
 }
	public static void main(String[] args) {
		InstanceVariable ins1 = new InstanceVariable();
		ins1.addition();
		ins1.difference();
		
		

	}

}
