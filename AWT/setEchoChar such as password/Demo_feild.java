import java.awt.*;
class Demo_feild{
	Frame f; 
	TextField name,password;
	Label l1,l2;
	String s;
	Demo_feild(String s)
	{
		this.s=s;
		f=new Frame(s);
		l1=new Label("Name:");
		l2=new Label("Password:");
		name=new TextField(12);
		password=new TextField(10);
		password.setEchoChar('*');
		f.setLayout(new FlowLayout());
		f.setBackground(Color.green);
		f.add(l1);
		f.add(name);
		f.add(l2);
		f.add(password);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Demo_feild("hello");
	}
} 