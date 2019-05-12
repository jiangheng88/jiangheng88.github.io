<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
</style>
</head>
<body>
	
	<div style="text-align: center;">
		<form action="${pageContext.request.contextPath}/dodepartmentUpdate"
			method="post">
			<h1 style="text-align: center;">修&nbsp;&nbsp;改&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td1">部门id</td>
					<td class="td2"><input type="text" name="id"
						value="${requestScope.department.id}" /></td>
				</tr>
				<tr>
					<td class="td1">部门名字</td>
					<td class="td2" style="text-align: left">
						
					<select
						style="width: 200px; text-align: left; height: 30px"
						name="dpname">
							<option value="${requestScope.department.dpname}">
								选择你修改的部门  ${requestScope.department.dpname}</option>
							<c:forEach items="${sessionScope.departments}" var="departments">
								<option value="${departments.dpname}">${departments.dpname}</option>
							</c:forEach>

					</select>	
						</td>
				</tr>
				<tr>
					<td class="td1">部门人数</td>
					<td class="td2"><input type="text" name="dpmenber"
						value="${requestScope.department.dpmenber}" /></td>
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