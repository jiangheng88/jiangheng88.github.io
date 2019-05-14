<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页面</title>
<style>
.td {
	text-align: center;
	line-height: 30px;
	height: 30px;
	width: 150px;
	font-size: 20px;
}

a {
	text-decoration: none
}

.td1 {
	font-size: 13px;
	width: 50px;
	height: 25px;
}
</style>
</head>

<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="text-align: center;">
		<h1 style="font-style: ">员工管理主页面</h1>
		<form action="${pageContext.request.contextPath}/doFuzzyQuery"
			method="post">
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td"><a
						href="${pageContext.request.contextPath}/dostaff">员工信息</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/dodepartment">部门信息</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/doPosition">岗位信息</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/doStafftransfer">调动信息</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/doLeaveOffice">离职信息</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/doSalary">薪资管理</a></td>
					<td class="td"><a
						href="${pageContext.request.contextPath}/doStatement">报表管理</a></td>
					
				</tr>
			</table>
			
			
		</form>
	</div>
	

</body>
</html>