<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>薪水详情</title>
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
	
}
</style>
</head>

<body style="background-image:url(assets/img/bg11.jpg)">
	<c:if test="${requestScope.failed}" var="f">
		<h4 style="text-align: center">${f}</h4>
	</c:if>
	<div style="margin-top: 50px; margin-left: 420px">
		<ul>

			<li style="display: inline-block;">
				<h2 style="color: dimgrey">薪水的详细信息</h2>
			</li>

			<li style="display: inline-block; margin-left: 290px"><a
				style="background-color: black;color:white"
				href="${pageContext.request.contextPath}/main">首&nbsp;&nbsp;页</a> <a
				 style="background-color: black;color:white"
				href="${pageContext.request.contextPath}/salaryInsert">添&nbsp;加&nbsp;薪&nbsp;水</a>
			</li>
		</ul>
	</div>

	<div style="text-align: center; width: 100%; height: 100%">


		<table border="1px" cellpadding="0" ,ccellspacing="0"
			style="margin: auto; margin-top: 30px">
			<tr>
				<td>id</td>
				<td>出勤数</td>
				<td>基本工资</td>
				<td>奖金</td>
				<td>补助</td>
				<td>总和</td>
				<td>操作</td>
			</tr>

			<c:forEach items="${requestScope.pageInfo.list}" var="list">

				<c:if test="${not empty list}">
					<tr style="font-sixe: 15px">
						<td>${list.id}</td>
						<td>${list.attendance}</td>
						<td>${list.baseSalary}</td>
						<td>${list.bonus}</td>
						<td>${list.allowance}</td>
						<td>${list.sum}</td>
						<td><a style="background-color: red"
							href="${pageContext.request.contextPath}/doSalaryDel?id=${list.id}">删除</a>&nbsp;&nbsp;<a
							style="background-color: dodgerblue"
							href="${pageContext.request.contextPath}/salaryUpdate?id=${list.id}">修改</a></td>
					</tr>
				</c:if>

			</c:forEach>
		</table>
	</div>
	<!--显示分页信息-->
	<div class="row">
		<!--文字信息-->
		<div style="text-align: right; margin-right: 460px; margin-top: 40px">当前第
			${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</div>

		<!--点击分页-->
		<div class="col-md-6" style="text-align: right; margin-right: 460px;">
			<nav aria-label="Page navigation" style="display: inline-block;">
				<ul class="pagination">

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/doSalary?pn=1">首页</a></li>

					<!--上一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasPreviousPage}">
							<a
								href="${pageContext.request.contextPath}/doSalary?pn=${pageInfo.pageNum-1}"
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
								href="${pageContext.request.contextPath}/doSalary?pn=${page_num}">${page_num}</a></li>
						</c:if>

					</c:forEach>



					<!--下一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasNextPage}">
							<a
								href="${pageContext.request.contextPath}/doSalary?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">»</span>
							</a>
						</c:if></li>

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/doSalary?pn=${pageInfo.pages}">尾页</a></li>


				</ul>
			</nav>
		</div>

	</div>

</body>
</html>