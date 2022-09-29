package kr.co.greenapple.controller;


import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
//	@Resource(name = "loginUserBean")
//	@Lazy
//	private UserBean loginUserBean;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
//		System.out.println(loginUserBean);
		
		//파일 업로드를 위한 절대경로 확인
		//System.out.println(request.getServletContext().getRealPath("/"));
		
		
		return "main";
	}
}

