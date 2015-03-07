<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>乐巴优玩具商城</title>
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form>
			<input type="text" name="searchKey" />
		</form>
		<div>
		<ul>
		<c:forEach var="c" items="${rootCategorys }">
		<li><a href="${ctxPath }/${c.name }">${c.name }</a></li>
		</c:forEach>
		</ul>
		</div>
	</div>
</body>
</html>
