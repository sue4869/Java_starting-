<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modifyForm.jsp</title>
</head>
<body>
	<h1>유저 수정 화면</h1>
	<form action="/user/modify" method="post"> <!--post방식이라 이걸을 수행할 controller가 필요하다.--> 
		<fieldset>
			<legend>수정</legend>
			<input type="text" value="${user.id}" name="id" readonly="readonly"><br>
			<input type="text" value="${user.userId}" name="userId" placeholder="유저아이디"><br>
			<input type="password" value="${user.password}" name="password"  placeholder="비밀번호"><br>
			생년월일 : <input type="date" value="${user.birthDate}" name="birthDate"><br>
			<input type="datetime-Local" value="${user.joinDate}"  name="joinDate" readonly="readonly"><br>
			<input type="submit" value="수정하기">
 		</fieldset>
	
	</form>
</body>
</html>