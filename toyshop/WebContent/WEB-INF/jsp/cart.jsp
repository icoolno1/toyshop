<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>购物车</title>
</head>
<body>
	<FORM method="post" action="order">
		<DIV>
			<TABLE cellSpacing="0" cellPadding="0" width="860" align="center" border="0">
				<TBODY>
					<TR>
						<TD height="120" rowSpan="2" width="200" align="left">
							<A href="vp.php?id=1170">
								<IMG src="../../images/nopic.jpg" alt="a" width="262" height="300">
							</A>
						</TD>
						<TD height="70" vAlign="top" width="560">
							<A href="product/1163">
								<STRONG>Nike Nike Air Flightposite 2014 PRM</STRONG>
							</A>
							<BR> 尺码 40.5
						</TD>
						<TD vAlign="top" width="100" align="right">￥1999</TD>
					</TR>
					<TR>
						<TD height="40" width="560">
							数量
							<INPUT onchange="change(1170,111,14779,this.value)" value="1">
						</TD>
						<TD width="100" align="right">
							<A href="javascript:remove(1170,111,14779)">删除商品</A>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<TABLE cellSpacing="0" cellPadding="0" width="860" align="center" border="0">
				<TBODY>
					<TR>
						<TD height="120" rowSpan="2" width="200" align="left">
							<A href="product/1163">
								<IMG src="../../images/nopic.jpg" alt="a" width="262" height="300">
							</A>
						</TD>
						<TD height="70" vAlign="top" width="560">
							<A href="product/1163">
								<STRONG>Nike adidas Crazy 1</STRONG>
							</A>
							<BR> 尺码 44
						</TD>
						<TD vAlign="top" width="100" align="right">￥799</TD>
					</TR>
					<TR>
						<TD height="40" width="560">
							数量
							<INPUT onchange="change(1163,132,15466,this.value)" value="1">
						</TD>
						<TD width="100" align="right">
							<A href="javascript:remove(1163,132,15466)">删除商品</A>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
				<TBODY>
					<TR>
						<TD colSpan="3" align="right">
							商品总计：￥2798
							<INPUT type="hidden" value="2798" name="order_total">
						</TD>
					</TR>
				</TBODY>
			</TABLE>
			<TABLE cellSpacing="0" cellPadding="0" width="100%" align="center" border="0">
				<TBODY>
					<TR>
						<TD colSpan="3" align="right">
							<A href="index">继续购物</A>
							<a href="order">
							<img src="images/g_19.jpg" /></a>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</DIV>
	</FORM>
</body>
</html>