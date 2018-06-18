package bean;

public class Question
{
	int q_id;
	String q_name,choicea,choiceb,choicec,choiced,answer;
	
	public int getId()
	{
		return q_id;
	}
	
	public String getQuestion()
	{
		return q_name;
	}
		
	public String getChoiceA()
	{
		return choicea;
	}
	
	public String getChoiceB()
	{
		return choiceb;
	}
	
	public String getChoiceC()
	{
		return choicec;
	}
	
	public String getChoiceD()
	{
		return choiced;
	}
		
	public String getAnswer()
	{
		return answer;
	}
	
	public void setId(int id)
	{
		q_id=id;
	}
	
	public void setName(String name)
	{
		q_name=name;
	}
		
	public void setChoiceA(String cha)
	{
		choicea=cha;
	}
	
	public void setChoiceB(String chb)
	{
		choiceb=chb;
	}

	public void setChoiceC(String chc)
	{
		choicec=chc;
	}

	public void setChoiceD(String chd)
	{
		choiced=chd;
	}

	public void setAnswer(String ans)
	{
		answer=ans;
	}
}