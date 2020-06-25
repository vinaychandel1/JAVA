import java.awt.*;
class Demo_button{
	Frame f;
	Label l; 
	Button b;
	String s;
	Demo_button(String s)
	{
		this.s=s;
		f=new Frame(s);
		l=new Label("hello world");
		b=new Button("click");
		f.setLayout(null);
		l.setBounds(0,0,50,60);
		b.setBounds(60,70,50,60);
		f.add(l);
		f.add(b);
		f.setBackground(Color.green); 
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Demo_button("hello");
	}
} 