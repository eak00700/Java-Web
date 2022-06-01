<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	//member_del.jsp?idx=21
	request.setCharacterEncoding("utf-8");

	int idx = Integer.parseInt(request.getParameter("idx"));
	
	//idx에 해당하는 유저를 DB에서 삭제
	int res = MemberDAO.getInstance().delete(idx);
	
	if( res >= 1){
		response.sendRedirect("Member_list.jsp");
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