<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 전달하기</title>
		
		<script>
			function send( f ) {
				var name = f.m_name.value;
				var age = f.age.value;
				var tel = f.tel.value;
				
				//유효성 체크
				if(name==''){
					alert("이름을 입력하세요");
					return;
				}
				if(tel==''){
					alert("번호를 입력해주세요");
					return;
				}
				if(age==''){
					alert("나이를 입력해주세요")
					return;
				}
				
				//숫자판단 정규식
				var pattern = /^[0-9]{1,3}$/;
				if( !pattern.test( age ) ){
					alert("나이는 정수로 입력하세요");
					return;
				}
				
				f.action="test_param.jsp"
				f.submit();
			}
		</script>
		
		
		
	</head>
	
	<body>
		<form method="get">
			이름 : <input name="m_name"><br>
			나이 : <input name="age"><br>
			전화 : <input name="tel"><br>
			
			<input type="button" value="파라미터 전송" onclick="send(this.form)">
		</form>
		
		
	</body>
</html>