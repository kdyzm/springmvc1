<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>第一页,填写id信息</h1>
	<form action="${pageContext.servletContext.contextPath}/wizard.action" method="post">
		<input type="text" name="id" value="${requestScope.person.id}"><br/>
		<input type="submit" name="_target1" value="下一页">
		<input type="submit" name="_cancel" value="退出">
	</form>
</body>
</html>