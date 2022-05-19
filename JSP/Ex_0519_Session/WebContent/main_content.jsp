<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="check_login.jsp"/>
	메인페이지<br>
	${vo.name }님 환영합니다.<br>
	<input  type="button" value="로그아웃" 
			onclick="location.href='logout.do'">
	
</body>
</html>