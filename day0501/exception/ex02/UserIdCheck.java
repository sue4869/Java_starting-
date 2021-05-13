package day0501.exception.ex02;

public class UserIdCheck {
	
	public boolean check(String userId) throws InvalidUserIdException {
		//길이를 판단 
		//8자 이상인가?
		
		userId = userId.trim();
		if(userId.length() < 8 ) {
			throw new InvalidUserIdException();
			//여기로 들어가면(잘못된상황이면) return이 아니라 InvalidUserException으로
		}
		
		return true; //정상적이면 true 반환
	}

}
