<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 

<%
	request.setCharacterEncoding("utf-8");
	
	//sung_update.jsp?no=1&name=홍길동&kor=99....
	int no = Integer.parseInt(request.getParameter("no"));
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	String name = request.getParameter("name");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
		function update(f){
			
			//var no = f.no.value.trim();
			//유효성체크 완료
			f.action="sung_modi.jsp";
			f.submit();
			
		}
	</script>
</head>
<body>
	<form>
		<input type="hidden" name="no" value="<%=no%>">
		
		<table border="1">
			<caption>학생정보 수정</caption>
			<tr>
				<th>이름</th>
				<td><input name="name" value="<%=name%>"></td>
			</tr>
			
			<tr>
				<th>국어</th>
				<td><input name="kor" value="<%=kor%>"></td>
			</tr>
			
			<tr>
				<th>영어</th>
				<td><input name="eng" value="<%=eng%>"></td>
			</tr>
			
			<tr>
				<th>수학</th>
				<td><input name="mat" value="<%=mat%>"></td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="button" value="수정"
							onclick="update(this.form);">
					<input type="button" value="취소"
							onclick="location.href='student.jsp'">
				
				</td>
			</tr>
		</table>
	</form>
	
	
	
	
	
	
	
	
	
	
</body>
</html>