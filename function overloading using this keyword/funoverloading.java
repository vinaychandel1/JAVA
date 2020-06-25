class overload{
	int length,breadth;
	int mul(int length,int breadth)
	{
      this.length=length;
      this.breadth=breadth;
      return length*breadth;
	}
	int mul(int length){
		this.length=length;
		return length;
	}
}
class funoverloading{
	public static void main(String args[])
	{
		overload o=new overload();
		System.out.println("area of rectangle="+o.mul(20));
		System.out.println("length="+o.mul(30,40));
	}
}