<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
<link rel="stylesheet" href="../../css/home/style.css" />
</head>
<body>
	<div class="user-login-layout">
		<h1>사용자 로그인</h1>
		<form id="user-login-form" action="user_login_result.jsp">
			<br> ID <br> <input type="text" name="user-id" /> <br>
			PASSWORD <br> <input type="text" name="user-password" /> <br> <br>
			<input type="submit" value="전송" />
		</form>
	</div>
</body>
</html>
