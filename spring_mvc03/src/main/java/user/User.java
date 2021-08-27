package user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private int id;
	private String userId;
	private String password;
<<<<<<< HEAD
	@DateTimeFormat(pattern="yyyy-MM-dd") //패턴이 yyyy-MM-dd라면 그 문잘를 localDate로 변경해서 필드에 넣어줘라
	private LocalDate birthDate;
=======
	@DateTimeFormat(pattern="yyyy-MM-dd") //패턴이 yyyy-MM-dd라면 그 문잘를 localDate로 변경해서 필드에 넣어줘라. 형식이 안맞는것을 수정
	private LocalDate birthDate;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") //내가 받고자 하는 형태를 적어준다 . 
>>>>>>> serve
	private LocalDateTime joinDate;
	public User() {
		super();
	}
	public User(int id, String userId, String password, LocalDate birthDate, LocalDateTime joinDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.birthDate = birthDate;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public LocalDateTime getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", birthDate=" + birthDate
				+ ", joinDate=" + joinDate + "]";
	}
	
}
