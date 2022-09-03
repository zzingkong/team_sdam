package kr.co.greenapple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServiceController {
	//테라피독
	@GetMapping("/therapydog")
	public String therapydog() {

		return "service/therapydog";
	}
	
	@GetMapping("/therapist")
	public String therapist() {

		return "service/therapist";
	}
	
	
}
