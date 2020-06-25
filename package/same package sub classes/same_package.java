package P1;
public class same_package{
	same_package(){
		protection p=new protection();
		System.out.println("same_package class:");
		System.out.println("n="+p.n);
		//System.out.println("private="+p.pri);
		System.out.println("protected="+p.pro);
		System.out.println("public="+p.pub);
	}
}