<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>


<% 
	String userId = request.getParameter("update-check-id");
	String pass = request.getParameter("update-old-password");
	String newPass = request.getParameter("update-new-password");
	
	MemberBean member = new MemberBean();
	member.setUserid(userId);
	member.setPassword(pass+"/"+newPass);
	
	
	
	
 	if(pass.equals(newPass)){
		%>비밀번호 변경 실패.<a href="update_form.jsp"> 비밀번호다시입력하기.</a><%
	}else{
		MemberServiceImpl.getInstance().updateMember(member);
		%><h4> 비밀번호를 성공적으로 변경하였습니다.</h4><%
	}
	
%>
	