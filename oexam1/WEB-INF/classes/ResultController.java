import java.util.*;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import Dao.*;

public class ResultController extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	int i;
	StudentDao sd=new StudentDao();
	Question q=new Question();
	Student s=new Student();
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String name=request.getParameter("sname");
	String id=request.getParameter("sid").toString();
	
	int sid1=Integer.parseInt(id);
	String sc=request.getParameter("sscore");
	String sc1=sc.toString();
	int score=Integer.parseInt(sc1);
	s.setId(sid1);
	s.setName(name);
	s.setScore(score);
	int ret=sd.updateStudent(s);
	//out.println("<html><head><body>");
	//out.println("<p>"+ret+"</p>");
	out.println("<html>");
out.println("<head><link rel='stylesheet' type='text/css' href='resultcss.css'></link><link rel='stylesheet' type='text/css' href='button.css'></link>");
out.println("<script type='text/javascript' src='resultonline.js'></script></head><body onload='checkans();'>");
out.println("<div id='center-div'><center><h1 > RESULT SUMMARY</h1><div id='d1'><p><span> NAME</span>:"+s.getName()+"<br>");
out.println("<br><span>ID</span>:"+s.getId()+"<br>");
 out.println("<br><span>SCORE</span>:"+s.getScore()+"</div></p><div class='b1'>");
out.println("<button onclick='dispans(this)' class='butn9' id='"+1+"'>1</button>");
out.println("<button onclick='dispans(this)' class='butn9' id='"+2+"'>2</button>");
out.println("<button onclick='dispans(this)' class='butn9' id='"+3+"'>3</button></div>");
out.println("<br><div id='resultans' class='rs1'></div><div class='ansdescription'><button class='butn10' >Correct answer</button>");
out.println("<button class='butn11'> Wrong answer</button></div></center></div>");
	
	out.println("</body></html>");
}
}