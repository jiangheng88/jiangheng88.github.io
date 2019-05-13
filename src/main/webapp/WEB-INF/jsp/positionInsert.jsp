<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>岗位添加</title>
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
		<form action="${pageContext.request.contextPath}/dopositionInsert" method="post">
			<h1 style="text-align: center;">添&nbsp;&nbsp;加&nbsp;&nbsp;页&nbsp;&nbsp;面</h1>
			<table border="1px" cellpadding="0" ,ccellspacing="0"
				style="margin: auto; margin-top: 50px;">

				<tr>
					<td class="td1">岗位名字</td>
					<td class="td2"><input type="text" name="stationName" /></td>
				</tr>
				<tr>
					<td class="td1">岗位人数</td>
					<td class="td2"><input type="text" name="maxNumber" /></td>
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