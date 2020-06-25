import java.awt.*;
import java.awt.event.*;
class My_frame implements ActionListener
{
	Frame f;
	Button b1,b2;
	My_frame()
	{
		f=new Frame();
		b1=new Button("rectangle");
		b1.setBounds(50,50,100,20);
		b1.addActionListener(this);
		f.add(b1);
		b2=new Button("filled rectangle");
		b2.setBounds(150,50,100,20);
		b2.addActionListener(this);
		f.add(b2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1){
		Graphics g=f.getGraphics();
			g.setColor(Color.blue);
			g.drawRect(90,90,200,200);
	}
	if(ae.getSource()==b2){
		Graphics g=f.getGraphics();
		g.setColor(Color.red);
		g.fillRect(120,120,100,100);
	}
}
public static void main(String args[])
{
	new My_frame();
}
}