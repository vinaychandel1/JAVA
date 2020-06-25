import java.awt.*;
class Demo_frame1 extends Frame{
Demo_frame1(String s){
	super(s);
	setTitle("Frame1");
	setSize(400,400);
	setBackground(Color.blue);
	setVisible(true);
}
public static void main(String args[]){
	new Demo_frame1("Hello");
}
}