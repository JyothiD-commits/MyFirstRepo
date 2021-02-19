class Employee1{
	private int empid;//hiding
	public void setempid(int emp1) {
		empid = emp1;
	}
	public int getempid() {
		return empid;
	}
}
public class Company {

	public static void main(String[] args) {
		Employee1 e= new Employee1();
		e.setempid(101);
		System.out.println(e.getempid());

	}

}
