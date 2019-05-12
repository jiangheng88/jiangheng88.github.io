<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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

<body>
	<c:if test="${sessionScope.failed}" var="f">
		<h4 style="text-align: center">${f}</h4>
	</c:if>
	<div style="margin-top:50px; margin-left: 80px">
		<ul>

			<li style="display: inline-block;">
				<h2 style="color: dimgrey">员工的详细信息</h2>
			</li>

			<li style="display: inline-block; margin-left: 980px"><a
				style="background-color: black;color:white"
				href="${pageContext.request.contextPath}/main">首&nbsp;&nbsp;页</a> <a
				st style="background-color: black;color:white"
				href="${pageContext.request.contextPath}/insert">添&nbsp;加&nbsp;员&nbsp;工</a>
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
				<td>薪水</td>
				<td style="width:120px">入职时间</td>
				<td style="width:120px">离职时间</td>
				<td>是否在职</td>
				<td>操作</td>
			</tr>

			<c:forEach items="${requestScope.pageInfo.list}" var="list">

				<c:if test="${not empty list}">
					<tr style="font-sixe: 15px">
						<td>${list.id}</td>
						<td>${list.name}</td>
						<td>${list.sex}</td>
						<td>${list.age}</td>
						<td>${list.station.stationName}</td>
						<td>${list.department.dpname}</td>
						<td>${list.phone}</td>
						<td>${list.education}</td>
						<td>${list.prefession}</td>
						<td>${list.salary.sum}</td>
						<td style="width: 120px; font-size: 10px">
						<fmt:formatDate value="${list.leaveOffice.enterdate}" pattern="yyyy-MM-dd"/>
						</td>
						<td style="width: 120px; font-size: 10px">
						<fmt:formatDate value="${list.leaveOffice.leavedate}" pattern="yyyy-MM-dd"/>
						</td>
						<td>${list.leaveOffice.state}</td>
						<td><a style="background-color: red"
							href="${pageContext.request.contextPath}/dodel?id=${list.id}">删除</a>&nbsp;&nbsp;<a
							style="background-color: dodgerblue"
							href="${pageContext.request.contextPath}/update?id=${list.id}">修改</a></td>
					</tr>
				</c:if>

			</c:forEach>
		</table>
	</div>
	<!--显示分页信息-->
	<div class="row">
		<!--文字信息-->
		<div  style="text-align: right;margin-right: 100px;margin-top: 40px">当前第
			${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</div>

		<!--点击分页-->
		<div class="col-md-6" style="text-align: right;margin-right: 100px;">
			<nav aria-label="Page navigation" style="display: inline-block;">
				<ul class="pagination">

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/dostaff?pn=1">首页</a></li>

					<!--上一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasPreviousPage}">
							<a
								href="${pageContext.request.contextPath}/dostaff?pn=${pageInfo.pageNum-1}"
								aria-label="Previous"> <span aria-hidden="true">«</span>
							</a>
						</c:if></li>


					<!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
					<c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
						<c:if test="${page_num == pageInfo.pageNum}">
							<li style="display: inline-block;" class="active"><a
								href="#">${page_num}</a></li>
						</c:if>
						
						<c:if test="${page_num != pageInfo.pageNum}">
							<li style="display: inline-block;"><a
								href="${pageContext.request.contextPath}/dostaff?pn=${page_num}">${page_num}</a></li>
						</c:if>
						
					</c:forEach>



					<!--下一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasNextPage}">
							<a
								href="${pageContext.request.contextPath}/dostaff?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">»</span>
							</a>
						</c:if></li>

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/dostaff?pn=${pageInfo.pages}">尾页</a></li>

					
				</ul>
			</nav>
		</div>

	</div>

</body>
</html>