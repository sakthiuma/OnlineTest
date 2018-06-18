<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head> 
<title> Final</title>
<link rel="stylesheet" type="text/css" href="webexam.css"> </link>
</head>
<body>

<form action="ResultController" method="get">
<div id="center-div">
<input type="hidden" value="${studentname}" name="sname"/>
<input type="hidden" value="${studid}" name="sid"/>


  <center><div style="font-size:30px;">  <p>Number of questions answered</p>
<c:set var="attemp" value='${param["attempt"]}' scope="session" />
<c:set var="finalscore" value='${param["score"]}' />
<input type="hidden" value="${finalscore}" name="sscore" />
    <c:out value="${attemp}" /></div></center>
   <!-- <c:out value="${finalscore}"/> -->
   <center> <input type="submit" value="Submit" id="submit1" class="butn" /> </center>
	</div>
</form>
</body>
</html>