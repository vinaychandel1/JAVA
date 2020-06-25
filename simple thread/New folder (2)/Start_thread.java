class Multi extends Thread{
	Multi(String j){
		super(j);
	}
	public void run(){
		for(int i=0;i<=5;i++){
		System.out.println(getName());
	}
	}
}
class Start_thread{
	public static void main(String args[]){
		Multi t1=new Multi("Hello World");
		t1.start();
	}
}