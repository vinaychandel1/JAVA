import java.awt.*; 
import javax.swing.*; 

public class Box extends JFrame 
{ 
JFrame f=new JFrame("Box Layout"); 
JButton b1,b2,b3,b4,b5; 
public Box() 
{ 
b1=new JButton("Button1"); 
b2=new JButton("Button2"); 
b3=new JButton("Button3"); 
b4=new JButton("Button4"); 
b5=new JButton("Button5"); 

setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); 
add(b1);add(b2);f.add(b3);f.add(b4);f.add(b5); 
setSize(400,400); 
setVisible(true); 

} 
public static void main(String args[]) 
{ 
new Box(); 

} 
}