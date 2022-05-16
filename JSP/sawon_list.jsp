<%@page import="vo.SawonVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.SawonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//SawonDAO dao = SawonDAO.getInstance();
	//List<SawonVO> sawon_list = dao.selectList();
	List<SawonVO> sawon_list = SawonDAO.getInstance().selectList();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>사원목록</caption>
		
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>부서번호</th>
			<th>직책</th>
			<th>입사일</th>
		</tr>
		
		<%
		for( int i = 0; i < sawon_list.size(); i++ ){
			SawonVO sa = sawon_list.get(i);
		%>
		<tr>
			<td><%= sa.getSabun() %></td>
			<td><%= sa.getSaname()%></td>
			<td><%= sa.getDeptno()%></td>
			<td><%= sa.getSajob()%></td>
			<td><%= sa.getSahire()%></td>
		</tr>		
		<%} %>
	</table>
</body>
</html>







