<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>구구단</title>
		<style>
			table{border-collapse:collapse;}
			tr{height:30px;}
			td{width:100px;
				text-align:center;}
		</style>
</head>
<body>
	<table border='1'>
		<%for (int i=1; i<=9; i++){ %>
			<tr>
				<%for(int j=2; j<=9; j++){%>
					<td>
					<%=j %> * <%=i %> = <%=j*i %>
					</td>
				<%}%>
			</tr>		
		<%}%>
	</table>
	
	
</body>
</html>