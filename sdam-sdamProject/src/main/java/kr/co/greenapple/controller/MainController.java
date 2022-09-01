package kr.co.greenapple.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.greenapple.beans.BoardInfoBean;
import kr.co.greenapple.beans.ContentBean;
import kr.co.greenapple.service.MainService;
import kr.co.greenapple.service.TopMenuService;

@Controller
public class MainController {
	
	@Autowired
	private MainService mainService;
	
	@Autowired
	private TopMenuService topMenuService;

	@GetMapping("/main")
	public String main(Model model) {
		
		ArrayList<List<ContentBean>> list = new ArrayList<List<ContentBean>>();
		
		for(int i=1; i<=4; i++) {
			List<ContentBean> list1 = mainService.getMainList(i);
			list.add(list1);
		}
		
		model.addAttribute("list", list);
		
		List<BoardInfoBean> board_list = topMenuService.getTopMenuList();
		model.addAttribute("board_list", board_list);
		
		return "main";
	}
	
	
	//고객센터
	
	@GetMapping("customer/faq")
	public String faq() {
		
		return "customer/faq";
	}

	
	@GetMapping("customer/qna")
	public String qna() {
		
		return "customer/qna";
	}
	
//	@GetMapping("customer/qna")
//	public String qna_write() {
//		
//		return "customer/qna_write";
//	}

	@GetMapping("customer/adopt")
	public String adopt() {
		
		return "customer/adopt";
	}
	
}
