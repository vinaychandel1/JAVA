package P1;
class test{
	String name;
	double string;
	double salary;
	test(String s,double d)
	{
		name=s;
		salary=d;
	}
	void show(){
		if(salary>0){
			System.out.println(name+":$"+salary);
		}
	}
}
class Test_demo{
	public static void main(String args[]){
		test t[]=new test[4];
		t[0]=new test("Ram",5000);
		t[1]=new test("Rohot",9000);
		t[2]=new test("Vinay",50000);
		t[3]=new test("MAndeep",9000);
		//t[4]=new test("Aman",8000);
		for(int i=0;i<4;i++){
			t[i].show();
		}
	}
}