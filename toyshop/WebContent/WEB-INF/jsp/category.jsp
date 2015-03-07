<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">${c1 }_${c2 }<div>
	<ul>
	<c:forEach var="p" items="${products }">
	<li><a href="${ctxPath }/product/${p.id}">${p.title }</a></li>
	</c:forEach>
	</ul>
	</div>
	</div>
</body>
</html>