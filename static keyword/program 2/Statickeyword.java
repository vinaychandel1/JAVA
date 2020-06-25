class test{
	static int a=10;
	static int b=20;
	test(int a){
		System.out.println("simple constructor"+a);
	}
 static void meth(int c){
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
}
static{
	System.out.println("HERE Static has first priority 1st");
	a=a+b;
}
static{
	System.out.println("HERE Static has second priority 2nd");
}
static{
	System.out.println("HERE Static has second priority 3rd");
}
}
class Statickeyword{
	public static void main(String args[])
	{
		test j=new test(30);
		j.meth(30);
	}
}