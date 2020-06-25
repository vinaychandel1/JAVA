package P1;
public class protection{
	int n=1;
	private int pri=2;
	protected int pro=3;
	public int pub=4;
	public protection(){
		System.out.println("Base constructor:");
		System.out.println("n="+n);
		System.out.println("private="+pri);
		System.out.println("protected="+pro);
		System.out.println("public="+pub);
	}
}
package P1;
public class derived extends protection{
	derived(){
		System.out.println("Derived extends protection:");
		System.out.println("n="+n);
		System.out.println("private="+pri);
		System.out.println("protected="+pro);
		System.out.println("public="+pub);
	}
}
package P1;
public class same_package{
	same_package(){
		protection p=new protection();
		System.out.println("same_package class:");
		System.out.println("n="+n);
		System.out.println("private="+pri);
		System.out.println("protected="+pro);
		System.out.println("public="+pub);
	}
}
package P2;
public class protection2 extends P1.protection{
	protection2(){
		System.out.println("Derived other package constructor");
		System.out.println("n="+n);
		System.out.println("private="+pri);
		System.out.println("protected="+pro);
		System.out.println("public="+pub);
	}
}
package P2;
public class Demo1{
public static void main(String args[]){
	protection2 ob=new protection2();
}
}