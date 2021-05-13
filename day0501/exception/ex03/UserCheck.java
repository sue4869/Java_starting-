package day0501.exception.ex03;

public class UserCheck {
	
	public boolean check(String userId,String password) throws InvalidUserIdException, InvalidPasswordException{
		//길이를 판단 
		//8자 이상인가?
		
		userId = userId.trim();
		if(userId.length() < 8 ) {
			throw new InvalidUserIdException();
		
		}
		
		password = password.trim();
		if(userId.length() < 8 ) {
			throw new InvalidPasswordException("비번의 문제!");
			
		}
		
		
		return true; //정상적이면 true 반환
	}

}
