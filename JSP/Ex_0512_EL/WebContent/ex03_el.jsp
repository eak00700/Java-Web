<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.UserVO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Map<String, Integer> map = new HashMap<>();
	map.put("key1", 100);
	map.put("key2", 200);
	map.put("key3", 300);
	map.put("key4", 400);
	
	request.setAttribute("myMap", map);
	
	UserVO vo = new UserVO();
	vo.setAge(21);
	vo.setName("홍길동");
	request.setAttribute("vo", vo);
	
	List<UserVO> list = new ArrayList<>();
	UserVO vo1 = new UserVO();
	vo1.setAge(25);
	vo1.setName("길동");
	
	list.add(vo);
	list.add(vo1);
	request.setAttribute("list", list);
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	map에 저장된 데이터 가져오기<br>
	${ myMap.get("key1") }<br>
	${ myMap['key2'] }<br>
	${ myMap["key3"] }<br>
	${ myMap.key4 }<br><!-- 가장 많이 쓰는 방법 -->
	
	<hr>
	<!-- ${vo.age} vo객체에 있는 getAge()호출하는 기능이므로
	vo에는 반드시 getter가 생성되어 있어야 한다. -->
	vo에 저장된 데이터 가져오기
	${ vo.age } / ${ vo.name }<br>
	
	<hr>
	
	List에 담긴 데이터 가져오기<br>
	${ list[0].age } / ${ list[0].name }<br>
	${ list[1].age } / ${ list[1].name }<br>
	
</body>
</html>

























