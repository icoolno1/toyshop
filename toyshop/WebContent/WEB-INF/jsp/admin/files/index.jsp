<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${ctxPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${ctxPath }/js/easyui/jquery.easyui.min.js"></script>
<link href="${ctxPath }/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctxPath }/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<script src="${ctxPath }/bootstrap/js/bootstrap.min.js"></script>
<title>files manage</title>
<script>
	$(function() {
		$('#folders').tree({
			url : 'loadFolders.aspx',
			onContextMenu : function(e, node) {
				e.preventDefault();
				// select the node
				$('#folders').tree('select', node.target);
				// display context menu
				$('#mm').menu('show', {
					left : e.pageX,
					top : e.pageY
				})
			},
			onSelect : function(node) {
				$.get("loadFiles.aspx", {
					folder : node.id
				}, function(data) {
					for ( var s in data) {
						$("#files").append("<img width=\"100\" height=\"100\" src='"+"${ctxPath}/upload/"+node.id+"/"+ data[s]+"'/>");
					}
				});
			}
		});
		$("input:button").click(function() {
			$.post("createFolder.aspx", {
				name : $("#folder").val()
			});
		});
	});

	function append() {
		var selected = $('#folders').tree('getSelected');
		$.post("createFolder.aspx", {
			parent : selected.attributes.path,
			name : $("#folder").val()
		}, function() {
			$('#folders').tree('append', {
				parent : selected.target,
				data : [ {
					id : 23,
					text : $("#folder").val()
				} ]
			});
		});

	}

	function remove() {
	}
</script>
</head>
<body>
	<div class="container">
		<jsp:include page="../head.jsp"></jsp:include>
		<a href="upload.aspx">上传文件</a>
		<div>
			<div id="mm" class="easyui-menu" style="width: 120px;">
				<div onclick="append()" data-options="iconCls:'icon-add'">Append</div>
				<div onclick="remove()" data-options="iconCls:'icon-remove'">Remove</div>
			</div>
			<input type="text" id="folder" />
			<input type="button" value="add" />
			<div class="easyui-panel" style="padding: 5px">
				<ul id="folders" class="easyui-tree">
				</ul>
			</div>
		</div>
		<div id="files"></div>
	</div>
</body>
</html>