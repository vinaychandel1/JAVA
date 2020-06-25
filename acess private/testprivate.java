class acess{
	int a;
	public int b;
	private int c;
	void set(int i){
		c=i;
	}
	int get(){
		return c;
	}

}
class testprivate{
	public static void main(String args[])
	{
		acess z=new acess();
		z.a=10;
		z.b=20;
		z.set(30);
		System.out.println("the value of a:"+z.a);
		System.out.println("the value of b:"+z.b);
	    System.out.println("the value of c:"+z.get());
	}
}