<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="domain.*"%>
<%@page import="service.*"%>

	<%
	MemberBean m = new MemberBean();
	m.setUserid(request.getParameter("new-user-id"));
	m.setName(request.getParameter("new-user-name"));
	m.setSsn(request.getParameter("new-user-birth"));
	m.setPassword(request.getParameter("new-user-password"));
	MemberServiceImpl.getInstance().createMember(m);
	%>

	<h3>회원가입 성공</h3>
	<form action="../../main.jsp">
	<input type="submit" value="성공" />
	</form>
	
<%


%>

	
