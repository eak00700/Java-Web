<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//request(요청처리객체)
	//response(응답처리객체)
	
	//ex01_jsp_input.jsp에서 넘겨준 세 개의 파라미터를 수신해보자
	//test_param.jsp?m_name=aaa&age=13&tel=1111
	String t_name=request.getParameter("m_name");
	String tel=request.getParameter("tel");
	
	//파라미터로 넘어오는 모든 값은 문자열이거나 바이너리타입
	//파라미터 데이터는 위의 두 타입이 아닌 정수, 문자, 실수타입 등으로 넘어오는 경우가 아예 없다.
	int age = Integer.parseInt(request.getParameter("age"));
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
		이름 : <%= t_name %><br>
		나이 : <%= age %><br>
		전화 : <%= tel %>
		
		
		
		
		
		
	</body>
</html>