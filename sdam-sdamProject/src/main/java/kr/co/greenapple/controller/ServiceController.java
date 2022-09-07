package kr.co.greenapple.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.greenapple.beans.DogBean;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	@Resource(name="dogBean")
	@Lazy
	private DogBean dogBean;
	
	//테라피독
	@GetMapping("/therapydog")
	public String therapydog() {

		return "service/therapydog";
	}
	
	//테라피독 등록
	@GetMapping("/adddog")
	public String adddog_get(@ModelAttribute("dogBean") DogBean dogBean) {
		
		return "service/adddog";
	}
	
	@PostMapping("/joindog")
	public String adddog_post(@Valid @ModelAttribute("dogBean") DogBean dogBean) {

		return "service/therapydog";
	}
	
	//테라피스트
	@GetMapping("/therapist")
	public String therapist() {

		return "service/therapist";
	}
	//테라피스트 더보기
	@GetMapping("/therapistdetail")
	public String therapistdetail() {
		return "service/therapistdetail";
	}
}
