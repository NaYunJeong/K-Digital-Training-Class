<%@page import="com.nayun.jun212.main.RSPGameEngine"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="RSP.css">
</head>
<body>
	<div align="center"><h1>가위바위보 게임 !</h1></div>
	<form action="HomeController" method="post" enctype="multipart/form-data"
		name="RSPGame">
		<table name="selectTbl">
			<tr>
				<td class="td1" colspan="3" align="center">
					<a href="HomeController?userHand=1"><img src="css/R.jpg"></a>
				</td>
				<td class="td1" colspan="3" align="center">
					<a href="HomeController?userHand=2"><img src="css/S.jpg"></a>
				</td>
				<td class="td1" colspan="3" align="center">
					<a href="HomeController?userHand=3"><img src="css/P.jpg"></a>
				</td>
			</tr>
			<tr>
				<td class="td2" align="center">USER</td>
				<td class="td2" align="center">COMPUTER</td>
			</tr>
		</table>
		<table>
			<tr>
				<td class="td1" colspan="3" align="center">
					판정 : ${r }
				</td>
			</tr>
			<tr>
				<td class="td1" colspan="3" align="center">
					${t } ${w } ${d } ${l }	
				</td>
			</tr>
			<tr>
				<td class="td1" colspan="3" align="center">
					<form action="HomeController" method="post">
						<button>다시하기</button>
					</form>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>




