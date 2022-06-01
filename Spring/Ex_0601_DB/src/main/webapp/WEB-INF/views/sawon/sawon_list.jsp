<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>:::사원목록 조회:::</caption>
			<tr>
				<th>사원번호</th>
				<th>부서번호</th>
				<th>이름</th>
				<th>급여</th>
			</tr>
			
			<c:forEach var="vo" items="${ list }">
			<tr>
				<td>${ vo.sabun }</td>
				<td>${ vo.deptno }</td>
				<td>${ vo.saname }</td>
				<td>${ vo.sapay }</td>
			</tr>
			</c:forEach>
	</table>
</body>
</html>