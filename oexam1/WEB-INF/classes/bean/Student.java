package bean;
public class Student
{
	int id,score;
	String name,email;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setScore(int score)
	{
		this.score=score;
	}
	public int getScore()
	{
		return score;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setEmail(String p)
	{
		email=p;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
}