<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//EL(Expression Language) : jsp에서 사용하는 출력코드를 더 간결하게 사용하기 위한 표현구조
	/*
	--EL로 값을 표현하려면 jsp가 접근 가능한 4개 영역에서만 가능하다.
	1) page scope : 저장된 데이터를 현재 페이지에서만 공유하고 사용할 수 있다.
	2) request scope : 저장된 데이터를 최대 두 개 페이지에서 공유 할 수 있다.
	3) session scope : 전역개념으로써 톰캣이 실행될 때 자동으로 만들어지며, 같은 웹 브라우저 내에서 값 공유가 가능
	4) application scope : 같은 프로젝트 내의 jsp들만 데이터를 공유
	*/
	
	String msg = "안녕";
	request.setAttribute("msg", "requsetScope영역에 저장됨");
	session.setAttribute("msg2", "세션에 저장됨");
	session.setAttribute("msg", "세션2");
	pageContext.setAttribute("msg", "페이지영역");
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	파라미터 데이터	: ${ param.data }<br>
	스크립트릿에 저장된 데이터 : <%= msg %><br>
	request데이터 : ${ requestScope.msg }<br>
	session데이터 : ${ sessionScope.msg2 }<br>
	${ msg }<br>
	<!-- 영역을 생략했을때 접근순서
		1) pageScope
		2) requestScope
		3) sessionScope
		4) applicationScope-->
</body>
</html>