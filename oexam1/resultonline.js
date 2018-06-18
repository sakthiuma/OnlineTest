function checkans()
{
	 
	for(var i=1;i<=3;i++)
{
  var ques_ans=sessionStorage.getItem("q"+i);   
  var user_ans=sessionStorage.getItem("u"+i); 
 	if(user_ans==null)
		document.getElementById(i).style.background="white";
	else if(ques_ans==user_ans)
		document.getElementById(i).style.background="green";
	else
		document.getElementById(i).style.background="red";
}
}



function dispans(button)
{
	var question=parseInt(button.id);
	var ques_ans=sessionStorage.getItem("q"+question); 
  var user_ans=sessionStorage.getItem("u"+question);
	document.getElementById("resultans").innerHTML="Your answer ::"+user_ans+" \n"+"Correct answer ::"+ques_ans;
}