class A extends Thread{
	int x;
	A(int x){
	super(x);
	start();
	}
	public void run(){
	for(int i=0;i<=5;i++){
		System.out.println(getName());
	}
	}
}
class Demo_a{
	public static void main(String args[]){
		A obj=new A(12);
	}
}