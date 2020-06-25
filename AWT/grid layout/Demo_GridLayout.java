import java.awt.*;
class Demo_GridLayout{
	Frame f;
	Label l;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	String s;
	Demo_GridLayout(String s){
		this.s=s;
		f=new Frame(s);
		b1=new Button("b1");
		b2=new Button("b2");
		b3=new Button("b3");
		b4=new Button("b4");
		b5=new Button("b5");
		b6=new Button("b6");
		b7=new Button("b7");
		b8=new Button("b8");
		b9=new Button("b9");
		f.setLayout(new GridLayout(3,8,3,7));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.setBackground(Color.green);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Demo_GridLayout("GridLayout:");
	}
}