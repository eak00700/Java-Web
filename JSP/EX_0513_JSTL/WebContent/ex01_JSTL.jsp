<%@page import="java.util.Date"%>
<%@page import="vo.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- JSTL(Jsp Standard Tag Library) : HTML영역에서 if, for등을 사용할 수 있도록 해주는 라이브러리 -->

<!-- JSTL라이브러리는 헤더영역에 반드시 등록되어 있어야 한다. -->
<!-- if,forEach, choose...등을 사용할 수 있도록 하는 라이브러리 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 날짜, 숫자에 대한 format형식을 지정하기 위한 라이브러리 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	int num = 10;
	request.setAttribute("n", num);
	
	List<String> array = new ArrayList<>();
	array.add("서울");
	array.add("대구");
	array.add("부산");
	request.setAttribute("array",array);
	
	UserVO u1 = new UserVO();
	u1.setIdx(1);
	u1.setName("홍길동");
	
	UserVO u2 = new UserVO();
	u2.setIdx(2);
	u2.setName("독고길동");
	
	List<UserVO> uList = new ArrayList<>();
	uList.add(u1);
	uList.add(u2);
	request.setAttribute("list", uList);
%>

<%
	//fmt 라이브러리 관련
	int money = 1200000000;
	Date today = new Date();
	
	request.setAttribute("money", money);
	request.setAttribute("today", today);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ n eq 10 }">
		<c:out value="참"/>
	</c:if>
	
	<hr>
	<!-- else -->
	<!--  choose 영역 내부에는 주석을 달지 말것!! -->
	<c:choose>
		<c:when test="${ param.msg eq 10 }">나는 10이야</c:when>
		<c:when test="${ prarm.msg eq 11 }">나는 11이야</c:when>
		<c:otherwise>모두 아니야</c:otherwise>
	</c:choose>
	
	<hr>
	<!-- var : 값을 담을 변수
		 begin : 시작 값
		 end : 끝 값
		 step : 증가 값 -->
	<c:forEach var="i" begin="1" end="5" step="1" >
		
	 <c:if test="${ i mod 2 eq 1}"><!-- i % 2 ==1 -->
		<font color="red">안녕( ${ i } )</font> <br>
	 </c:if>
	</c:forEach>
	
	<hr>
	
	<!-- for(String s : array -->
	<c:forEach var="s" items="${ array }" varStatus="cnt">
		${ cnt.count } / ${ s } ------ ${ cnt.index } / ${ s }  <br>
	</c:forEach>

	<hr>
	
	<c:forEach var="u" items="${ list }">
		${ u.idx } / ${ u.name } <br>
	</c:forEach>
	
	<hr>
	
	fmt라이브러리 관련<br>
	&#8361;<fmt:formatNumber value="${ money }"/>원
	<br>
	
	<fmt:formatDate value="${ today }"/><br>
	<fmt:formatDate value="${ today }" pattern ="YYYY년 MM월 dd일"/>
	
	
	
	
</body>
</html>