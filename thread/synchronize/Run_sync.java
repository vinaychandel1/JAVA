class Shared{
	int x;
	synchronized void show(String s,int a){
		x=a;
		System.out.println("Starting in method"+s+" "+x);
		try{
			Thread.sleep(4000);
		}
		catch(Exception e){

		}
		x=x+x;
		System.out.println("Ending in method"+s+" "+x);
	}

}
class Custom_thread extends Thread{
	Shared s;
	public Custom_thread(Shared s1, String str){
		super(str);
		s=s1;
		start();
	}
	public void run(){
		s.show(Thread.currentThread().getName(),10);
	}

}
class Run_sync{
	public static void main(String args[]){
	Shared st=new Shared();
	Custom_thread t1=new Custom_thread(st,"ONE");
	Custom_thread t2=new Custom_thread(st,"Two");
}
}