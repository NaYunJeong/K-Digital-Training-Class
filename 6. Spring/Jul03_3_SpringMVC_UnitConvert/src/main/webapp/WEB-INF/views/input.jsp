<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>단 위 변 환</h1>
	<form action="unit.convert">
		<input placeholder="숫자 입력" name="n1"> <p>
		<select name="what">
			<option value="length">cm → inch</option>
			<option value="width">㎡  → 평</option>
			<option value="temp">℃ → ℉</option>
			<option value="speed">mi/h → km/h</option>
		</select> <p>
		<button>변 환</button>
	</form>
</body>
</html>