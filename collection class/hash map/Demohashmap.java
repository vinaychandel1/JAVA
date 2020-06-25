//Program for HashMap
import java.util.*;
class Demohashmap{
	public static void main(String args[]){
		HashMap hm=new HashMap();
		hm.put("101","Amit");
		hm.put("102","Rohit");
		hm.put("103","Amit");
		hm.put("104","Vinay");
		hm.put("105","Aman");
		hm.put("102","Raman");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
		Map.Entry e=(Map.Entry)i.next();
		String k=(String)e.getKey();
		String v=(String)e.getValue();
		System.out.println(k+"="+v);			
		}
	}
}