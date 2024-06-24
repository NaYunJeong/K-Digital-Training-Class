<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/NayunValidChecker.js"></script>
<script type="text/javascript" src="js/NBValidChecker.js"></script>
<script type="text/javascript" src="js/go.js"></script>
<link rel="stylesheet" href="css/nb.css">
</head>
<body>

	<form action="HomeController" name="nbForm" onsubmit="return check();">
		<table id="nbTbl">
			<tr>
				<th align="center">숫자 야구</th>
			</tr>
			<tr>
				<td align="center">
					<input class="ip" name="userAns"
					maxlength="3" autocomplete="off" autofocus="autofocus"> 
				</td>
			</tr>
			<tr>
				<td class="tbl" align="left">
					<marquee behavior="alternate">숫자만 3자리, 중복 숫자 X</marquee>
				</td>
			</tr>
			<tr>
				<td align="center"><button class="btn">확인</button>
			</tr>
			<tr>
				<td class="tbl" align="left">User : ${ua }</td>
			</tr>
			<tr>
				<td class="tbl" align="left">Strike : ${s }</td>
			</tr>
			<tr>
				<td class="tbl" align="left">Ball : ${b }</td>
			</tr>
			<tr>
				<td class="tbl" align="left">Test : ${t }</td>
			</tr>
			<tr>
				<td class="tbl" align="left">Result : ${r }</td>
			</tr>
		</table>
	</form>
	
	<div align="center">
		${btn }
	</div>
	${con }
</body>
</html>