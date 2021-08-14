package user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/hello")
	public String helloView() {
		
		System.out.println("helloView 메서드 실행!");
		
		//이 페이지의 파일 주소에 해당되는 jsp파일을 클라이언트에게 보내게 된다. 
		return "/WEB-INF/view/hello.jsp";
	}
	
	//응답하는 
	@RequestMapping(path="/hello2", method = RequestMethod.GET)
	public ModelAndView helloMV() {
		ModelAndView mv = new ModelAndView();
		
		//mv에 화면에다가 보내줄 데이터를 담기
		//키,테이터
		mv.addObject("greeting","hello world!!");
		mv.addObject("number",100);
		
		//결과화면(view)정보도 추가해줌
		mv.setViewName("/WEB-INF/view/hello.jsp");
		
		return mv;
	}
	
	@GetMapping("/hello3") // callbyreference?? 방식
	public String hello3(Model m) {
		m.addAttribute("greeting2", "안녕하세요");
		List<String> list = new ArrayList();
		list.add("밥");
		list.add("국");
		return "/WEB-INF/view/hello.jsp";
		
	}
}
