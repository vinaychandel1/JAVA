class obj{
int length,breadth;
int mul()
{
return length*breadth;
}
}
class Test1{
public static void main(String args[])
{
obj j=new obj();
j.length=20;
j.breadth=20;
int area;
area=j.mul();
System.out.println("area of box:"+area);
}
}
