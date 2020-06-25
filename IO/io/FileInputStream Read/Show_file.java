import java.io.*;

class Show_file{
	public static void main(String args[])
	throws IOException{
		int i;
		FileInputStream f;
		try{
			f=new FileInputStream("abc.txt");
			do{
				i=f.read();
				if(i!=-1)
				{
					System.out.print(i);
				}
			}
			while(i!=-1);
				f.close();
		}
		catch(IOException e){
			System.out.println(e);
		}

	}
}