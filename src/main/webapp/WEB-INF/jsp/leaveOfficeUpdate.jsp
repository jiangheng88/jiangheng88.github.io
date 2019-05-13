<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
<style>
td {
	text-align: center;
	font-size: 20px;
}

.td1 {
	width: 150px;
	height: 40px;
}

.td2 {
	width: 300px;
	height: 40px;
	border: 1px solid gainsboro;
	margin: auto;
}

input {
	width: 300px;
	height: 30px;
	outline: none;
	cursor: pointer;
	font-size: 20px;
}

input[type="date"]::-webkit-datetime-edit-text {
	color: blue;
	padding: 0 .3em;
	
}
input[type="date"]::-webkit-clear-button{
   display:none;
}
</style>
</head>
<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="text-align: center;">
		<form action="${pageContext.request.contextPath}/doLeaveOfficeUpdate"
			method="post">
			<h1 style="text-align: center;">修&nbsp;&nbsp;改&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td1">id</td>
					<td class="td2"><input type="text" name="id"
						value="${requestScope.leaveOffice.id}" /></td>
				</tr>
				<tr>
					<td class="td1">员工姓名</td>
					<td class="td2" style="text-align: left">
						${requestScope.leaveOffice.staff.name}</td>
				</tr>
				
				<tr>
					<td class="td1">入职时间</td>
					<td class="td2"><input type="date" name="enterdate"
						value="<fmt:formatDate value="${requestScope.leaveOffice.enterdate}" pattern="yyyy-MM-dd"/>" /></td>
				</tr>
				
				<tr>
					<td class="td1">离职原因</td>
					<td class="td2"><input type="text" name="reason"
						value="${requestScope.leaveOffice.reason}" /></td>
				</tr>
<tr>
					<td class="td1">离职时间</td>
					<td class="td2"><input type="date" name="leavedate"
						value="<fmt:formatDate value="${requestScope.leaveOffice.leavedate}" pattern="yyyy-MM-dd"/>" /></td>
				</tr>
				<tr>
					<td class="td1">是否在职</td>
					<td class="td2" style="text-align: left" >
						<select
						style="width: 200px; text-align: left; height: 30px"
						name="state">
							<option value="${requestScope.leaveOffice.state}">
								${requestScope.leaveOffice.state}</option>
							
								<option value="在职">在职</option>
								<option value="离职">离职</option>
							
					</select>
						
						</td>
				</tr>
				<tr>
					<td class="td1" colspan="2"><input
						style="border-style: none; width: 80px; background-color: black; color: white"
						type="submit" value="修改" /></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>