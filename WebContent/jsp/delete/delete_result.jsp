<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<%@ page import="service.*" %>

<% MemberBean member = new MemberBean();
	member.setUserid(request.getParameter("delete-id"));
	member.setPassword(request.getParameter("delete-pw"));
	MemberServiceImpl.getInstance().deleteMember(member);
	
	
%>
<h3>회원 탈퇴 완료</h3>
	<form action="../../main.jsp">
	<input type="submit" value="탈퇴완료" />
	</form>
