<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<script>
			function send( f ) {
				var title = f.title.value.trim();
				var photo = f.photo.value.trim();
				
				//유효성 체크
				if(title==''){
					alert("제목을 입력하세요")
					return;
				}
				
				if(photo=''){
					alert("파일을 선택해주세요")
					 return;
				}
				//upload.do의 url매핑을 가진 서블릿을 호출
				f.action = "upload.do";
				f.submit();
			}
		</script>
	</head>
		
	<body>
	<!-- 파일 업로드시 주의사항
	1) form 태그의 전송방식은 반드시 POST
	2) enctype="multipart/form-data" : 필수!!
	   enctype(form 태그의 파일 데이터를 전송할 떄 사용하는 인코딩 기법) -->
		<form method="POST" enctype="multipart/form-data">
			제목 : <input name="title"><br>
			첨부 : <input type="file" name="photo"><br>
			<input type ="button" value="업로드" onclick="send(this.form);">
						
		
		</form>
		
		
	</body>
</html>



























