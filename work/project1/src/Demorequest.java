

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demorequest
 */
@WebServlet("/Demorequest")
public class Demorequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demorequest() {
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
		out.println("<html><body>");
		String user=request.getParameter("user");
		String pass=request.getParameter("password");
		//ServletContext cotx=getServletContext();
		out.println("before dispatcher");
		if(user.equals("4")&& pass.equals("amit")){
		try{
				
					
				//response.sendRedirect("success");
					RequestDispatcher rd=request.getRequestDispatcher("success");
					rd.include(request, response);
				
				}
		catch(Exception e){
			
		};
		out.println("after dispatcher");
		out.println("</body></html>");
				}
		
			}
			
			
				

	}


