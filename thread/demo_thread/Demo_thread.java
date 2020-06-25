class thread1 extends Thread{
	thread1(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(getName());
		}
	}
}
class Demo_thread{
	public static void main(String args[]){
		thread1 t1=new  thread1("hello world");
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}