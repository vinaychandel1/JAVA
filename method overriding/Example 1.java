class Animal{
    public void move(){
        System.out.println("Animal can Move");
    }
}
class Dog extends Animal{
   public void move(){
        System.out.println("Dog can walk and Run");
    } 
}
public class Main
{
	public static void main(String[] args) {
		Animal a1=new Animal();
		Dog dog=new Dog();
		Animal a2=new Dog();
		a1.move();
		dog.move();
		a2.move();
	}
}
/*OUTPUT:
Animal can Move

Dog can walk and Run

Dog can walk and Run


*/
