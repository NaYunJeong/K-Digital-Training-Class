<%@page import="com.nayun.jun202.main.Guest"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="BMIOutput.css">
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		Guest g = (Guest) request.getAttribute("g");
	%>
	
	<table name="resultTbl">
		<tr>
			<th colspan="2">BMI Result</th>
		</tr>
		<tr>
			<td class="td1" align="center">이름</td>
			<td class="td1"><%=g.getName() %></td>
		</tr>
		<tr>
			<td class="td2" align="center">키</td>
			<td class="td2"><%=g.getHeight() * 100%>cm</td>
		</tr>
		<tr>
			<td class="td3" align="center">몸무게</td>
			<td class="td3"><%=g.getWeight() %>kg</td>
			<%-- 
			<%=g.getWeight() %> 대신 ${g.weight } 사용 가능
			 --%>
		</tr>
		<tr>
			<td class="td4" align="center">BMI</td>
			<td class="td4"><%=g.getBmi() %></td>
		</tr>
		<tr>
			<td colspan="2">
				<marquee>당신은 <%=g.getStatus() %></marquee>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<img src="img/<%=g.getPhoto() %>" style="max-width: 40%;">
			</td>
		</tr>
	</table>
</body>
</html>