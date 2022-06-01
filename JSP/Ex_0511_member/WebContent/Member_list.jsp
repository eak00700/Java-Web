<%@page import="vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MemberDAO dao = MemberDAO.getInstance();
	List<MemberVO> list = dao.selectList(); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		function del(idx){
			if( !confirm("삭제하시겠습니까?")){
				return;
			}
			location.href="mem_del.jsp?idx="+idx;
			
		}
	</script>
</head>
<body>

	<table border="1">
		<tr>
			<th>일련번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이메일</th>
			<th>비고</th>
		</tr>
		<%
		for(int i=0; i<list.size(); i++){
			MemberVO vo = list.get(i);
		%>
		<tr>
			<td><%=vo.getIdx() %></td>
			<td><%=vo.getName() %></td>
			<td><%=vo.getId() %></td>
			<td><%=vo.getPwd() %></td>
			<td><%=vo.getEmail() %></td>
			<td>
			<input type="button" value="수정" onclick="modify('<%=vo.getIdx()%>','<%=vo.getName()%>','<%=vo.getId()%>','<%=vo.getPwd()%>','<%=vo.getEmail()%>';">
			<input type="button" value="삭제" onclick="del('<%=vo.getIdx()%>');">
			</td>
		</tr>
		<%} %>
		
	</table>
	<input type="button" value="추가" onclick="location.href='member_register_form.jsp'">
</body>
</html>