<%@page import="java.util.ArrayList"%>
<%@page import="com.nayun.jun211.main.Nayun"%>
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
		// EL (Expression Language)
		//		값 받을 때 Java 대신 가능
		//		.jsp에서만 사용 가능
		//			(.jsp를 톰캣이 Servlet으로 바꿀때 EL을 Java코드로 바꿔줌)
		//		문법 : ${XXX }
		//			연산자 사용 가능
		//			형 변환 자동
		//			값이 없으면 그냥 넘어감
		//			import가 없어도 됨
		
		//		파라미터값 읽기 : ${param.파라미터명 }
		
		// 		어트리뷰트값 읽기(int, double, String, ... 포함)
		//				: ${어트리뷰트명 }
		
		//		어트리뷰트값 읽기(객체)
		//				주소값 - &{어트리뷰트명 }
		//				속성값 - ${어트리뷰트명.멤버변수명 }
		
		//		어트리뷰트값 읽기(List, [])
		//				AL, [] 자체 - ${어트리뷰트명 }
		//				인덱스 위치의 객체 - ${어트리뷰트명[인덱스] }
		//				인덱스 위치의 객체 속성 - ${어트리뷰트명[인덱스].멤버변수명 }
		
		//		반복문, 조건문 - EL (X) / CustomTag (O)
	%>

	<%
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int z = (Integer) request.getAttribute("z");
		
		Nayun n = (Nayun) request.getAttribute("n");
		
		ArrayList<Nayun> ny = (ArrayList<Nayun>) request.getAttribute("ny");
	%>
	<h1>결과</h1>
	<%=x %> x <%=y %> = <%=z %> <br>
	<%=n.getName() %> : <%=n.getAge() %> : <%=n.getHeight() %> : <%=n.getWeight() %> <p>
	<%=n %> <p>
	
	<%=ny %> <p>
	<%=ny.get(1) %> <p>
	<%=ny.get(2).getName() %>, <%=ny.get(3).getAge() %> <p>
	
	<%
		for (int i = 0; i < ny.size(); i++) {
	%>
			<%=ny.get(i).getName() %> : <%=ny.get(i).getAge() %>살 <br>
	<%
		}
	%>
	<hr>
	${param.x } <p>
	${param.y } <p>
	${param.x * param.y } <p>
	${z } <p>
	<hr>
	${n.name } : ${n.age } : ${n.height } : ${n.weight } <p>
	<hr>
	${param.aldjglakjelgjl;ajdlgjal;je } <!-- 값이 없을 때는 어떨까 ? -->
	<hr>
	${ny } <p>
	${ny[1] } <p>
	${ny[2].name }, ${ny[3].age } <p>
	
</body>
</html>