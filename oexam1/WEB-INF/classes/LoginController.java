import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import Dao.*;

public class LoginController extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
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
   // out.println(stid+names);
	int ret=sd.loginauthenticate(s);
    //out.println(ret);
	if(ret==11)
	{		
		request.getRequestDispatcher("rules.jsp").forward(request,response);
		
	}
	else if(ret==10)
	{
		out.println("<p> Incorrect Password</p>");
	}
	
	else if(ret==01)
	{
		out.println("<p> Incorrect UserName</p>");
	
	}
	else
		out.println("<p> Unsuccessful Login</p>");
}
}