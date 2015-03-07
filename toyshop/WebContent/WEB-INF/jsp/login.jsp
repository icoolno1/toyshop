<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>用户登录</title>
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form method="post" >
			<span>${v.error }</span> email:
			<input type="text" name="email" value="${v.email }" />
			<br /> password:
			<input type="password" name="password" ${v.password } />
			<br /> kaptcha:
			<input type="text" name="kaptcha" />
			<input type="submit" value="登录" />
			<div>
				<a>支付宝</a>
				<a>QQ</a>
				<a>微博</a>
			</div>
		</form>
	</div>
</body>
</html>