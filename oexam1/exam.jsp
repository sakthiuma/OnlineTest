<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Quiz</title>
<link rel="stylesheet" type="text/css" href="qu.css"> </link>
<link rel="stylesheet" type="text/css" href="webexam1.css"> </link>
<script type="text/javascript" src="online.js">

</script>
</head>
<div id="center-div">
<body>

<div style="font-weight:bold" id="quiz-time-left" ></div>
<div id="q_d1" >
	<label id="q_l1"><b>WELCOME&nbsp &nbsp</b><c:out value="${studentname}"/>  </label>
	</div>
<div id="q_d2" >
	<input class="butn" type="button" id="1" value="1" onclick="que(this)" />
	<input class="butn" type="button" id="2" value="2" onclick="que(this)" />
	<input class="butn" type="button" id="3" value="3" onclick="que(this)" />
	</div>
<div id="q_d3" >
	<input class="butn" type="button" id="q_b4" value="Save" onclick="Submit()" />
	<input class="butn" type="button" id="q_b5" value="Mark for reference" onclick="Marked()"/>
	<input class="butn" type="button" id="q_b6" value="Next" onclick="Skip()"/>
	<input class="butn" type="button" id="q_b7" value="Finish" onclick="Finish()" />
	<input class="butn" type="button" id="q_b8" value="Previous" onclick="Previous()" />
	</div>
<div id="q_d4">


</div>
<input type="hidden" id="q_hide" name="q_hid"/>
    
<input type="hidden" value="${studentname}" />
<input type="hidden" value="${studid}" />
</div>
</body>
<script type="text/javascript" src="online.js">

</script>
</html>