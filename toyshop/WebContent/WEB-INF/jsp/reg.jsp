<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>用户注册</title>
</head>
<body>
<form method="post" action="reg.do">
<span>${v.error }</span>
email:<input type="text" name="email" value="${v.email }"/>
<br/>
password:<input type="password" name="password"/>
<br/>
confirm:<input type="password" name="confirm"/>
<br/>
<input type="submit" value="注册"/>
</form>
</body>
</html>