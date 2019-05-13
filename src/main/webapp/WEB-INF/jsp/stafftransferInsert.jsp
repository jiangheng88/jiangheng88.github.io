<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>调动添加页面</title>
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

input[type="date"]::-webkit-clear-button {
	display: none;
}

a {
	text-decoration: none;
	width: 40px;
	height: 30px;
	
}

</style>
</head>
<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="text-align: center;">
		<form
			action="${pageContext.request.contextPath}/doStafftransferInsert"
			method="post">
			<h1 style="text-align: center;">添&nbsp;&nbsp;加&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">


				<tr>
					<td class="td1">员工名字</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="afterid">
							<option value="">请选择你要添加的姓名</option>
							<c:forEach items="${sessionScope.staffs}" var="staffs">
								<option value="${staffs.name}">${staffs.id}&nbsp;&nbsp;${staffs.name}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>

					<td class="td1">调动后的岗位</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="afterid">
							<option value="">请选择你要添加的岗位</option>
							<c:forEach items="${sessionScope.position}" var="position">
								<option value="${position.id}">${position.id}&nbsp;&nbsp;${position.stationName}</option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td class="td1">调动时间</td>
					<td class="td2"><input type="date" name="date" />
					<fmt:formatDate value="" pattern="yyyy-MM-dd"/>" />
					
					</td>
				</tr>
				<tr>
					<td class="td1" colspan="2"><input
						style="border-style: none; width: 80px; background-color: black; color: white"
						type="submit" value="添加" /></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>