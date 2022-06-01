<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${ 1 + 1 } = ${ 1 + 1 }<br>
	\${ 2 - 1 } = ${ 2 - 1 }<br>
	\${ 3 * 3 } = ${ 3 * 3 }<br>
	\${10 / 3 } = ${ 10 / 3 } or ${ 10 div 3 }<br>
	\${10 % 3 } = ${10 % 3} or ${ 10 mod 3 }<br>
	
	<hr>
	
	\${ 3 > 2 } = ${ 3 > 2 } or ${ 3 gt 2 }<br>
	\${ 3 < 2 } = ${ 3 < 2 } or ${ 3 lt 2 }<br>
	\${ 3 >= 2 } = ${ 3 >= 2 } or ${ 3 ge 2 }<br>
	\${ 3 >= 2 } = ${ 3 <= 2 } or ${ 3 le 2 }<br>
	\${ 3 == 2 } = ${ 3 eq 2 }<br>
	\${ 3 != 2 } = ${ 3 ne 2 }<br>
	
	<hr>
	
	파라미터값 : ${ param.msg eq null ? '그래 참이다' : '거짓이다' }<br>
	파라미터값 : ${ empty param.msg ? '그래 참이다' : '거짓이다' }<br>
	
	<hr>
	
	파라미터값 : ${ empty param.abc or param.abc eq 10 }<br>
</body>
</html>