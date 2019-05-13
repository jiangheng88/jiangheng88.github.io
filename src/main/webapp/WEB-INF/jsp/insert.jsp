<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加页面</title>
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
}

a {
	text-decoration: none;
}

input {
	width: 300px;
	height: 30px;
	outline: none;
	cursor: pointer;
	font-size: 20px;
}
</style>
</head>
<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="text-align: center;">
		<h1 style="text-align: center;">添&nbsp;&nbsp;加&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
		<form action="${pageContext.request.contextPath}/doinsert">
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">

				<tr>
					<td class="td1">名字</td>
					<td class="td2"><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td class="td1">性别</td>
					<td class="td2"><input type="text" name="sex" /></td>
				</tr>
				<tr>
					<td class="td1">年龄</td>
					<td class="td2"><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td class="td1">岗位</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="stationId">
							<option value="">请选择你要添加的岗位</option>
							<c:forEach items="${sessionScope.position}" var="position">
								<option value="${position.id}">${position.id}&nbsp;&nbsp;${position.stationName}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td class="td1">部门</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="departmentId">
							<option value="">请选择你要添加的部门</option>
							<c:forEach items="${sessionScope.departments}" var="departments">
								<option value="${departments.id}">${departments.id}&nbsp;&nbsp;${departments.dpname}</option>
							</c:forEach>

					</select></td>
				</tr>
				<tr>
					<td class="td1">电话</td>
					<td class="td2"><input type="text" name="phone" /></td>
				</tr>

				<tr>
					<td class="td1">学历</td>
					<td class="td2"><input type="text" name="education" /></td>
				</tr>
				<tr>
					<td class="td1">专业</td>
					<td class="td2"><input type="text" name="prefession" /></td>
				</tr>
				<tr>
					<td class="td1">薪水id</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="salaryId">
							<option value="">请选择你要添加的薪水</option>
							<c:forEach items="${sessionScope.salary}" var="salary">
								<option value="${salary.id}">${salary.id}&nbsp;&nbsp;${salary.sum}</option>
							</c:forEach>

					</select></td>
				</tr>
				<tr>
					<td class="td1">入职id</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="enterTimeId">
							<option value="">请选择你要添加的入职时间</option>
							<c:forEach items="${sessionScope.newLeave}" var="newLeave">
								<option value="${newLeave.id}">${newLeave.id}&nbsp;&nbsp;<fmt:formatDate
										value="${newLeave.enterdate}" pattern="yyyy-MM-dd" /></option>
							</c:forEach>

					</select></td>
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