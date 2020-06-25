import java.util.*;
class Demovector{
	public static void main(String args[]){
		Vector v=new Vector(3,2);
		System.out.println(v.size());
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("a");
		v.addElement("b");
		System.out.println(v.size());
		v.removeElementAt(2);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			String s=(String)e.nextElement();
			System.out.println(s);
		}

	}
}