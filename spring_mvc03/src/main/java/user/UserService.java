package user;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
