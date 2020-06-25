

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demoinit
 */
@WebServlet(
		urlPatterns = { "/Demoinit" }, 
		initParams = { 
				@WebInitParam(name = "image", value = "D:/workspace2/project2/WebContent/a.jpg")
		})
public class Demoinit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demoinit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig sc=getServletConfig();
		String img=sc.getInitParameter("image");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html><body background="+img+">");
		String user=request.getParameter("user");
		String pass=request.getParameter("password");
		//ServletContext cotx=getServletContext();
		out.println("before dispatcher");
		try{
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			    
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:system/crisma@localhost");
				Statement s= con.createStatement();
				//String q1="create table rk1(id number(3)primary key,name varchar2(10))";
//				s.executeUpdate(q1);
				//String q2="insert into rk1 values('1','rohit')";
				//s.executeUpdate(q2);
				String q3="select * from zcc.vinay";
				ResultSet rs=s.executeQuery(q3);
				while(rs.next()){
				if(user.equals(rs.getString(1))&& pass.equals(rs.getString(2))){
					
				//response.sendRedirect("success");
					RequestDispatcher rd=request.getRequestDispatcher("success");
					rd.forward(request,response);
				
				}
				else{
					//response.sendRedirect("error");
					RequestDispatcher rd=request.getRequestDispatcher("error");
					rd.forward(request,response);
				}
				}
				out.println("after dispatcher");
				out.println("</body></html>");
			}
			catch(SQLException e){
				System.out.println(e);
				}
				catch(Exception i){
				System.out.println(i);
				}
	}

}
