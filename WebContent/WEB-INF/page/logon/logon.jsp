<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆|艾哥捡漏网</title>
</head>
<body>
	<s:form action="logon.shtml">
	用户名： <input type="text" name="domain.user_name" />
	密码：      <input type="password" name="domain.password" />
		<input type="submit" />
	</s:form>
</body>
</html>