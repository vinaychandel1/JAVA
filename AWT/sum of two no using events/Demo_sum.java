import java.awt.*;  
import java.awt.event.*;  
public class Demo_sum implements ActionListener{  
Frame f;
Label l1,l2,l3;
Button b1,b2;
String s;
TextField t1,t2,t3;
Demo_sum(String s){
	this.s=s;
	f=new Frame(s);
	f.setLayout(null);
	l1=new Label("Enter the value 1:");
	l1.setBounds(30,30,100,40);
	f.add(l1);
	t1=new TextField(4);
	t1.setBounds(130,30,50,30);
	f.add(t1);
	l2=new Label("Enter the value 2:");
	l2.setBounds(30,70,100,40);
	f.add(l2);
	t2=new TextField(4);
	t2.setBounds(130,70,50,30);
	f.add(t2);
	l3=new Label("SUM:");
	l3.setBounds(30,110,100,40);
	f.add(l3);
	t3=new TextField(4);
	t3.setBounds(130,110,50,30);
	f.add(t3);
	b1=new Button("ADD");
	b1.setBounds(30,150,70,30);
	f.add(b1);
	
	b2=new Button("CLEAR");
	b2.setBounds(130,150,70,30);
	f.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	f.setBackground(Color.red);

	f.setSize(500,450);
	f.setVisible(true);

}
public void actionPerformed(ActionEvent ae){
	if(ae.getSource()==b1){
		int a,b,c;
		String s3,s2;
		s3=t1.getText();
		s2=t2.getText();
		a=Integer.parseInt(s3);
		b=Integer.parseInt(s2);
		c=a+b;
		t3.setText(Integer.toString(c));
	}

	if(ae.getSource()==b2){
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
	}

}

public static void main(String args[]){
	new Demo_sum("sum of two no's");
   }
}