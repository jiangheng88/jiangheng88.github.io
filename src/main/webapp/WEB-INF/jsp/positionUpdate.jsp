<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<form action="${pageContext.request.contextPath}/dopositionUpdate"
			method="post">
			<h1 style="text-align: center;">修&nbsp;&nbsp;改&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td1">岗位id</td>
					<td class="td2"><input type="text" name="id"
						value="${requestScope.station.id}" /></td>
				</tr>
				<tr>
					<td class="td1">岗位名字</td>
					<td class="td2" style="text-align: left">
						<select
						style="width: 200px; text-align: left; height: 30px"
						name="stationName">
							<option value=" ${requestScope.station.stationName}">
								选择你修改的岗位 ${requestScope.station.stationName}</option>
							<c:forEach items="${sessionScope.position}" var="position">
								<option value="${position.stationName}">&nbsp;&nbsp;${position.stationName}</option>
							</c:forEach>
					</select>
						
						
						</td>
				</tr>
				<tr>
					<td class="td1">岗位人数</td>
					<td class="td2"><input type="text" name="maxNumber"
						value="${requestScope.station.maxNumber}" /></td>
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