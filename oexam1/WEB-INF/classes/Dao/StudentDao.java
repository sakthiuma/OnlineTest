package Dao;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import bean.*;


public class StudentDao
{
int id;
public int authenticate(Student stu)
	{
		int i=-1;
		final String driver="com.mysql.jdbc.Driver";
		final String DB_url="jdbc:mysql://localhost:3306/studentinfo";
		final String user="root";
		final String pass="password";
		Connection con=null;
		Statement stmt=null;
		String name = stu.getName();
		 id = stu.getId();
		
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(DB_url,user,pass);
		String names = stu.getName();
		 id = stu.getId();

		PreparedStatement pst =(PreparedStatement) con.prepareStatement("insert into student(student_id,student_name,score) values(?,?,?);");
		pst.setInt(1,id);  
		pst.setString(2,names);
		pst.setString(3,"-1");	
		i = pst.executeUpdate();
		pst.close();	
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

	return i;
	}
public int updateStudent(Student s)
{
		final String driver="com.mysql.jdbc.Driver";
		final String DB_url="jdbc:mysql://localhost:3306/studentinfo";
		final String user="root";
		final String pass="password";
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String name = s.getName();
		 int id = s.getId();
		int finalscore=s.getScore();
		int i=-1;
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(DB_url,user,pass);
		//stmt=con.createStatement();
		String sql="update student set score =? where student_id=?;";
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,finalscore);
		pstmt.setInt(2,id);
		i=pstmt.executeUpdate();
		/*sql="select * from student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
			int sid=rs.getInt("student_id");
			if(sid==id)
			{
				String sname=rs.getString("student_name");
				int sscore=rs.getInt("score");
				s.setId(sid);
				s.setName(sname);
				s.setScore(sscore);
			}
		}*/
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e) {
         //Handle errors for Class.forName
         e.printStackTrace();
      }
	return i;
}

public int loginauthenticate(Student s)
	{int i=-1;
		final String driver="com.mysql.jdbc.Driver";
		final String DB_url="jdbc:mysql://localhost:3306/studentinfo";
		final String user="root";
		final String pass="password";
		Connection con=null;
		Statement stmt=null;
		String name=s.getName();
		int password=s.getId();		
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(DB_url,user,pass);
		stmt=con.createStatement();
		String sql="select * from student";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next())
		{
            int upass=rs.getInt("student_id");
			String uname=rs.getString("student_name");
			
			if(uname.equals(name))
			{
				if(upass==password)
					i= 11;
				else
					i= 10;
				
			}
			else if(uname.equals(name))
			{
				if(uname.equals(name))
					i= 11;
                else
					i= 01;
			}
			else 
				i= 00;
		}
		
	}
	catch(SQLException se)
	{
		
		se.printStackTrace();
	}
	catch(Exception e) {
		
         //Handle errors for Class.forName
         e.printStackTrace();
      }
	return i;
}

}
