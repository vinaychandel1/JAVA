package P2;
public class protection2 extends P1.protection{
	protection2(){
		System.out.println("Derived other package constructor");
		//System.out.println("n="+n);
		//System.out.println("private="+pri);
		System.out.println("protected="+pro);
		System.out.println("public="+pub);
	}
}