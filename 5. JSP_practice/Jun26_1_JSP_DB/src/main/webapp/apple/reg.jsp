<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="AppleRegController" method="post"
		name="appleRegForm" onsubmit="return appleRegCheck();">
		<table id="regTbl">
			<tr>
				<th align="center">Apple</th>
			</tr>
			<tr>
				<td class="td1">
					지역 : <input placeholder="지역" autofocus="autofocus"
						autocomplete="off" name="a_location">
				</td>
			</tr>
			<tr>
				<td class="td1">
					색 : <input placeholder="색" autofocus="autofocus"
						autocomplete="off" name="a_color">
				</td>
			</tr>
			<tr>
				<td class="td1">
					맛 : <input placeholder="맛" autofocus="autofocus"
						autocomplete="off" name="a_flavor">
				</td>
			</tr>
			<tr>
				<td class="td1">
					금액 : <input placeholder="금액" autofocus="autofocus"
						autocomplete="off" name="a_price">
				</td>
			</tr>
			<tr>
				<td class="td1">
					소개
				</td>
			</tr>
			<tr>
				<td>
					<textarea rows="5" cols="30" name="a_introduce"></textarea>
				</td>
			</tr>
			<tr>
				<td align="center">
					<button class="btn">등록</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>