package kr.co.greenapple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	
		//고객센터
	
		@GetMapping("/customer/faq")
		public String faq() {
			
			return "customer/faq";
		}

		
		@GetMapping("/customer/qna")
		public String qna() {
			
			return "customer/qna";
		}
		
//		@GetMapping("customer/qna")
//		public String qna_write() {
//			
//			return "customer/qna_write";
//		}

		@GetMapping("/customer/adopt")
		public String adopt() {
			
			return "customer/adopt";
		}
}
