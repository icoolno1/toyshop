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
<title>Insert title here</title>
</head>
<body>
<a href="list.aspx">返回</a>
	<form action="edit.do" method="post" enctype="application/x-www-form-urlencoded">
		<span>${error }</span>
		 标题： <input type="text" name="title" /> 卖点： <input
			name="subTitle" />
			<input type="file" name="thumbnail"/>
			 <input type="submit" value="新增" />
	</form>
</body>
</html>