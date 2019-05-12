<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<style>
table {
	width: 400px;
	height: 280px;
	margin: auto;
	margin-top: 100px;
}

td {
	text-align: center;
	font-size: 22px;
}

.button {
	width: 100px;
	height: 30px;
	background-color: black;
	color: white;
}

.td1 {
	width: 100px;
}
</style>
</head>
<body>

		
		
		<c:if test="${not empty requestScope.note}">
			<div style="text-align: center;">
				<h4 style="color: red">${requestScope.note}</h4>
			</div>
		</c:if>

		<div id="wrap">
			<form action="${pageContext.request.contextPath}/login" method="post">
				<table border="1" cellpadding="0" cellspacing="0">
					<tr>
						<td class="td1">用户名：</td>
						<td><input
							style="width: 200px; height: 25px; outline: none; cursor: pointer;"
							type="text" name="adminName" /></td>
					</tr>
					<tr>
						<td class="td1">密&nbsp;&nbsp;&nbsp;码：</td>
						<td><input
							style="width: 200px; height: 25px; outline: none; cursor: pointer;"
							type="password" name="adminPass" /></td>
					</tr>
					<tr>
						<td class="td1">验证码：</td>
						<td><input
							style="width: 100px; height: 20px; outline: none; cursor: pointer;"
							type="text" name="checkCode" /> <img
							src="${pageContext.request.contextPath}/images" /></td>
					</tr>
					<tr>
						<td colspan="2"><input class="button"
							style="border-style: none;" type="submit" value="登录"></td>
					</tr>

					<tr height="20px">
						<td colspan="2" style="font-size: 10px;"><input
							type="checkbox" value="rember" name="choose" />记住密码
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
							type="checkbox" value="auto" name="choose" />自动登录</td>
					</tr>
				</table>
			</form>
		</div>
	
</body>
</html>