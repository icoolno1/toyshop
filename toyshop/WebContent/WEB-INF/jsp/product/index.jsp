<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>产品搜索</title>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="search.aspx" method="get" enctype="application/x-www-form-urlencoded">
			<div class="col-lg-6">
				<div class="input-group">
					<input type="text" class="form-control" name="keyword">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">Go!</button>
					</span>
				</div>
				<!-- /input-group -->
			</div>
		</form>
	</div>
</body>
</html>