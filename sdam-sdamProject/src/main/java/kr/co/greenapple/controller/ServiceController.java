package kr.co.greenapple.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import kr.co.greenapple.beans.DogBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.pager.Pager;
import kr.co.greenapple.service.DogService;
import kr.co.greenapple.service.UserService;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	@Autowired
	private DogService dogService;
	
	@Autowired
	private UserService userService;
	
	@Resource(name="dogBean")
	@Lazy
	private DogBean dogBean;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;
	
	//테라피독
	@GetMapping("/therapydog")
	public String therapydog(
//			@Valid @ModelAttribute("modifyUserBean") UserBean modifyUserBean, BindingResult result,
//			@RequestParam("user_idx") int user_idx,
//			@ModelAttribute("userInfoBean") UserBean userInfoBean,
//			@ModelAttribute("userInfo") DogBean userInfo,
			Pager dogPager,
			Model model) {
		
		List<DogBean> list = dogService.getDogs(dogPager);
		model.addAttribute("dogList", list);
		
//		userService.getLoginUserInfo(modifyUserBean);
		
//		userService.getDogUserInfo(user_idx);
//		userService.getModifyUserInfo(userInfoBean);
//		userService.getDogUserInfo(userInfoBean);
//		userService.getUserInfo(user_idx);
		
		//tId가 idx 번호에 사람을 DB에서 가져옴
//		UserBean userBean1 = userService.getUserInfo(user_idx);
		//그걸 model.addAttribute에서 그 사람을 추가함
//		model.addAttribute("therapistInfo", userBean1);
		
//		UserBean ubean = userService.getUserInfo(user_idx);
//		model.addAttribute("userInfo", ubean);
		
//		List<DogBean> list = dogService.getDogs();
//		model.addAttribute("dogList", list);	
		
//		dogService.getUserInfo(loginUserBean);
//		System.out.println("메인 컨트롤러: " + dogService.getUserInfo(loginUserBean)); 
//		System.out.println("메인 컨트롤러: " + userService.getUserInfo(0).getUser_info());  
		
//		userService.getLoginUserInfo(modifyUserBean);
		
//		for (ObjectError e : result.getAllErrors()) {
//		System.out.println(e.getDefaultMessage());
//	}
		
//		System.out.println("메인컨트롤러2222 :" + modifyUserBean.getUser_info() ); 
		
		return "service/therapydog";
	}

	//modal 테라피독 정보
	@GetMapping("/getdoginfo")
	//@ResponseBody  jsp파일 자체를 return할 때는 @ResponseBody 없어야함
	public String getdoginfo(@RequestParam int dog_idx,
							 Model model) {
		//dog_idx값 받아서 쿼리 작성 ->
		DogBean dogInfo = dogService.modalDogs(dog_idx);
		//model.addAttribute부분 작성
		model.addAttribute("dogInfo", dogInfo);

		return "service/modaldog";
	}
		
	//테라피독 등록
	@GetMapping("/adddog")
	public String adddog_get(@ModelAttribute("dogBean") DogBean dogBean, UserBean userBean) {
		
		return "service/adddog";
	}
	
	@PostMapping("/joindog")
	public String adddog_post(@Valid @ModelAttribute("dogBean") DogBean dogBean) {

		dogService.addDog(dogBean);
		
		return "service/adddog_success";
	}
	
	//테라피스트 페이징
	 @GetMapping("/therapist") 
	 public String therapist(Model model,Pager pager) {

				 
		 List<UserBean> list = userService.gettherapists(pager);
		 model.addAttribute("therapist", list);
		
		 
		//db에서 가져옴
		List<UserBean> therapistlist = userService.getUserInfos();
		model.addAttribute("therapistlist",therapistlist);
		 
		return "service/therapist"; 
	}
	
	//테라피스트 더보기
	@GetMapping("/therapistdetail")
	public String therapistdetail(Model model, @RequestParam int userIdx) {

				
		//tId가 idx 번호에 사람을 DB에서 가져옴
		UserBean userBean = userService.getUserInfo(userIdx);
		//그걸 model.addAttribute에서 그 사람을 추가함
		model.addAttribute("therapist", userBean);
		
		return "service/therapistdetail";
	}
	
	


}