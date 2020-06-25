class thread1 extends Thread{
	thread1(String s){
		super(s);
		start();

	}
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				System.out.println(getName());
				sleep(5000);
			}
			catch(Exception e){
			System.out.println(e);
		}
		}
		
	}
}
class thread2 extends Thread{
	thread2(String s){
		super(s);
		start();
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("second Thread");
		}
	}
}
class Demo_thread1{
	public static void main(String args[]){
		thread1 t1=new thread1("my thread 1");
		thread2 t2=new thread2("my thread 2");
		System.out.println(Thread.currentThread().getName());

			}
}
