class Vehicle{
	void read(){
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void read(){
	System.out.println("Bike is running");
}
}
class Scooter extends Vehicle{
	void read(){
	System.out.println("Scooter is running");
	}
}
class Method_overriding{
	public static void main(String args[])
	{
		Bike j=new Bike();
		Vehicle k=new Vehicle();
		Scooter i=new Scooter();
		j.read();
		i.read();
		k.read();
	}
}