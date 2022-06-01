<%@page import="vo.SungjuckVO"%>
<%@page import="dao.SungjuckDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//register.jsp?name=민준성&kor=11&eng=11&mat=11
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	
	//DB에 추가할 정보를 VO에 묶어둔다.
	SungjuckVO vo = new SungjuckVO();
	vo.setName(name);
	vo.setKor(kor);
	vo.setEng(eng);
	vo.setMat(mat);
	
	
	int res = SungjuckDAO.getInstance().insert(vo);
	
	if(res == 1){
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