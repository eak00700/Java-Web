<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
			
		<script src="js/httpRequest.js"></script>
		
		<script>
			//아이디 중복여부 체크
			var b_idCheck = false;
			
			function send(f){
				
				if( !b_idCheck ){
					alert("아이디 중복체크를 먼저 하세요");
					return;
				}
				
				var id = f.id.value.trim();
				var pwd = f.pwd.value.trim();
				var name =f.name.value.trim();
				
				//유효성체크
				if(id==''){
					alert("아이디를 입력하세요");
					return;
					
				}
				
				
				f.method = "post";
				f.action = "insert.do";
				f.submit();
			
				
			}
			
			function check_id(){
				var id = document.getElementById("id").value.trim();
				
				if(id == ''){
					alert("아이디를 입력해주세요!");
					return;
				}
				
				var url ="check_id.do";
				var param = "id="+ encodeURIComponent(id);
				
				sendRequest(url, param, resultFn, "POST");
			}
			
			function resultFn(){
				if(xhr.readyState == 4&&xhr.status == 200){
					//"[{'res':'no'}]"
					//도착한 json구조의 데이터를 받는다.
					var data = xhr.responseText;//"[{'res':'no'}]"
					
					//문자열 구조인 data를 실제 JSON형태로 변환
					var json = eval(data);//[{'res':'no'}]
					if(json[0].res=='no'){
						alert("이미 사용중인 아이디 입니다.");
					}else{
						//회원가입이 가능한 경우
						alert("사용 가능한 아이디 입니다.")
						b_idCheck = true;
					}
				}
				//아이디를 입력받는 입력상자의 값이 변환되면 호출되는 메서드
				
			}
			function che(){
				b_idCheck = false;
			}
		</script>
		
	</head>
	
	<body>
		<form>
			<table border="1">
				<caption>:::회원가입:::</caption>
				
				<tr>
					<th>아이디</th>
					
					<td>
						<input name="id" id="id" onchange="che();">
						<input type="button" value="중복체크" onclick="check_id();">
					</td>
				</tr>
				
				<tr>
					<th>이름</th> 
					
					<td>
						<input name="name">
						
					</td>
				</tr>

				<tr>
					<th>비밀번호</th>
					<td>
						<input name="pwd" type="password">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="가입하기" onclick="send(this.form);">
						<input type="button" value="취소" onclick="location.href='member_list.do'">
					</td>
				</tr>
			</table>
			
		</form>
		
		
		
		
	</body>
</html>