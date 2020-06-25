import java.sql.*;
class Dbconnection1{
public static void main(String args[]){
try{
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    
	Connection con=DriverManager.getConnection("jdbc:odbc:dsn","system","crisma");
	Statement s= con.createStatement();
	String q1="create table zcc(id number(3)primary key,name varchar2(10))";
	s.executeUpdate(q1);
	String q2="insert into zcc values ('2', 'amit')";
	s.executeUpdate(q2);
	String q3="select * from zcc";
	ResultSet rs=s.executeQuery(q3);
	while(rs.next()){
	System.out.println("user name:  "+rs.getString(1));
	System.out.println("user password:  "+rs.getString(2));
	}
}
catch(SQLException e){
	System.out.println(e);
	}
	catch(Exception i){
	System.out.println(i);
	}
	}
}