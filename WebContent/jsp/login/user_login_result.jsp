
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="service.*" %>
<%@ page import ="domain.*" %>
	<!-- "oracle.jdbc.driver.OracleDriver" --> 
	<!-- "jdbc:oracle:thin:@localhost:1521:xe"  -->
	<!-- "rachel"  -->
	<!-- "7003"  -->
	
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body><%
MemberBean m = new MemberBean();
m.setUserid(request.getParameter("user-id"));
m.setPassword(request.getParameter("user-password"));
MemberBean x=new MemberBean();
x=MemberServiceImpl.getInstance().login(m);


if(x!=null){
%>
<h3>사용자 아이디 - <%= x.getUserid() %></h3>
<h3> 사용자 비번 - <%= x.getPassword() %></h3>
<h3> 사용자 이름 - <%=x.getName() %></h3>
<%
}else{
	%>
	<h3>아디비번중 먼가 틀렸어요</h3>
	<%
}
%>
</body>
</html>

