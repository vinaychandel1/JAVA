import java.awt.*;
class Demo_checkbox{
	Frame f; 
	Button b;
	String s;
	Checkbox c1,c2,c3,c4;
	Demo_checkbox(String s)
	{
		this.s=s;
		f=new Frame(s);
		b=new Button("click");
		c1=new Checkbox("ENGLISH",true);
		c2=new Checkbox("MATHS");
		c3=new Checkbox("Computer Science");
		c4=new Checkbox("PHYSICS");
		f.add(b);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.setLayout(new FlowLayout());
		f.setBackground(Color.green); 
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Demo_checkbox("hello");
	}
} 