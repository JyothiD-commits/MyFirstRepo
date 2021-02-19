class A
{
	A()
	{
		System.out.println("Constructor");
	}
	A(int a)
	{
		System.out.println("a= "+a);
	}
}
 class COverload {

	public static void main(String[] args) {
		A obj=new A();
		A obj1=new A(10);

	}
 }

