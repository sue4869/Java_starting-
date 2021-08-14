<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${greeting2}</h1>
	${food[0] } <!-- 방법1: 리스트인데 배열처럼 꺼낼 수 있다.  -->
	${food.get(1) } <!-- 메서드 사용 -->
</body>
</html>