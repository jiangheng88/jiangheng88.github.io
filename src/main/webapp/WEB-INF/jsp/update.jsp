<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
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

<body>

	<div style="text-align: center;">
		<h1 style="text-align: center;">修&nbsp;&nbsp;改&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
		<form action="${pageContext.request.contextPath}/doupdate">
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td1">id</td>
					<td class="td2"><input type="text" name="id"
						value="${requestScope.staff.id}" /></td>
				</tr>
				<tr>
					<td class="td1">名字</td>
					<td class="td2"><input type="text" name="name"
						value="${requestScope.staff.name}" /></td>
				</tr>
				<tr>
					<td class="td1">性别</td>
					<td class="td2"><input type="text" name="sex"
						value="${requestScope.staff.sex}" /></td>
				</tr>
				<tr>
					<td class="td1">年龄</td>
					<td class="td2"><input type="text" name="age"
						value="${requestScope.staff.age}" /></td>
				</tr>
				<tr>
					<td class="td1">岗位</td>

					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="stationId">
							<option value="${requestScope.staff.station.id}">
								选择你修改的岗位  ${requestScope.staff.station.id}</option>
							<c:forEach items="${sessionScope.position}" var="position">
								<option value="${position.id}">${position.id}&nbsp;&nbsp;${position.stationName}</option>
							</c:forEach>
					</select></td>
				</tr>
				</tr>


				<tr>
					<td class="td1">部门</td>

					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="departmentId">
							<option value="${requestScope.staff.department.id}">
								选择你修改的部门  ${requestScope.staff.department.id}</option>
							<c:forEach items="${sessionScope.departments}" var="departments">
								<option value="${departments.id}">${departments.id}&nbsp;&nbsp;${departments.dpname}</option>
							</c:forEach>

					</select></td>
				</tr>
				<tr>
					<td class="td1">电话</td>
					<td class="td2"><input type="text" name="phone"
						value="${requestScope.staff.phone}" /></td>
				</tr>

				<tr>
					<td class="td1">学历id</td>
					<td class="td2"><input type="text" name="education"
						value="${requestScope.staff.education}" /></td>
				</tr>
				<tr>
					<td class="td1">专业id</td>
					<td class="td2"><input type="text" name="prefession"
						value="${requestScope.staff.prefession}" /></td>
				</tr>
				<tr>
					<td class="td1">薪水id</td>
					<td class="td2" style="text-align: left"><select
						style="width: 200px; text-align: left; height: 30px"
						name="salaryId">
							<option value="${requestScope.staff.salary.id}">
								选择你修改的薪水  ${requestScope.staff.salary.id}</option>
							<c:forEach items="${sessionScope.salary}" var="salary">
								<option value="${salary.id}">${salary.id}&nbsp;&nbsp;${salary.sum}</option>
							</c:forEach>

					</select></td>
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