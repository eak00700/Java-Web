<%@page import="java.util.ArrayList"%>
<%@page import="vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//톰캣이 JNDI를 검색하기 위한 클래스
	InitialContext ic = new InitialContext();
	
	//Resource위치 검색
	Context ctx = (Context)ic.lookup("java:comp/env");
	
	//검색된 Resource를 통해 필요한 JNDI의 자원을 검색
	DataSource ds = (DataSource)ctx.lookup("jdbc/oracle_test");
	
	//위에서 준비해둔 경로로 로그인 시도(접속)
	
	Connection conn = ds.getConnection();
	
	System.out.println("---연결설공---");
	
	//명령처리객체
	String sql ="select * from dept";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	//실행된 sql문잘을 통해 얻어진 결과를 실제로 VO객체에 담아준다
	ResultSet rs = pstmt.executeQuery();
	
	//부서목록을 저장할 ArrayList생성
	List<DeptVO> dept_list = new ArrayList<DeptVO>();
	while(rs.next()){
		
		DeptVO vo = new DeptVO();
		vo.setDeptno(rs.getInt("deptno") );
		vo.setDname(rs.getString("dname") );
		vo.setLOC(rs.getString("loc"));
		
		dept_list.add(vo);
	}
	
	//연결 후 사용한 DB는 종료코드를 통해 마무리를 지어줘야 한다
	//DB접속과 관련된 모든 객체는 생성도니 역순으로 반드시 닫아주자!!
	rs.close();
	pstmt.close();
	conn.close();
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB연동을 통한 부서테이블 조회</title>
		
		<script>
			function send( data ){
				
				var f = document.getElementById("my_form");
				var deptno = f.deptno;
				deptno.value = data;
				
				f.action="sawon_list.jsp";
				f.submit();
				
			} 
		</script>
		
	</head>
	
	<body>
		<form id="my_form">
		
		<table border="1">
			<caption>부서 목록</caption>
			
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
			</tr>
			<%
			for(int i=0; i<dept_list.size(); i++){ 
				DeptVO vo = dept_list.get(i);
			%>
			<tr>
				<td><%= vo.getDeptno() %></td>
				
				<td>
					<a href="javascript:send('<%= vo.getDeptno()%>');">
					<%= vo.getDname() %>
				</td>
				
				<td><%= vo.getLOC() %></td>
			</tr>
				
				
			<%} %>
		</table>	
		
		<input type="hidden" name="deptno">
		
		
		
		
		</form>
	</body>
</html>