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
	width: 100px;
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
	<c:if test="${not empty requestScope.pageInfomain.list}">

		<div
			style="text-align: center; width: 100%; height: 100%; margin-top: 50px;">
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 30px; font-size: 15px">
				<tr>
					<td class="td1">id</td>
					<td class="td1" style="width:80px">姓名</td>
					<td class="td1">年龄</td>
					<td class="td1">性别</td>
					<td class="td1">岗位</td>
					<td class="td1">部门</td>
					<td class="td1">电话</td>
					<td class="td1" style="width: 70px">是否在职</td>
					<td class="td1">学历</td>
					<td class="td1" style="width: 120px">专业</td>
					<td class="td1">薪水</td>

					<td class="td1" style="width: 90px">入职时间</td>
					
					<td class="td1" style="width: 90px">操作</td>
				</tr>

				<c:forEach items="${requestScope.pageInfomain.list}" var="list">

					<c:if test="${not empty list}">

						<tr style="font-sixe: 15px">
							<td class="td1">${list.id}</td>
							<td class="td1">${list.name}</td>
							<td class="td1">${list.sex}</td>
							<td class="td1">${list.age}</td>
							<td class="td1">${list.station.stationName}</td>
							<td class="td1">${list.department.dpname}</td>
							<td class="td1">${list.phone}</td>
							<td class="td1">${list.state}</td>
							<td class="td1">${list.education}</td>
							<td class="td1">${list.prefession}</td>
							<td class="td1">${list.salary.sum}</td>
							<td class="td1" style="width: 120px; font-size: 10px">
								<fmt:formatDate value="${list.leaveOffice.enterdate}" pattern="yyyy-MM-dd"/></td>


							<td class="td1"><a style="background-color: red"
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
			<div style="text-align: right; margin-right: 100px; margin-top: 40px">当前第
				${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfomain.total}
				条记录</div>

			<!--点击分页-->
			<div class="col-md-6" style="text-align: right; margin-right: 100px;">
				<nav aria-label="Page navigation" style="display: inline-block;">
					<ul class="pagination">

						<li style="display: inline-block;"><a
							href="${pageContext.request.contextPath}/dostaff?pn=1">首页</a></li>

						<!--上一页-->
						<li style="display: inline-block;"><c:if
								test="${pageInfo.hasPreviousPage}">
								<a
									href="${pageContext.request.contextPath}/dostaff?pn=${pageInfomain.pageNum-1}"
									aria-label="Previous"> <span aria-hidden="true">«</span>
								</a>
							</c:if></li>


						<!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
						<c:forEach items="${pageInfomain.navigatepageNums}" var="page_num">
							<c:if test="${page_num == pageInfomain.pageNum}">
								<li style="display: inline-block;" class="active"><a
									href="#">${page_num}</a></li>
							</c:if>

							<c:if test="${page_num != pageInfomain.pageNum}">
								<li style="display: inline-block;"><a
									href="${pageContext.request.contextPath}/dostaff?pn=${page_num}">${page_num}</a></li>
							</c:if>

						</c:forEach>

						<!--下一页-->
						<li style="display: inline-block;"><c:if
								test="${pageInfomain.hasNextPage}">
								<a
									href="${pageContext.request.contextPath}/dostaff?pn=${pageInfomain.pageNum+1}"
									aria-label="Next"> <span aria-hidden="true">»</span>
								</a>
							</c:if></li>

						<li style="display: inline-block;"><a
							href="${pageContext.request.contextPath}/dostaff?pn=${pageInfomain.pages}">尾页</a></li>


					</ul>
				</nav>
			</div>

		</div>
	</c:if>

</body>
</html>