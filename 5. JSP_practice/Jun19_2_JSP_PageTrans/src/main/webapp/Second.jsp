<%@page import="java.util.Random"%>
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
		// 값
		//	(요청)parameter
		//			html에서 만들어낸 값(a, b)
		//			request에 저장
		//			String or String[]
				
		// 		attribute
		//			Java에서 만들어낸 값(c, d, e)
		//			request에 저장
		//			Object (최상위 객체)
		
		// 이동
		//		First => Second : 사용자가 뭔가 액션을 해서 넘어옴
		//			=> request(요청) !!!
		
		//		Second => Third : 액션 X 그냥 넘어감 (자동)
		//			- redirect : 단순 자동이동 (ex) 점검중..) (데이터를 가져오지 못하고 단순히 이동만 하는 것)
		//				response.sendRedirect("Third.jsp");
		//			- forward : 자동 이동 (값이 전달됨)
		//				RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
		//				rd.forward(request, response);
		//			- include : 포함 (Second속에 Third가 포함되는)
		//				단점 : 위치 조절이 안됨(Third가 무조건 상단에 들어옴/ 포함되는 애가 위쪽에 들어옴_형태 이상) - 비추 !!
		//				조만간 ! 위치 조절이 되는 include를 보도록 합시다 !!
		//				RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
		//				rd.include(request, response);
		
	%>
	<% 
		request.setCharacterEncoding("UTF-8");
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		// RequestDispatcher : 클라이언트로부터 들어온 요청을 원하는 쪽으로 넘기는 기능
		// 호출된 페이지에서는 request.setAttribute(key, value) 메소드를 통해서
		//	넘겨받은 데이터를 처리할 수 있음 (second에서 넘겨준 것을 third에서 처리할 수 있음)
		//	=> Redirect와는 다르게(데이터처리를 못하는 redirect) request와 response 객체를 가지고 넘어가기 때문에
		RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
		
		int c = a + b;
		request.setAttribute("c", c);
		
		String d = "ㅋ";
		request.setAttribute("d", d);
		
		Random e = new Random();
		request.setAttribute("e", e);
		
		// rd.forward(request, response);
		rd.include(request, response);
		// respose.sendRedirect("Third.jsp");
		
	%>
	<h1>second</h1>
	<hr>
	a : <%=a %> <br>
	b : <%=b %> <br>
</body>
</html>