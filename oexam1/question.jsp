<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
  
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/questioninfo"
user="root" password="password"/>
<c:set var="qid" value='${param["q"]}'/>
<sql:query dataSource="${snapshot}" var="result">
SELECT * from question where q_id= ? ;
<sql:param value="${qid}"/>
        </sql:query>         

<c:forEach var="row" items="${result.rows}">
<div id="qno"></div>
<div id="question"><c:out value = "${row.q_name}"/></div>
<div id="options"><input type="radio" id="a" name="option" value="a"><c:out value = "${row.choicea}"/>
<input type="radio" id="b" name="option" value="b"><c:out value = "${row.choiceb}"/>
<input type="radio" id="c" name="option" value="c"><c:out value = "${row.choicec}"/>
<input type="radio" id="d" name="option" value="d"><c:out value = "${row.choiced}"/>
<c:set var="ans" value="${row.answer}" />
<input type="hidden" id="hide" value="${ans}" />
</div>
</c:forEach>