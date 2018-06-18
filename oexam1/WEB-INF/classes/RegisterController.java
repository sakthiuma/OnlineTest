
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import Dao.*;

public class RegisterController extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String names=request.getParameter("name");
	String id=request.getParameter("studentid");
	String sid=id.toString();
	int stid=Integer.valueOf(sid);

	Student s=new Student();
	s.setName(names);
	s.setId(stid);
	StudentDao sd=new StudentDao();
	int f=sd.authenticate(s);
	if(f>=0)
		request.getRequestDispatcher("rules.jsp").forward(request,response);
	else
		{
			out.println("<html>");
			out.println("<head><link rel='stylesheet' type='text/css' href='webexam.css'></head>");
			out.println("<div id='center-div'> <body> <p id='p1'><center>  Sorry You are already signed in!!!</center></p>");
			out.println("</body></div></html>");
		}
	}
}