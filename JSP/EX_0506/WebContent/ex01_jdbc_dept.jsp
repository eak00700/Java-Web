<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//톰캣이 JNDI를 검색하기 위해 필요한 클래스
	InitialContext ic = new InitialContext();

	//Resource위치 검색
	Context ctx = (Context)ic.lookup("java:comp/env");
	
	//검색된 Resource를 통해 필요한 JNDI의 자원을 검색
	DataSource ds = (DataSource)ctx.lookup("jdbc/oracle_test");
	
	//위에서 준비해둔 경로로 로그인 시도(접속)
	Connection conn = ds.getConnection();
	
	System.out.println("---연결성공---");
	
	//연결 후 사용한 DB는 종료코드를 통해 마무리를 지어줘야 한다
	conn.close();
%>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB연동을 통한 부서테이블 조회</title>
	</head>
	
	<body>
	
	</body>
</html>





