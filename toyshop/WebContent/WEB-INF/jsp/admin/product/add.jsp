<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>新增商品</title>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.easyui.min.js"></script>
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
<script>
	$(function() {
		$('#folders').tree({
			url : '../files/loadFolders.aspx'
		});
	});
</script>
</head>
<body>
	<div class="container">
		<form action="add.do" method="post" id="productForm">
			标题：
			<input type="text" name="title" />
			卖点：
			<input name="subTitle" />
			<div>
				<div></div>
				<div class="easyui-panel" style="padding: 5px">
					<ul id="folders" class="easyui-tree">
					</ul>
				</div>
			</div>
			<div>
				<img src="${ctxPath }/images/nopic.jpg" id="thumbnail" />
			</div>
			<div>
				<input type="text" name="thumbnail" />
				<input type="submit" value="新增" />
			</div>
		</form>
	</div>
</body>
</html>