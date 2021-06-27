/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void model();
    public void changeGear(){
        System.out.println("Gear Change");
    }
}
class Yamaha extends Bike{
    //Super();//compiler will add constructor automatically
    void model(){
        System.out.println("Model is Yamaha20");
    }
}

public class Main
{
	public static void main(String[] args) {
	Bike b=new Yamaha();
	b.model();
	b.changeGear();
	}
}
/*Output:
Bike is created

Model is Yamaha20

Gear Change

*/
