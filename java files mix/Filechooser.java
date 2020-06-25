import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Filechooser extends JFrame implements ActionListener{
	JFileChooser jfc;
	Filechooser(){
		super();
		jfc=new JFileChooser("");
		JButton jb=new JButton("OK");
		jb.addActionListener(this);
		Container content=getContentPane();
		content.setBackground(Color.white);
		content.setLayout(new FlowLayout());
		content.add(jb);
		setSize(500,500);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		int x=jfc.showOpenDialog(null);
		if(x==JFileChooser.APPROVE_OPTION){
			File f=jfc.getSelectedFile();
			String s=jfc.getName(f);
			System.out.println(s);
		}
		if(x==JFileChooser.CANCEL_OPTION){
			System.out.println("CANCEL");
		}}
		public static void main(String args[]){
			new Filechooser();
		}
}