<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- JSON( Javascript Object Notation) 표기법 :
 서로 다른 프로그램에서 데이터를 교환하기 편리하도록 규격화도니 표기법 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script>
	//단일 json
		var p = {'name' : '홍길동','age':20, 'tel':'010-111-1111'}
		document.write( "이름 : "+p.name + "<br>" );
		document.write( "나이 : "+p.age +"<br>" );
		document.write( "전화 : "+p.tel+"<br>" );
		
		document.write( "<hr>" );
		
		//json 1차 배열
		
		var p_arr = [{'name':'일길동','age':30},
					 {'name':'이길동','age':40}];
		
		document.write( p_arr[0].name+"/"+p_arr[0].age+"<br>" );
		document.write( p_arr[1].name+"/"+p_arr[1].age+"<br>" );
		
		//json 다차원 배열
		
		var course = {'name': '웹앱개발',
					  'start':'2022-02-01',
					  'end':'2022-07-01',
					  'sub':['java','jsp','spring'],
					  'student':[{'name':'홍길동','age':'20'},
						  		 {'name':'김길동','age':'22'}]};
		document.write("<hr>");
		document.write("과목명 : "+course.name+"<br>");
		document.write("시작일 : "+course.start+"<br>");
		document.write("종료일 : "+course.end+"<br>");
		document.write("과목 : " +course.sub[0]+","
							    +course.sub[1]+","
							    +course.sub[2]+"<br>");
		document.write("학생들 : "+course.student[0].name +"/"+
							     course.student[0].age+"<br>");
	</script>
</head>
<body>

</body>
</html>