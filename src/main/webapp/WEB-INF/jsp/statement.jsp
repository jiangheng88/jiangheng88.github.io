<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td {
	text-align: center;
	line-height: 30px;
	height: 30px;
	width: 80px;
	font-size: 13px;
}

a {
	text-decoration: none;
	width: 40px;
	height: 30px;
	background-color:
}
</style>
</head>
<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="margin-top: 50px; margin-left: 80px">
		<ul>

			<li style="display: inline-block;">
				
			</li>

			<li style="display: inline-block; margin-left: 1350px"><a
				style="background-color: black;color:white"
				href="${pageContext.request.contextPath}/main">首&nbsp;&nbsp;页</a> 
				
				
			</li>
		</ul>
	</div>

	<div style="text-align: center; width: 100%; height: 100%">


		<table border="1px" cellpadding="0" ,ccellspacing="0"
			style="margin: auto; margin-top: 30px">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>性别</td>
				<td>岗位</td>
				<td>部门</td>
				<td>电话</td>
				<td>学历</td>
				<td style="width: 120px">专业</td>
				<td>出勤数</td>
				<td>基本工资</td>
				<td>奖金</td>
				<td>补助</td>
				<td>薪水总数</td>
				<td style="width: 120px">入职时间</td>
				<td style="width: 120px">离职时间</td>
				<td>是否在职</td>
				
			</tr>

			<c:forEach items="${staffs}" var="sf">

				<c:if test="${not empty sf}">
					<tr style="font-sixe: 15px">
						<td>${sf.id}</td>
						<td>${sf.name}</td>
						<td>${sf.sex}</td>
						<td>${sf.age}</td>
						<td>${sf.station.stationName}</td>
						<td>${sf.department.dpname}</td>
						<td>${sf.phone}</td>
						<td>${sf.education}</td>
						<td>${sf.prefession}</td>
						<td>${sf.salary.attendance}</td>
						<td>${sf.salary.baseSalary}</td>
						<td>${sf.salary.bonus}</td>
						<td>${sf.salary.allowance}</td>
						<td>${sf.salary.sum}</td>
						<td style="width: 120px; font-size: 10px"><fmt:formatDate
								value="${sf.leaveOffice.enterdate}" pattern="yyyy-MM-dd" /></td>
						<td style="width: 120px; font-size: 10px"><fmt:formatDate
								value="${sf.leaveOffice.leavedate}" pattern="yyyy-MM-dd" /></td>
						<td>${sf.leaveOffice.state}</td>
						
					</tr>
				</c:if>

			</c:forEach>
		</table>
		<div style="margin-top:50px"><a style="background-color: black;color:white" href="${pageContext.request.contextPath}//excel">导出报表</a></div>
		
	</div>

</body>
</html>