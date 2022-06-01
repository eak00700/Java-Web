<%@page import="dao.SawonDAO"%>
<%@page import="vo.SawonVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//SawonDAO dao = SawonDAO.getInstance();
	//List<SawonVO> list = dao.selectList();
	List<SawonVO> list = SawonDAO.getInstance().selectList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>사원테이블 조회</caption>
			<tr>
				<th>부서번호</th>
				<th>사원번호</th>
				<th>성별</th>
				<th>직급</th>
				<th>상사번호</th>
				<th>이름</th>
				<th>연봉</th>
			</tr>
			<%
			for(int i=0; i<list.size(); i++){
				SawonVO vo = list.get(i);
			%>
			<tr>
				<td><%=vo.getDeptno()%></td>
				<td><%=vo.getSabun()%></td>
				<td><%=vo.getSagen()%></td>
				<td><%=vo.getSajob()%></td>
				<td><%=vo.getSamgr()%></td>
				<td><%=vo.getSaname()%></td>
				<td><%=vo.getSapay()%></td>
				
			</tr>
			<%} %>
	</table>

</body>
</html>