<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!-- jsp(java server page) : 연산능력을 가지고 있는 HTML -->
    
    <%
    	//스크립트릿(Scriptlet) : jsp에서 자바코드를 사용하기위한 지정하는 영역
    	//request(요청처리객체), response(응답처리객체) 등의 객체는
    	//jsp가 web페이지로 전환되는 과정에서 만나는 Servlet클래스가 가진 객체이므로
    	//jsp에서는 Servlet클래스가 허용하는 범위안에서 객체를 마음대로 가져다 사용할 수 잇다.
    	String ip = request.getRemoteAddr(); //접속자의 ip를 가져온다
    	Random rnd = new Random();//헤더파일에 Random클래스 import 필수
    	int num = rnd.nextInt(5)+1;
    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	 
	<body>
		<p>&lt;%@내용%&gt; : 더 - 실행시 인코딩, import등을 위해 반드시 지정해야 하는 영역</p>
		<p>&lt;%자바코드%&gt; : 스크립트릿 - jsp에서 자바코드를 쓰고싶을때 만드는 영역</p>
		<p>&lt;%= 변수명%&gt; : 스크립트릿의 출력코드</p>
		<%= ip %>님 방문을 환영합니다.
		<br>
		<%= num %>
		
	</body>
</html> 