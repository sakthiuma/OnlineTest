import java.util.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import Dao.*;

public class QuestionController extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
	QuestionDao qd=new QuestionDao();
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	//out.println("<html><body>");
	//out.println("<form action='ResultController' method='get'>");
	//out.println("<p>");
	String i=request.getParameter("q");
	int i1=Integer.parseInt(i);
	//for(int i=1;i<3;i++)
	//{
		Question q1=new Question();
		q1.setId(i1);
		qd.retrieveque(q1);
		out.println(q1.getQuestion()+"<br><br><input type='radio' id='a' name=\""+i1+"\" value='a'> "+q1.getChoiceA()+"</input><br><input type='radio' id='b' name=\""+i1+"\" value='b'> "+q1.getChoiceB()+"</input><br><input type='radio' id='c' name=\""+i1+"\" value='c'> "+q1.getChoiceC()+"</input><br><input type='radio' id='d' name=\""+i1+"\" value='d'> "+q1.getChoiceD()+"</input><br><br><br>"); 
		
	//}
	
	out.println("<input type='hidden' id='hide' value="+q1.getAnswer()+"></input>");
	//out.println("<input type='submit' value='Submit'>");
	//out.println("</form></body></html>");
    //out.println(i1);
	
	out.close();
	}
}