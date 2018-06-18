<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head> 
<title>Online Exam </title>
<style>
h1{
position:relative;
font-size:40px;
font-family:helvetica;
text-align:center;
top:20%;
color:			#FFFAF0;
}
 #d2{
            position:absolute;
            top:10%;
            right:0;
     color:white;
        }
        
body{

background-image:url("online1.jpg");
    background-repeat: no-repeat;
    background-size: cover;
}
*{
font-family:helvetica;
font-weight:bold;
font-size:20px;
//color:			#FFFAF0;
}
#submit{
position:absolute;
left:35%;
color:black;
}
#d1{
position:absolute;
top:40%;
left:38%;
width:300px;
height:300px;
//background-color:white;//

}
#l1,#l2
{
position:relative;
left:10%;
color:		#FFFAF0;
}
#t1,#t2
{
position:relative;
left:10%;
color:black;
}

.butn {
  box-shadow: none !important;
  border: 2px solid black;
  width: 120px;
  height: 50px;
 font-family:palatino;
  font-size: 20px;
  background-color: #FFFAF0;
  border-radius: 25px;
  outline: 0;
border:none;
  color:black;



  -webkit-transition: all 0.5s ease;
     -moz-transition: all 0.5s ease;
      -ms-transition: all 0.5s ease;
          transition: all 0.5s ease;

}

.butn:hover{

  width: 170px;
  height: 60px;
  border-radius: 45px;
  font-size: 30px;
  background-color:#FFFAF0;
}
#center-div
{
  position: absolute;
  margin: auto;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color:  rgba(0,0,0,0.2);
  }
.butn {
  box-shadow: none !important;
  border:2px solid white;
  width: 120px;
  height: 50px;
 font-family:palatino;
  font-size: 20px;
  background-color:transparent;
  border-radius: 25px;
  outline: 0;
  color:gold;



  -webkit-transition: all 0.5s ease;
     -moz-transition: all 0.5s ease;
      -ms-transition: all 0.5s ease;
          transition: all 0.5s ease;

}

.butn:hover{

  width: 170px;
  height: 60px;
  border-radius: 45px;
  font-size: 30px;
  background-color:  transparent;
}

</style>
</head>
<body> 
<div id="center-div">
<h1> Online Logical Reasoning Test </h1>
<div id="d1">
<form action="onlineexam" method="post" >
<label id="l1"> NAME <br> </label>
<input type ="text" id="t2" name="name" /> <br><br><br>
<label id="l2"> PASSWORD  <br> </label>
<input type ="password" id ="t1" name="studentid" /> <br><br><br><br>
<c:set var="studentname" value="${param.name}" scope="application" />
<h2><c:out value="${studentname}" /></h2>
    <input type="submit" id="submit" class="butn"  value="Signup"></form>
    </div>
    </div>
<div id="d2">Already  an existing user???<br><br>
    

<a href="login.jsp"><button class="butn"> Log in</button></a>
</div>
    
</body>
</html>
