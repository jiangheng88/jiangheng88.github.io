<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div style="margin-top: 50px; margin-left: 55px;">
		<ul>

			<li style="display: inline-block;">
				<h2 style="color: dimgrey">调动的详细信息</h2>
			</li>

			<li style="display: inline-block; margin-left: 430px"><a
				style="background-color: dodgerblue;"
				href="${pageContext.request.contextPath}/main">首&nbsp;&nbsp;页</a> <a
				st style="background-color: dodgerblue;"
				href="${pageContext.request.contextPath}/stafftransferInsert">添&nbsp;加&nbsp;调&nbsp;动</a>
			</li>
		</ul>
	</div>
	<div style=" width: 100%; height: 100%">


		<table border="1px" cellpadding="0" ,ccellspacing="0"
			style="margin-left:100px; margin-top: 20px;text-align: center;">
			<tr>
				<td style="width: 100px;">id</td>
				<td style="width: 120px;">员工名称</td>
				
				<td style="width: 120px;">调动后的岗位</td>
				<td style="width: 120px;">调动的日期</td>
				<td style="width: 120px;">操作</td>
			</tr>
			<c:forEach items="${requestScope.pageInfo.list}" var="list">

				<c:if test="${not empty list}">
					<tr style="font-sixe: 15px">
						<td>${list.id}</td>
						<td style="width: 120px">${list.staff.name}</td>
					
						<td style="width: 120px">${list.position.stationName}</td>
						<td style="width: 120px">
						<fmt:formatDate value="${list.date}" pattern="yyyy-MM-dd"/>
						</td>
						
						<td style="width: 120px"><a style="background-color: red"
							href="${pageContext.request.contextPath}/doStafftransferDel?id=${list.id}">删除</a>&nbsp;&nbsp;<a
							style="background-color: dodgerblue"
							href="${pageContext.request.contextPath}/stafftransferUpdate?id=${list.id}">修改</a></td>
					</tr>
				</c:if>

			</c:forEach>
		</table>
	</div>
	<!--显示分页信息-->
	<div class="row">
		<!--文字信息-->
		<div  style="text-align: right;margin-right: 700px;margin-top: 40px">当前第
			${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</div>

		<!--点击分页-->
		<div class="col-md-6" style="text-align: right;margin-right: 700px;">
			<nav aria-label="Page navigation" style="display: inline-block;">
				<ul class="pagination">

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/doPosition?pn=1">首页</a></li>

					<!--上一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasPreviousPage}">
							<a
								href="${pageContext.request.contextPath}/doPosition?pn=${pageInfo.pageNum-1}"
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
								href="${pageContext.request.contextPath}/doPosition?pn=${page_num}">${page_num}</a></li>
						</c:if>
						
					</c:forEach>
					<!--下一页-->
					<li style="display: inline-block;"><c:if
							test="${pageInfo.hasNextPage}">
							<a
								href="${pageContext.request.contextPath}/doPosition?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">»</span>
							</a>
						</c:if></li>

					<li style="display: inline-block;"><a
						href="${pageContext.request.contextPath}/doPosition?pn=${pageInfo.pages}">尾页</a></li>

				</ul>
			</nav>
		</div>

	</div>
</body>
</html>