import java.awt.*;
class Demo_menubar{
	Frame f;
	MenuBar mbr;
	Menu file,edit;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8;
	CheckboxMenuItem i1;
	String s;
	Demo_menubar(String s){
		this.s=s;
		f=new Frame(s);
		mbr=new MenuBar();
		file=new Menu("File");
		m1=new MenuItem("New");
		m2=new MenuItem("Open");
		m3=new MenuItem("Save");
		m4=new MenuItem("Save As");
		file.add(m1);
		file.add(m2);
		file.add(m3);
		file.add(m4);
		edit=new Menu("Edit");
		m5=new MenuItem("Undo");
		m6=new MenuItem("Cut");
		m7=new MenuItem("Copy");
		m8=new MenuItem("Delete");
		
		edit.add(m5);
		edit.add(m6);
		edit.add(m7);
		edit.add(m8);
		
		f.setMenuBar(mbr);
		mbr.add(file);
		mbr.add(edit);
		f.setBackground(Color.yellow);
		f.setSize(600,600);
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Demo_menubar("MENUBAR:");
	}
}