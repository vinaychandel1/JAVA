import javax.swing.*;
public class tab{
	JFrame f;
	JTabbedPane jtp;
	JButton b1,b2,b3,b4;
	JCheckBox c1,c2,c3;
	JComboBox cb;
	JPanel p1,p2,p3;
	tab(){
		f=new JFrame("JTabbedPane");
JTabbedPane jtp=new JTabbedPane();
p1=new JPanel();
b1=new JButton("INDIA");
b2=new JButton("CHINA");
b3=new JButton("AMERICA");
b4=new JButton("RUSSIA");
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
jtp.add("CITIES",p1);
p2=new JPanel();
c1=new JCheckBox("RED");
c2=new JCheckBox("BLUE");
c3=new JCheckBox("BLACK");
p2.add(c1);
p2.add(c2);
p2.add(c3);
jtp.add("COLOR",p2);
p3=new JPanel();
cb=new JComboBox();
cb.addItem("CHOCKLATE");
cb.addItem("MILKY");
cb.addItem("VANILA");
cb.addItem("BANANA");
cb.addItem("MANGO");
cb.addItem("NUTTY");
cb.addItem("STRAWARY");
p3.add(cb);
jtp.add("ICE-CREAM",p3);
f.add(jtp);

f.setSize(400,400);
	f.setVisible(true);

	}
public static void main(String args[]){
	new tab();
}
}