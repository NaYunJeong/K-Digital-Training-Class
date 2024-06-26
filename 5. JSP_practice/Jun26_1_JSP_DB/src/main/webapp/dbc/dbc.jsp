<%@page import="com.nayun.db.manager.NayunDBManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 톰캣이 튜브대여소 역할을 할 줄 알아요!
		// 튜브 = Connection 객체
		
		// 기존 : DriverManager.getConnection()을 실행하는 순간
		//	관련된 모든 작업을 해서 Connection 객체를 만들어 줌
		
		// 커넥션풀 : 미리 Connection객체 x 100개 만들어놓고
		//	클라이언트가 요청을 하면 => 만들어진거 하나 주면 됨 => 비교적 빠름
		
		// 설정 - context.xml(설계도, 계획서 느낌)
		// Servers폴더(좌측) - context.xml
		//		저걸 건들면 .. 워크스페이스 안에 있는 모~~든 프로젝트에 다 영향 !
		//		프로젝트가 다르다 => DB서버가 다르다
		
		// 우리가 만든 context.xml을 각 프로젝트의 META-INF폴더에 복사해서 활용하자 !
		
		String result = "실패";
		
		Connection con = null;
		try {
			con = NayunDBManager.connect("nayunPool");
			result = "성공";
		} catch (Exception e) {
			e.printStackTrace();
		}
		NayunDBManager.close(con, null, null);
	%>
	<h1>DB연결</h1>
	<h1><%=result %></h1>
</body>
</html>