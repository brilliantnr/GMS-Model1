
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
m=MemberServiceImpl.getInstance().login(m);


if(m!=null){
%>
<h3> <%= m.getName() %>님 반갑습니다. </h3>
<h3>사용자 아이디 - <%= m.getUserid() %></h3>
<h3> 사용자 이름 - <%=m.getName() %></h3>
<%
}else{
	%>
	<h3>아이디 혹은 비밀번호가 일치하지 않습니다.</h3>
	<%
}
%>
</body>
</html>

