<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h2>第三页，填写年龄信息</h2>
	<form action="${pageContext.servletContext.contextPath}/wizard.action" method="post">
		<input type="text" name="age" value="${requestScope.person.age}"><br/>
		<input type="submit" name="_target1" value="上一页">
		<input type="submit" name="_cancel" value="退出">
		<input type="submit" name="_finish" value="提交">
	</form>
</body>
</html>