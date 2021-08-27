package user;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//exception을 해주는 역활도 한다. 
@Service //서비스라는 아이로 빈으로 등록 이아이만 있으면 안된다. 스캔하는 아이가 필요 ==> root_context
public class UserService {
	//dao 또는 mapper를 통해 디비에 데이터를 넣어주거나 처리해준다. 
	@Autowired //있어야 주입이 받아진다
	UserMapper userMapper; //연동시키는 아이 // 쿼리 날려줌 dao역활
	
	public void insertUser(User user) {
		//join날짜가 아직 정해지지 않았으니 현재 날짜로 만들어주자. 
		user.setJoinDate(LocalDateTime.now());
		
		userMapper.insertUser(user);
	}

	public List<User> getUserList() {
		
		List<User> userlist = userMapper.selectAll(); //리스트를 가져오는 메서드
		return userlist;
		
	}

	//id로 user객체를 가져오는 메서드
	public User getUserById(int id) {
		
		//mapper를 이용하여 id로 user 객체를 조회한다. 
		User user = userMapper.selectUserById(id);
		return user;
	}

	//유저를 수정하는 메서드
	public String modifyUser(User user) {
		
		int rows = userMapper.updateUser(user); //쿼리에 대한 결과는 주로 row로 나오니까 몇줄 성공 이렇게
		if(rows>0) {
			return "수정 성공";
		}
		
		return "수정 실패";
		
	}

	//삭제 로직 수행
	public String deleteUserById(int id, String password) {

		//쿼리문으로 id와 비밀번호 같을때만 한다는 거 날리는법
		// 조회한 후 비밀번호 비교해서 삭제하는 방법
		
		//데이터가 있는 지 확인
		User user = userMapper.selectUserById(id);
		
		int rows = 0;
		if(user != null && user.getPassword().equals(password)) {
			rows = userMapper.deleteUserById(id);
		}
		
		if(rows > 0) {
			return "삭제 성공";
		}
		return "삭제 실패";
	}
}
