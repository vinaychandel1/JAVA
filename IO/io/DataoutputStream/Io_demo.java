import java.io.*;
class Io_demo{
	public static void main(String args[])
	throws IOException{
		FileOutputStream fos=new FileOutputStream("test.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeDouble(98.60);
		dos.writeInt(100);
		dos.writeBoolean(true);
		dos.close();
		FileInputStream fis=new FileInputStream("test.txt");
		DataInputStream dis=new DataInputStream(fis);
		double d=dis.readDouble();
		int i=dis.readInt();
		boolean b=dis.readBoolean();
		System.out.println("here are the values:"+d+" "+i+" "+b);
		dis.close();
	}
}