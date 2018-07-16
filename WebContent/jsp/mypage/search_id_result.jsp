<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="domain.*"%>
<%@page import="service.*"%>
<%@page import="java.util.*" %>

<%
MemberBean m = MemberServiceImpl.getInstance().readMemberById(request.getParameter("search-id"));
%>


<!-- table>tr*2>td*6 -->
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<style>
	.tbl {border:1px solid black}
	.tbl tr{border:1px solid black}
	.tbl tr td{border:1px solid black}
	</style>
</head>
<body>
	<table class="tbl">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>팀명</td>
		<td>나이</td>
		<td>직책</td>
	</tr>
		<tr>
		<td><%=m.getUserid()%></td>
		<td><%=m.getName()%></td>
		<td><%=m.getTeamId()%></td>
		<td><%=m.getAge()%></td>
		<td><%=m.getRoll()%></td>
		</tr>
</table>
</body>
</html>

