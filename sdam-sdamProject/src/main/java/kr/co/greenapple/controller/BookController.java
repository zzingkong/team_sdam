package kr.co.greenapple.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.greenapple.beans.BookBean;
import kr.co.greenapple.beans.DogBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.pager.Pager;
import kr.co.greenapple.service.BookService;
import kr.co.greenapple.service.DogService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private DogService dogService;
	
	@Resource(name="dogBean")
	@Lazy
	private DogBean dogBean;
	
	@Autowired
	private BookService bookService;

	@Resource(name="loginUserBean")
	@Lazy
	private UserBean loginUserBean;

	
	@GetMapping("/book")
	public String book(Pager dogBookPager, Model model) {
		
		model.addAttribute("user_idx",loginUserBean.getUser_idx() );
		List<DogBean> dogBookList = dogService.getDogs(dogBookPager);
		model.addAttribute("dogBookList", dogBookList);
		
		return "book/book";
	}	
	
	/*
	 * @GetMapping("/bookdone") public String bookdone() {
	 * 
	 * return "book/bookdone"; }
	 */
	
	//예약 신청서 등록
	@PostMapping("/book")
	public String addbook(BookBean bookBean, BindingResult bindingResult) {
		
		System.out.println("신청날짜: " + bookBean.getService_date());
		System.out.println("신청시간: " + bookBean.getService_time());
		System.out.println("갱얼쥐idx: " + bookBean.getDog_idx());
		System.out.println("유저idx: " + bookBean.getUser_idx());
		
		if(bindingResult.hasErrors()) {
			return "book/book";
		}
		
		bookService.addBook(bookBean);
				
		return "book/bookdone";
	}
	
	//지역선택시 강아지 리스트 불러오기
//	@GetMapping("/show")
}