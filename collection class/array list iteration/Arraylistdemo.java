//program of array and iteration.
import java.util.*;
class Arraylistdemo{
	public static void main(String args[]){
		int j;
		ArrayList al=new ArrayList();
		int x[]={1,-1,2,-2,3,-3,4,-4,5,-5};
		for(j=0;j<x.length;j++){
			al.add(x[j]);
		}
		System.out.println(al);
		Iterator i=al.iterator();
		while(i.hasNext())
{
			Integer z=(int)i.next();
			if(z<0){
				i.remove();
			}
		}
		System.out.println(al);
	}
}
