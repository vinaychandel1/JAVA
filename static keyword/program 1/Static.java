class test{
	static int a=10;
	static int b=20;
	test(){
		System.out.println("simple constructor");
	}
 static void meth(int c){
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println("c="+c);
}
static{
	System.out.println("Static has first priority");
	a=a+b;
}
}
class Static{
	public static void main(String args[])
	{
		test j=new test();
		j.meth(30);
	}
}