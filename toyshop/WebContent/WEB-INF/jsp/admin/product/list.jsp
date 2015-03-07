<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品管理</title>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.easyui.min.js"></script>
<script>
	function showAdd() {
		$('#dlg').dialog({
			title : '新增商品',
			width : 600,
			height : 500,
			closed : false,
			cache : false,
			href : 'add.aspx',
			modal : true,
			toolbar : [ {
				text : '保存',
				iconCls : 'icon-save',
				handler : function() {
					alert('save');
				}
			}, {
				text : '取消',
				iconCls : 'icon-save',
				handler : function() {
					$('#dlg').dialog('close');
				}
			} ]
		});
	}
</script>
</head>
<body>
	<div class="container">
		<jsp:include page="../head.jsp"></jsp:include>
		<div id="dlg"></div>
		<div style="padding: 5px 0;">
			<a href="#" class="easyui-linkbutton" onclick="showAdd()" data-options="iconCls:'icon-add'" style="width: 80px">新增</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'" style="width: 80px">删除</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width: 80px">查找</a>
			<a href="#" class="easyui-linkbutton" style="width: 80px">全选</a>
		</div>
		<table id="tt" class="easyui-datagrid" style="height: 450px" url="getProducts.aspx" title="产品列表" iconCls="icon-save" rownumbers="true"
			pagination="true">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th field="id" width="80">ID</th>
					<th field="unitcost" width="80">图标</th>
					<th field="title" width="390">标题</th>
					<th field="listprice" width="80" align="right">参考价格</th>
					<th field="attr1" width="200">发布时间</th>
					<th field="status" width="60" align="center">状态</th>
				</tr>
			</thead>
		</table>
		<script type="text/javascript">
			function changeP() {
				var dg = $('#tt');
				dg.datagrid('loadData', []);
				dg.datagrid({
					pagePosition : $('#p-pos').val()
				});
				dg.datagrid('getPager').pagination({
					layout : [ 'list', 'sep', 'first', 'prev', 'sep', $('#p-style').val(), 'sep', 'next', 'last', 'sep', 'refresh' ]
				});
			}
		</script>
		<div>
			<c:forEach items="${items }" var="item">
				<div>
					<a href="#">${item.title }</a>
					<a href="edit.aspx?id=${item.id }">edit</a>
					<a href="delete.aspx?id=${item.id }">delete</a>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>