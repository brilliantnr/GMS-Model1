<%@page import="domain.*"%>
<%@page import="service.*"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
List<MemberBean> lst=MemberServiceImpl.getInstance().searchTeamByName( request.getParameter("search-team"));
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
		<%
			for (int i = 0; i < lst.size(); i++) {
		%><tr>
		<td><%=lst.get(i).getUserid()%></td>
		<td><%=lst.get(i).getName()%></td>
		<td><%=lst.get(i).getTeamId()%></td>
		<td><%=lst.get(i).getAge()%></td>
		<td><%=lst.get(i).getRoll()%></td>
		</tr>
		<%
			}
		%>
</table>
</body>
</html>
