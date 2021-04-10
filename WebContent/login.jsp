<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String path=request.getContextPath();
    	%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<form action="<%=path %>/TestServlet" method="post"> 
		<div>
			用户：<input type="text" name="name" placeholder="用户名" />
		</div>
		<div>
			密码：<input type="password" name="pwd" placeholder="密码" />
		</div>
		<div>
			<input type="submit" value="登录"/>
		</div>
		
	</form>
</body>
</html>