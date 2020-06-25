import javax.swing.*;
public class Table extends JFrame{
	Table(){
		String heading[]={"Name","Address","Salary"};
		String items[][]={{"Ram","Delhi","10000"},{"Sham","Delhi","50000"},{"Amit","Hamirpur","30000"},};
		JTable jt=new JTable(items,heading);
		JScrollPane jp=new JScrollPane(jt);
		add(jp);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[]){
		new Table();
	}
}