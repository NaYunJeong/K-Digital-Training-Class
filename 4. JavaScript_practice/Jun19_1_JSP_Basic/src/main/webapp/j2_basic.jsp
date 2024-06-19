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
	<%--
		랜덤한 숫자(1 ~ 100)를 넣었을 때, 짝인지 홀인지 알려주는 기능
		뽑은 숫자와 홀짝 여부를 웹페이지에 출력
	 --%>
	 <%-- 
	 <% Random r = new Random();
	 	int num = r.nextInt(100) + 1;
	 	if (num % 2 == 0) {
	 		out.print(num + "은 짝");
	 	} else {
	 		out.print(num + "은 홀");
	 	}
	 %>
	 --%>
	 
	 <%!
	 	public String getOE(int x) {
			return (x % 2 == 0) ? "짝수" : "홀수"; 
	 	}
	 %>
	 <%
	 	Random rr = new Random();
	 	int x = rr.nextInt(100) + 1;
	 %>
	 <h1>뽑은 숫자 : <%=x %></h1>
	 <h1>홀짝 여부 : <%=getOE(x) %></h1>
	 
</body>
</html>