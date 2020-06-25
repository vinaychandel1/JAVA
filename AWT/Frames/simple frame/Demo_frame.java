import java.awt.*;
class Demo_frame extends Frame{
	Demo_frame(String s){
		super(s);
		setTitle("Frame");
		setSize(600,400);
		setVisible(true);
		System.out.println("hai.........");
	}
	public static void main(String args[]){
		new Demo_frame("hello world");
	}
}