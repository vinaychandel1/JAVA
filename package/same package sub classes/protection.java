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