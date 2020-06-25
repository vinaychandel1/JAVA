import java.awt.*;
import java.awt.event.*;
class Demo_event implements ActionListener{
	Frame f;
	Label l;
	Button b;
	String s;
	Demo_event(String s){
		this.s=s;
		f=new Frame(s);
		l=new Label("ZCC");
		b=new Button("OK");
		b.addActionListener(this);
		f.setLayout(new BorderLayout());
		f.add(l,BorderLayout.NORTH);
		f.add(b,BorderLayout.SOUTH);
		f.setBackground(Color.green);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b){
			l.setText("WELCOME TO ZCC");
		}
	}
	public static void main(String args[]){
		new Demo_event("EVENT:");
	}
}