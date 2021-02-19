class Dad
{
	Dad()
	{
		System.out.println("Parent Constructor");
	}
	
	int a=10;
	void display()
	{
		System.out.println("Parent Class");
	}
}
class Son extends Dad
{
	Son()
	{
		System.out.println("Child Constructor");
	}
	int a=30;
	void display()
	{
		System.out.println("Son Class");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
		
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Son c=new Son();
		c.display();

	}
}
