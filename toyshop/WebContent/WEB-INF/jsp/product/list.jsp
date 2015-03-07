<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${s.keyword }</title>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="col-lg-6">
			<div class="input-group">
				<input type="text" class="form-control" name="keyword">
				<span class="input-group-btn">
					<button class="btn btn-default" type="button">Go!</button>
				</span>
			</div>
			<!-- /input-group -->
		</div>
		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">Panel heading</div>
			<!-- Table -->
			<table class="table">
				<tr>
					<th>#</th>
				</tr>
				<tr>
					<td>1</td>
				</tr>
			</table>
		</div>
		<nav>
			<ul class="pagination">
				<li>
					<a href="#">&laquo;</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">&raquo;</a>
				</li>
			</ul>
			<ul class="pager">
				<li>
					<a href="#">Previous</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</nav>
	</div>
</body>
</html>