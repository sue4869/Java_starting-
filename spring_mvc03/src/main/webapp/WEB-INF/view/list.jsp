<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 태그로 반복문 쓰려구 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<!-- 컨트롤러로 받은 값 출력해주기 -->
	<h1>유저 정보 목록화면</h1>
	<a href="/user/input">유저 정보 등록</a>
	<section>
		<c:forEach var="user" items="${userList}">
			<fieldset>
				id: ${user.id}<br>
				유저아이디 : ${user.userId } <br>
				비밀번호 : ${user.password }<br>
				생년월일 : ${user.birthDate } <br>
				등록일: ${user.joinDate} <br>
				
			</fieldset>
		</c:forEach>
	</section>
	
</body>
</html>