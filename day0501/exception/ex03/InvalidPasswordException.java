package day0501.exception.ex03;

public class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String message) {
		super(message);
	}
}
