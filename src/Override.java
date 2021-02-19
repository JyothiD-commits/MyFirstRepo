class Parent
{
void display()
{	
	System.out.println("Parent Method");
}
}
class Child extends Parent
{
	void display()
	{	
	System.out.println("Child Method");
	}

}
public class Override {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		Parent p=new Parent();
		p.display();
		
		
	}

}
