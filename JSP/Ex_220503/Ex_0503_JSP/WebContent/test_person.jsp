<%@page import="vo.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<PersonVO> pList = new ArrayList<>();
	
	//DB에서 두명의 유저 정보를 가지고 와서 pList에 저장했다고 가정
	PersonVO p1 = new PersonVO();
	p1.setName("홍길동");
	p1.setAge(20);
	p1.setTel("010-1111-1111");
	
	PersonVO p2 = new PersonVO();
	p2.setName("박길동");
	p2.setAge(30);
	p2.setTel("010-2222-2222");
	
	pList.add(p1);
	pList.add(p2);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	 
	<body>
		<table border='1'>
			<tr>
				<th>이름</th>
				<th>나이</th>
				<th>전화</th>
			</tr>
			
			<% for(int i=0; i<pList.size(); i++ ){ %>
				<tr>
					<td><%=pList.get(i).getName() %></td>
					<td><%=pList.get(i).getAge() %></td>
					<td><%=pList.get(i).getTel() %></td>
				</tr>
			<%} %>
		</table>
		
		
		
	</body>
</html>