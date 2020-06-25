import java.io.*;
class Print_demo{
	public static void main(String args[])
	throws IOException{
		FileOutputStream fout=new FileOutputStream("abc.txt");
		PrintStream ps=new PrintStream(fout);
		FileOutputStream fout1=new FileOutputStream("xyx.txt");
		PrintStream ps1=new PrintStream(fout1);
		System.setOut(ps);
		System.out.println("hello i love india.");
		System.setOut(ps1);
		System.out.println("hello i am indian");
	}
}