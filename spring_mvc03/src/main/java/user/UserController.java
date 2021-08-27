package user;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//필요한데이터만 받게 하는 클래스 ==> Model로 담겨서 return으로 보낸다
@Controller //spring으로 빈으로 등록시킴
@RequestMapping("/user") //()안의 요청을 하면 springDispacher로 들어갔다가 이 주소에 맞는 컨트롤러를 찾는 것.
public class UserController {
	
	@Autowired //클래스에 객체를 주입시키기
	UserService userService;
	
	//클래스가 아닌 메서드 자체가 실행되니까 메서드 만들기
	//사용자에게 user정보를 입력할 수 있는 화면을 제공할 것 localhost:8080/user/input을 치면 입력할 수 있는 화면을 보여줄것이다. 
	@GetMapping("/input")
	public String inputForm() {
		System.out.println("inputForm() 메서드 호출");
		
		//return "WEB-INF/view/inputForm.jsp";로 써야 하는데 뷰리졸버에 의해 앞뒤로 서줄것이기에
		return "inputForm"; //inputForm으로 보내겠다
	}

	@PostMapping("/input")
	public String inputForm(User user) {
		
		System.out.println("포스트로 데이터 받음");
		System.out.println(user);
		
		//데이터 받았으니 서비스로 데이터베이스로 보내자.
		// 콘솔 창에 :User [id=0, userId=test, password=22, birthDate=2021-08-03, joinDate=null]
		userService.insertUser(user);
		
		return "result"; //mybatis 설정까지 했으면 result를 나타내는 페이지 만들어주기
	}
	
	//목록페이지
	//목록을 받겠다
	@GetMapping("/list")
	public String getList(Model m) { //
		//service를 이용해서 목록을 가져오는 코드 실행
		List<User> userList = userService.getUserList(); //이 메서드 호출하면 리스트가 나온다.
		System.out.println(userList);
		
		//화면에 보내주기 위하여 모델객체에 보낼 데이터를 넣어준다. 
		m.addAttribute("userList",userList);
		
		return "list"; //list를 화면에 보내준다
	}
	
	//수정요청
	@GetMapping("/modify") //modify로 요청할때 수정 화면으로
	public String modifyUser(int id, Model m) {
		System.out.println("id :" +id);
		//서비스를 이용하여 해당되는 user정보를 가져온다. 수정 전 상태(정보)를 확인하기 위해 꺼내는 단꼐
		User user = userService.getUserById(id);
		
		//화면에 유저 정보를 보내기 위해 모델 객체에 담아준다. 
		m.addAttribute("user",user);//user에 객체를 담아서 보내준 것이기때무네 modifyForm에도 user.id로 입력해야 한다. 그냥 id가 아니라
		return "modifyForm";
	}
	
	//수정하기
	//정상이면 return result라서 정상인지 아닌지 판별도 가능하게 한다. 
	@PostMapping("/modify")
	public String modifyUser(User user, Model m) {
		
		//수정 결과에 대한 내용을 result에 담음
		String result = userService.modifyUser(user);
		
		//결과내용을 화면에 보내줌
		m.addAttribute("result", result);
		
		return "result";
	}
	
	//삭제 요청
	@GetMapping("/delete")
	public String deleteUser(int id, Model m) {
		User user = userService.getUserById(id);
		
		m.addAttribute("user", user);
		
		return "deleteForm";
	}
	
	@PostMapping("/delete")
	public String deleteUser(int id,String password, Model m) {
		
		String result = userService.deleteUserById(id,password);
		
		m.addAttribute("result",result);
		
		return "result";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
