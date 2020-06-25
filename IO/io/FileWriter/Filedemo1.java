import java.io.*;
class Filedemo1{
	public static void main(String args[])
	throws IOException{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		FileWriter fw=new FileWriter("xyz.txt");
		PrintWriter pw=new PrintWriter(fw);
		String s=" ";
		while(!s.equals("stop")){
			s=br.readLine();
			pw.println(s);
		}
		br.close();
		fw.close();
	}
}