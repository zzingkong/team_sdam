package kr.co.greenapple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.greenapple.beans.ContentBean;
import kr.co.greenapple.beans.PageBean;
import kr.co.greenapple.service.BoardService;

@Controller
public class CustomerController {

	
		@Autowired
		private BoardService boardService;
	
		//고객센터
	
		@GetMapping("/customer/faq")
		public String faq() {
			
			return "customer/faq";
		}

		
		@GetMapping("/customer/qna")
		public String qna(@RequestParam(value = "board_info_idx", defaultValue="4") int board_info_idx,
			@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
			model.addAttribute("board_info_idx",board_info_idx);
			
//			String boardInfoName = boardService.getBoardInfoName(board_info_idx);
//			model.addAttribute("boardInfoName", boardInfoName);
			
			List<ContentBean> contentList = boardService.getContentList(board_info_idx, page);
			model.addAttribute("contentList", contentList);
			
			PageBean pageBean = boardService.getContentCnt(board_info_idx, page);
			model.addAttribute("pageBean", pageBean);
			
			model.addAttribute("page", page);
			
			return "board/main";
		}
		
		
		@GetMapping("/customer/adopt")
		public String adopt() {
			
			return "customer/adopt";
		}
}
