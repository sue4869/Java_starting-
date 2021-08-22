<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputForm.jsp</title>
<script>
 	window.addEventListener("DOMContentLoaded", function(){
 		var form = document.querySelector("form") //폼이라는 태그를 가져와서 객체화 함
 		console.dir("form");
 		form.onsubmit = function() {
 			
 			
 	 		var pwd = document.querySelector("input[name=password]");
 	 		var pwdConfirm = document.querySelector("input[name=passwordConfirm]");
 	 		
 	 		if(pwd.value != pwdConfirm.value) {
 	 			pwd.focus();// 커서가 깜박깜박하도록
 	 			// sumbit이 진행되지 않도록 함
 	 			return false;
 	 			
 	 		}
 			
 			
 		}
 		
 	});
</script>
</head>
<body>
	<h1>사용자 정보를 입력하세요</h1> <!-- /맨앞에 있으면 root고 없으면 상태적으로 붙이는 것 -->
	<form action="/user/input" method="post"><!-- 서버로 데이터를 보낼때는 post를 사용 -->
		<input type="text" name="userId" placeholder="유저아이디"><br> <!-- 입력받기 -->
		<input type="password" name="password" placeholder="비밀번호" ><br>
		<input type="password" name="passwordConfirm" placeholder="비밀번호 확인"><br>
		생년월일 : <input type="date" name="birthDate"><br>
		<input type="submit" value="등록하기">
	</form> 
</body>
</html>