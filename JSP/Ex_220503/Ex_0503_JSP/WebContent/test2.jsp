<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//DB에서 다섯개의 과일목록을 가지고 왔다고 가정
	String[] fruit = {"사과","배","바나나","딸기","참외"};
	
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<% for (int i=0; i<fruit.length; i++){%>
		<li><%= fruit[i]%></li>
		
		<% }%>
	</ul>
</body>
</html>