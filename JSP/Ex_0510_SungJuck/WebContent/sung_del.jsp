<%@page import="dao.SungjuckDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//post타입으로 파라미터가 넘어오면 한글은 깨진다.
	//한글이 깨지는 것을 방지하기위한 인코딩을 설정을 해줘야 한다.
	request.setCharacterEncoding("utf-8");
	
	//sung_del.jsp?no=1
	int no = Integer.parseInt(request.getParameter("no"));
	int res = SungjuckDAO.getInstance().delete(no);
	
	if( res >= 1 ){
		//location.href='student.jsp';
		response.sendRedirect("student.jsp");
		
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>