<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import ="java.text.SimpleDateFormat" %>
<%@page import ="java.util.Date" %>

<%!
	/* declaration */
	String name=null;
%>

<%
	/* directives 연산 */
	name="홍길동";

%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title> Hello <%= name %></title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>

	<%= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) %>
	<div>
	<!-- ul>li*5 -->
	<!-- ol>li*7 -->		
	</div>

	<table id="main-tab-layout"
		class="witdh-full height-100 margin-auto color-bg">
		<tr>
			<td colspan="2"><h1>GMS</h1></td>

		</tr>
		<tr>
			<td class="witdh-full height-300"><img
				src="img/home/gorae.jpg" alt="" /></td>
			<td id="login" class="color-lg">
				<ul>
					<li><a href="jsp/login/user_login_form.jsp">사용자로그인</a></li>
					<li><a href="jsp/login/admin_login.jsp">관리자로그인</a></li>
				</ul>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<p>
					<span class="first">(주) 카카오 M</span> <span>서울시 강남구 테헤란로 103길
						17</span> <span>대표이사 : 이제욱</span> <span>사업자등록번호 : 138-81-05876</span> <span>통신판매업
						신고번호 : 제2011-서울강남-02008호</span><br /> <span class="first">문의전화(평일
						09:00~18:00) : 1566-7727 (유료)</span> <span>이메일 : <a
						href="https://help.melon.com/web/customer/help/helpForm.htm?type="
						class="btn_footer_mail" target="_blank">meloninformation@kakao-m.com</a></span>
					<span>호스팅 제공자 : (주) 카카오 M</span><span>© Kakao M Corp.All
						rights reserved.</span>
				</p>
			</td>
		</tr>
	</table>

</body>
</html>