abstract class Vehicle{
	
	abstract void start(); 
}	
class car extends Vehicle{
	void start() {
		System.out.println("Car is Starting");
	}

}
class Scooter extends Vehicle {
	void start() {
		System.out.println("Scooter is starting");
	}

	public static void main(String[] args) {
		car c=new car();
		c.start();
		Scooter s=new Scooter();
		s.start();

	}

}
