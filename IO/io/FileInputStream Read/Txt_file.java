import java.io.*;
class Txt_file{
	public static void main(String args[])
	throws IOException
	try{
		FileOutputStream d=new FileOutputStream("e:\\jvm\\zxc.txt");
		String s="Hello I made a output txt file.1234567890.";
		byte ch[]=s.getBytes();
		for(int i=0;i<ch.length;i++){
			d.write(ch[i]);
		}
		d.close();
	}
	catch(IOException e){
	}
}