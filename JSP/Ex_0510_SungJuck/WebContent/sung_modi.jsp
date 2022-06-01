<%@page import="vo.SungjuckVO"%>
<%@page import="dao.SungjuckDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 

<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	int no = Integer.parseInt(request.getParameter("no"));
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	
	
	//DAO의 update() 메서드로 전달할 파라미터를vo로 포장
	SungjuckVO vo = new SungjuckVO();
	vo.setNo(no);
	vo.setName(name);
	vo.setKor(kor);
	vo.setEng(eng);
	vo.setMat(mat);
	
	int res = SungjuckDAO.getInstance().update(vo);
	
	if( res >= 1){
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