<%@ page import ="java.util.*" %>
<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<body>
<%
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rachel","7003");
	 String sql = 
			 "SELECT "
			+" MEM_ID, "
			+" TEAM_ID, "
			+" NAME, "
			+" AGE, "
			+" ROLL, "
			+" PASSWORD "
			+" FROM MEMBER  "
			+"  WHERE MEM_ID LIKE '"+ userid
			+"' AND PASSWORD LIKE '"+ password
			+"'";
	Statement stmt = conn.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);
	List<String> list = null;
	if(rs.next()){
		list = new ArrayList<>();
		do{
			list.add(rs.getString("MEM_ID"));
			list.add(rs.getString("TEAM_ID"));
			list.add(rs.getString("NAME"));
			list.add(rs.getString("AGE"));
			list.add(rs.getString("ROLL"));
			list.add(rs.getString("PASSWORD"));
		} while(rs.next());
		%>
		<h3>사용자가 입력한 ID : <%= list.get(0) %></h3>
		<h3>사용자 이름: <%= list.get(2) %> </h3>
		<%
		
	}else{
		%>
		<h3> 아이디나 비번이 틀립니다.</h3>
		<%
	}
%>


</body>
</html>

