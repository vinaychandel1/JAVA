import java.awt.*;
class Demo_radiobutton{
	Frame f; 
	Button b;
	String s;
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg;
	Demo_radiobutton(String s)
	{
		this.s=s;
		f=new Frame(s);
		cbg=new CheckboxGroup();
		b=new Button("click");
		c1=new Checkbox("ENGLISH",cbg,true);
		c2=new Checkbox("MATHS",cbg,false);
		c3=new Checkbox("Computer Science",cbg,false);
		c4=new Checkbox("PHYSICS",cbg,false);
		f.add(b);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		b.setBounds(0,0,40,40);
		f.setLayout(new FlowLayout());
		f.setBackground(Color.yellow); 
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Demo_radiobutton("hello");
	}
} 