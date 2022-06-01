<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${ vo.name }<br>
	나이 : ${ vo.age }<br>
	전화 : ${ vo.tel }<br>
	
	<!-- 스프링은 jsp에서 jsp로 바로 화면전화이 불가하므로
		반드시 컨트롤러를 거쳐서  jsp로 전환해줘야 한다. -->
	<input type="button" value="돌아가기"
			onclick="location.href='insert_form.do'">
</body>
</html>