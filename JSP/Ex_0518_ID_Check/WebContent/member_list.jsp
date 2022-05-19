<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script src="js/httpRequest.js"></script>
	<script>
		function del( idx ){
			 if (!confirm("정말 삭제??")){
				 return;
			 }
			 
			 //삭제를 원하는 사용자의 idx를 Ajax를 통해 서블릿으로 전송
			 var url = "member_del.do";
			 var param = "idx="+idx;
			 
			 sendRequest(url, param, resultFn, "POST");
		}
		
		//콜백메서드
		function resultFn(){
			if(xhr.readyState == 4 && xhr.status==200 ){
				var data = xhr.responseText;//"yes" or "no"
				
				if( data == "yes" ){
					alert("삭제 완료")
				}else{
					alert("삭제 실패")
				}
				location.href = "member_list.do";
			}
		}
	</script>
	<style>
		table{border-collapse:collapse;}
		th{ width:150px;
			height:30px;}
	</style>

</head>

<body>
	<table border="1">
		<tr>
			<td colspan="5" align = "center">
				<input type="button" value="회원가입" 
						onclick ="location.href='member_insert_form.jsp'">
			</td>
		</tr>
		
		<tr>
			<th>회원번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>비고</th>
		</tr>
		<c:forEach var="vo" items="${ list }">
		<tr>
			<td>${vo.idx }</td>
			<td>${vo.name }</td>
			<td>${vo.id }</td>
			<td>${vo.pwd }</td>
			
			<td>
				<input type="button" value="삭제" onclick="del('${vo.idx}');">
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>