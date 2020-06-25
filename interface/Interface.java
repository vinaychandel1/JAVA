interface test{
	int b=30;
	void show();
	void display();
}
class a implements test{
	public void show(){
		System.out.println("Hello i am in class A");
	}
	public void display(){
		System.out.println("Helo i am in display class A");
	}
} 
class Interface{
	public static void main(String args[]){
		a i=new a();
		i.show();
		i.display();
	}
}