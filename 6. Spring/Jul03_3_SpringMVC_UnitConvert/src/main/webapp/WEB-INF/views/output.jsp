<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.length {
		color: red;
	}
	
	.width {
		color: green;
	}
	
	.temp {
		color: blue;
	}
	
	.speed {
		color: pink;
	}
</style>
</head>
<body>
	<h1 class="${param.what }">변 환 결 과</h1>
	${ur.n1 } ${ur.u1 } → ${ur.n2 } ${ur.u2 }
</body>
</html>