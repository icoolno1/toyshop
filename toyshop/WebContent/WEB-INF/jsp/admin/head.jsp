<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="servletPath" value="${requestScope['javax.servlet.forward.servlet_path'] }" />
<!-- Static navbar -->
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${adminCtxPath }">Toyshop</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li <c:if test="${fn:indexOf(servletPath,'product')!=-1}">class="active"</c:if>>
					<a href="${adminCtxPath }/product/">商品管理</a>
				</li>
				<li <c:if test="${fn:indexOf(servletPath,'category')!=-1}">class="active"</c:if>>
					<a href="${adminCtxPath }/category/">分类管理</a>
				</li>
				<li <c:if test="${fn:indexOf(servletPath,'file')!=-1}">class="active"</c:if>>
					<a href="${adminCtxPath }/file/">图片管理</a>
				</li>
				<li <c:if test="${fn:indexOf(servletPath,'order')!=-1}">class="active"</c:if>>
					<a href="${adminCtxPath }/order/">订单管理</a>
				</li>
				<li <c:if test="${fn:indexOf(servletPath,'member')!=-1}">class="active"</c:if>>
					<a href="${adminCtxPath }/member/">会员管理</a>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						系统设置<span class="caret"></span>
					</a>
					<ul class="dropdown-menu" role="menu">
						<li class="active">
							<a href="${adminCtxPath }/settings/">通用设置</a>
						</li>
						<li>
							<a href="${adminCtxPath }/employee/">管理账号</a>
						</li>
						<li>
							<a href="${adminCtxPath }/recycled/">商品回收站</a>
						</li>
						<li class="divider"></li>
						<li class="dropdown-header">Nav header</li>
						<li>
							<a href="#">Separated link</a>
						</li>
						<li>
							<a href="#">One more separated link</a>
						</li>
					</ul>
				</li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<a href="${adminCtxContext }/logout">退出</a>
				</li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	<!--/.container-fluid -->
</nav>