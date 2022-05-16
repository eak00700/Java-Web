<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- Ajax( Asynchronus Javascript and XML)
 자바스크립트를 이용한 백그라운드 통신 기술( 비동기통신) -->
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <!-- js폴더에 있는 httpRequest.js파일을 사용할 준비 -->
 <script src="js/httpRequest.js"> </script>
 	<script>
 		function send() {
 			var dan =  document.getElementById("dan").value;
 			
 			var url = "gugudan_ajax.jsp";
 			var param = "dan="+dan;
 			
 			sendRequest(url, param, resultFn, "GET");
 		}
 		
 		function resultFn(){
 			
 			//console.log(xhr.readtState + "/" + xhr.status);
 			// 0 : 초기화 오류
 			//1, 2, 3 : 로딩중
 			//4 : 콜백메서드 로드 완료
 			
 			//xhr.status
 			//200 : 이상없음
 			//404, 500 : 404 페이지오류 , 500 서버오류
 			if (xhr.readyState==4 &&xhr.status == 200) {
 				
 				//도착한 데이터를 읽어오기
 				var data = xhr.responseText;
 				
 				document.getElementById("disp").innerHTML = data;

 			}
 			
 		}
 		
 	</script>

</head>
<body>
	단 : <input id = "dan">
		<input type="button" value="결과보기" onclick="send();">
		<br>
		<div id="disp">		</div>
</body>
</html>