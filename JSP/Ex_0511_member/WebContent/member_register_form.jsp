<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		function send(f){
			
			var name=f.name.value.trim();
			//유효성체크
			if(name==''){
				alert("이름을 입력하세요");
				return;
			}
			var email=f.email.value.trim();
			var e_pattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
			
			if(!e_pattern.test(email) ){
				alert("이메일 형식이 올바르지 않습니다.");
				return;
			}
			
			f.method="post";
			f.action="member_reg.jsp"
			f.submit();
		}
	</script>
</head>
<body>
	<!-- 회원정보 입력 폼 -->
	<form>
		<table border="1">
			<caption>회원가입</caption>
			
			<tr>
				<th>이름</th>
				<td><input name="name"></td>
			</tr>
			
			<tr>
				<th>아이디</th>
				<td><input name="id"></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			
			<tr>
				<th>이메일</th>
				<td><input name="email"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="등록"
					onclick="send(this.form);">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>