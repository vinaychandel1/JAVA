class Box{
	int length,breadth,height;
	Box(int l,int b,int h)
	{
		length=l; breadth=b; height=h;
	}
	public void showdimension()
	{
		System.out.println("length="+length);
		System.out.println("breadth="+breadth);
		System.out.println("height="+height);
	}
}
class Example
{
	public static void main(String args[])
	{
		Box smallbox=new Box(10,20,30);
		smallbox.showdimension();
	}
}