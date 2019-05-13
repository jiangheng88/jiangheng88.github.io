<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改薪水</title>
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
<body style="background-image:url(assets/img/bg11.jpg)">
	<div style="text-align: center;">
		<form action="${pageContext.request.contextPath}/doSalaryUpdate"
			method="post">
			<h1 style="text-align: center;">修&nbsp;&nbsp;改&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">
				<tr>
					<td class="td1">id</td>
					<td class="td2"><input type="text" name="id"
						value="${requestScope.salary.id}" /></td>
				</tr>
				<tr>
					<td class="td1">出勤数</td>
					<td class="td2"><input type="text" name="attendance"
						value="${requestScope.salary.attendance}" /></td>
				</tr>
				<tr>
					<td class="td1">基本工资</td>
					<td class="td2"><input type="text" name="baseSalary"
						value="${requestScope.salary.baseSalary}" /></td>
				</tr>
				<tr>
					<td class="td1">奖金</td>
					<td class="td2"><input type="text" name="bonus"
						value="${requestScope.salary.bonus}" /></td>
				</tr>

				<tr>
					<td class="td1">补助</td>
					<td class="td2"><input type="text" name="allowance"
						value="${requestScope.salary.allowance}" /></td>
				</tr>
				<tr>
					<td class="td1">总和</td>
					<td class="td2"><input type="text" name="sum"
						value="${requestScope.salary.sum}" /></td>
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