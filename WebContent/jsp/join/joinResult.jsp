<%@page import="service.MemberServiceImpl"%>
<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>



<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>사용자 회원가입 RESULT </title>
</head>
<body>
	<%
	MemberBean m = new MemberBean();
	m.setUserid(request.getParameter("new-user-id"));
	m.setName(request.getParameter("new-user-name"));
	m.setSsn(request.getParameter("new-user-birth"));
	m.setPassword(request.getParameter("new-user-password"));
	MemberServiceImpl.getInstance().createMember(m);
	
	%>
</body>
</html>


