
public class Employee {

String name;
int empid;
static String company= "ABC Company";
Employee(String name, int empid)
{
	this.name=name;
	this.empid=empid;
}
void display() {
	System.out.println(name+" "+empid+" "+company);
	
}
	public static void main(String[] args) {
	Employee e1= new Employee("Naga",101);
	Employee e2= new Employee("Jyothi",102);
	Employee e3= new Employee("Dandemraju",103);
	e1.display();
	e2.display();
	e3.display();

	}

}
