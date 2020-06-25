import java.io.*;
class My_byte_writer{
	public static void main(String args[])
		throws IOException
		{
			ByteArrayOutputStream fw=new ByteArrayOutputStream();
			String s="India is my country 1233445";
			byte ch[]=s.getBytes();
			for(int i=0;i<ch.length;i++){
				fw.write(ch[i]);
			}
			fw.writeTo(new FileOutputStream("abc.txt"));
			System.out.println(fw.toString());
		}
}