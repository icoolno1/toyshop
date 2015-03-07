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
<title>上传文件</title>
<link rel="stylesheet" type="text/css"
	href="${ctxPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${ctxPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${ctxPath }/js/easyui/jquery.easyui.min.js"></script>
<script>
	$(function() {
		$('#path').combotree({
			url : 'loadFolders.aspx',
			required : true
		});
	});
</script>
</head>
<body>
<a href="index.aspx">返回</a>
	<form method="post" action="upload.do" enctype="multipart/form-data">
		<select id="path" name="path" class="easyui-combotree"
			style="width: 200px;">
		</select> <input type="text" name="name" /> <input type="file" name="filedata" />
		<input type="submit" />
	</form>
</body>
</html>