package Dao;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import bean.*;


public class QuestionDao
{
public void retrieveque(Question q)
	{
		
		final String driver="com.mysql.jdbc.Driver";
		final String DB_url="jdbc:mysql://localhost:3306/questioninfo";
		final String user="root";
		final String pass="password";
		Connection con=null;
		
		
		
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(DB_url,user,pass);
		
		int id = q.getId();

		Statement stmt=con.createStatement();
		String sql="select * from question";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			int qid=rs.getInt("q_id");
			if(qid==id)
			{
				String qname=rs.getString("q_name");
				String cha=rs.getString("choicea");
				String chb=rs.getString("choiceb");
				String chc=rs.getString("choicec");
				String chd=rs.getString("choiced");
				String ans=rs.getString("answer");
				q.setName(qname);
				q.setChoiceA(cha);
				q.setChoiceB(chb);
				q.setChoiceC(chc);
				q.setChoiceD(chd);
				q.setAnswer(ans);
			}
		}
		
		con.close();
		stmt.close();
	
		
		
			
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e) {
         //Handle errors for Class.forName
         e.printStackTrace();
      }
	
	}

}
