var qno;
var score=[];
var flag=[];
var ans=[];
var r;
var temp="";
var total_seconds=60*15;
var c_minutes=parseInt(total_seconds/60);
var c_seconds=parseInt(total_seconds%60);
var ques=[];

function randomque()
{
	var q1;
	var i=0;
	while(i<3)
	{
		q1=Math.floor((Math.random()*5)+1);
		if(i==0)
			ques[i]=q1;
		var count=0;
		for(var j=1;j<=i;j++)
		{
			if(q1!=ques[j-1])
				count=count+1;
		}
		if(count==i){
			ques[i]=q1;
			i++;
			}
	}
	
	
}

randomque();
	

function CheckTime()
{
	document.getElementById("quiz-time-left").innerHTML='Time Left: ' + c_minutes + ' : ' + c_seconds;
if(total_seconds <=0)
{
 setTimeout("Finish()",1);
}
else {
total_seconds=total_seconds-1;
c_minutes=parseInt(total_seconds/60);
c_seconds=parseInt(total_seconds%60);
setTimeout("CheckTime()",1000);
}}
setTimeout("CheckTime()",1000);


function que(button){
    qno=parseInt(button.id);
	var request=new XMLHttpRequest();
	request.onreadystatechange=function(){
		if(request.readyState==4 && request.status==200){
			var val=request.responseText;
			document.getElementById("q_d4").innerHTML=val;
		}
            temp=ans[qno-1];
        document.getElementById(temp.toString()).checked=true;

        
	};
	q1=ques[qno-1];
	// window.alert(q1);
    
	var url="question?q="+q1;
	request.open("GET",url,true);
	request.send();
};

function Submit()
{
    
    var prop=document.getElementById("q_d2").getElementsByTagName("*");
     var answ=document.getElementById("hide").value;
    
    for(var i=0;i< prop.length; i++)
        {        
            if(prop[i].id==qno)
                {
                       
                   if(document.getElementById('a').checked){
                      r=document.getElementById('a').value;
                       if(r===answ)
                           score[qno-1]=1;
                        else
                            score[qno-1]=0;
                            ans[qno-1]=r;
                     
                   }
                   else if(document.getElementById('b').checked){
                      r=document.getElementById('b').value;
                       if(r===answ)
                           score[qno-1]=1;
                        else
                            score[qno-1]=0;
                         ans[qno-1]=r;
                   }
                   else if(document.getElementById('c').checked){
                      r=document.getElementById('c').value;
                       if(r===answ){
                           score[qno-1]=1;
                           }
                        else{
                            score[qno-1]=0;
                            }
                                            
                        ans[qno-1]=r;
                       
                   }
                   else if(document.getElementById('d').checked){
                      r=document.getElementById('d').value;
                       if(r===answ)
                           score[qno-1]=1;
                        else
                            score[qno-1]=0;
                       ans[qno-1]=r;
                   }
                   
                else{
                    window.alert("Do select one answer");
                }
			
                    prop[i].style.background="#7fff00";
                   flag[qno-1]=0;
                     temp=ans[qno-1];
                    
                    document.getElementById(temp).checked=true;
		    sessionStorage.setItem("q"+qno,answ);
		    sessionStorage.setItem("u"+qno,r);
			//window.alert(sessionStorage.getItem("q"+qno));
			
                }
        }
    
}

function Marked()
{
     var prop=document.getElementById("q_d2").getElementsByTagName("*");
     var answ=document.getElementById("hide").value;
      for(var i=0;i< prop.length; i++)
        {        
            if(prop[i].id==qno)
                {
                   if(document.getElementById('a').checked){
                       r=document.getElementById('a').value;
                       if(r===answ)
                           score[qno-1]=1;
                        else
                            score[qno-1]=0;
                        
                   }
                   else if(document.getElementById('b').checked){
                      r=document.getElementById('b').value;
                       
                       if(r===answ){
                           score[qno-1]=1;
                             }
                        else{
                            score[qno-1]=0;
                             }
                        
                   }
                  else  if(document.getElementById('c').checked){
                      r=document.getElementById('c').value;
                       if(r===answ){
                           score[qno-1]=1;
                           }
                        else{
                            score[qno-1]=0;
                           }
                        
                   }
                  else  if(document.getElementById('d').checked){
                      r=document.getElementById('d').value;
                       if(r===answ)
                           score[qno-1]=1;
                        else
                            score[qno-1]=0;
                        
                   }
                else{
                    score[qno-1]=-1;
                }
                    
                    prop[i].style.background="#ffc300";
		
                        flag[qno-1]=1;
                        temp=ans[qno-1];
                        document.getElementById(temp).checked=true;
			
			sessionStorage.setItem("qm"+qno,answ);
		    sessionStorage.setItem("um"+qno,r);
                }
		
        }
}
    


function Skip()
{
    
    var request=new XMLHttpRequest();
	request.onreadystatechange=function(){
		if(request.readyState==4 ){
			var val=request.responseText;
			document.getElementById("q_d4").innerHTML=val;
		}
        temp=ans[qno-1];
        document.getElementById(temp.toString()).checked=true;
	};
    if(qno!=3)
	   qno=qno+1;
    else
        window.alert("You have exhausted all the question");
	q1=ques[qno-1];
	var url="question?q="+q1;
	request.open("GET",url,true);
	request.send();
    
    score[qno-1]=-1;
                
}

function Previous(){
        

    var request=new XMLHttpRequest();
	request.onreadystatechange=function(){
		if(request.readyState==4 ){
            temp=ans[qno-1];
			var val=request.responseText;
			document.getElementById("q_d4").innerHTML=val;
             
		}
        document.getElementById(temp.toString()).checked= true;
	};
    if(qno!=1)
	   qno=qno-1;
    else
        window.alert("You are in the first question..");
        
        q1=ques[qno-1];     
	var url="question?q="+q1;
	request.open("GET",url,true);
	request.send();
      
                    
}

function Finish()
{
    var sum=0;
    var review=0;
    var attempt=0;
    for(var i=0; i<score.length;i++)
        {
            if(score[i]!=-1)
            sum=sum+score[i];
            //window.alert(score[i]);
        }
    for(i=0;i<flag.length;i++)
        {
            if(flag[i]==1)
                review=review+1;
            else
                attempt=attempt+1;
        }
	attempt=attempt+review;
    document.getElementById("q_hide").value=sum;
   // window.alert(document.getElementById("q_hide").value);
    window.location.href = "result.jsp?attempt="+attempt+"&score="+sum;
}


