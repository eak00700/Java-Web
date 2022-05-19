<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="js/httpRequest.js"></script>
	
	<script>
		function send(f){
			var id = f.id.value.trim();
			var pwd = f.pwd.value.trim();
			
			if( id == '' ){
				alert("아이디를 입력하세요");
				return;
			}
			
			if( pwd == '' ){
				alert("비밀번호를 입력하세요");
				return;
			}
			
			var url ="login.do";
			var param = "id="+encodeURIComponent(id)+"&pwd="+encodeURIComponent(pwd);
			
			sendRequest(url, param, myCheck, "post");
			
		}
		//콜백메서드
		function myCheck(){
			if( xhr.readyState == 4 && xhr.status == 200 ){
				
				var data = xhr.responseText;
				//data = "[{'param':'no_id'}]"
				
				var json = eval(data);
				
				if( json[0].param == 'no_id' ){
					alert("아이디가 존재하지않습니다.");
				}else if(json[0].param == 'no_pwd'){
					alert("비밀번호가 다릅니다.")
				}else{
					alert("로그인 성공!");
					location.href="main_content.jsp";
				}
				
			}
		}
	</script>

</head>
<body>
	<form>
		<table border="1" align="center">
			<caption>:::로그인:::</caption>
			
			<tr>
				<th>아이디</th>
				<td><input name="id"></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input name="pwd" type="password"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="login" onclick="send(this.form);">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>