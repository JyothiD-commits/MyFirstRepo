class J
{
	void add()
	{
		int a=10;int b=20;
		int c=a+b;
		System.out.println("Sum= "+c);
	}
	void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Sum= "+z);
	}
}
 public class MOverload {

	public static void main(String[] args) {
		J obj=new J();
		obj.add();
		obj.add(24,36);

	}
 }


