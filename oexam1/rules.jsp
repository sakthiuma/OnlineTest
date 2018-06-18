
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<style>

*{
color:#FFFAF0;
}

h1{
	position:relative;
	top:20%;
	font-weight:bold;
	text-align:center;
	font-size:40px;
}
li{
	font-size:25px;
}
#d1{
left:30%
text-align:center;
}


</style>
<link rel="stylesheet" href="webexam.css"> </link>
<title>INSTRUCTIONS</title>
</head>

<body>
<div id="center-div">
	
	<form action="exam.jsp">
	<h1> INSTRUCTIONS </h1>
	<div id="d1">
	
		1.Total number of questions is 3.<br>
		2.Each question carry 5 marks.<b>No negative marking.</b><br>
		3.Do not refresh the page.<br>
		4.All the Best :)<br>
	<c:set var="studentname" value="${param.name}" scope="application" />
    <c:set var="studid" value="${param.studentid}" scope="application" />
        <!-- <p><c:out value="${studentname}" /></p> -->
	
	<input type="submit" id ="submit" class="butn" value="Start Test"  ></input>
	</div>
</div>
	</form>