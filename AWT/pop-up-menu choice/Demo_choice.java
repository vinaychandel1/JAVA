import java.awt.*;
class Demo_choice{
	Frame f; 
	Button b;
	Label l;
	String s;
	Choice subject,electure;
	Demo_choice(String s)
	{
		this.s=s;
		f=new Frame(s);
		subject=new Choice();
		subject.add("ENGLISH");
		subject.add("MATHS");
		subject.add("COMPUTER SCIENCE");
		subject.add("PHYSICS");
		electure=new Choice();
		electure.add("35");
		electure.add("38");
		electure.add("44");
		electure.add("42");
		b=new Button("click");
		l=new Label("Subject details:",Label.RIGHT);
		l.setBounds(40,40,60,60);
		b.setBounds(0,0,70,70);
		f.setLayout(new FlowLayout());
		f.setBackground(Color.green);
		f.add(l);
		f.add(subject);
		f.add(electure);
		f.add(b); 
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Demo_choice("hello");
	}
} 