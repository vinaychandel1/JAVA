import java.awt.*;
class Demo_borderlayout{
	Frame f;
	Label l;
	Button b1,b2,b3,b4,b5;
	String s;
	Demo_borderlayout(String s){
		this.s=s;
		f=new Frame(s);
		f.setLayout(new BorderLayout());
		b1=new Button("NORTH");
		f.add(b1,BorderLayout.NORTH);
		b2=new Button("EAST");
		f.add(b2,BorderLayout.EAST);
		b3=new Button("CENTER");
		f.add(b3,BorderLayout.CENTER);
		b4=new Button("WEST");
		f.add(b4,BorderLayout.WEST);
		b5=new Button("SOUTH");
		f.add(b5,BorderLayout.SOUTH);
		f.setBackground(Color.green);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Demo_borderlayout("BorderLayout:");
	}
}