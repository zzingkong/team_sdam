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
	
	
	/*
	@GetMapping("/timecheck")
	@ResponseBody
	public String timecheck(@RequestParam String date) throws ParseException{
		
		// String ~> Date 객체로 변환할 것임 (Date 객체에 날짜 비교 함수가 있어서)
		// SimpleDateFormat string ~> date, date ~> string 형식을 지정하여 변환
		
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	//형식 지정
		
		
		Date dateFrom = sdf.parse("2022-09-01 00:00:00"); //db에서 시작날짜를 string 가져왔다고 하고, String ~> date
		Date dateTo = sdf.parse("2022-09-15 23:59:59"); //db에서 끝날짜를 string 가져왔다고 하고, String ~> date
		
		//전달받은 9월 14일 날짜를 변환, String~> Date
		Date dateCheck = sdf.parse(date + " 10:00:00"); //약간의 꼼수를 이용한 형식맞추기
		
		
		if(dateCheck.after(dateFrom) && dateCheck.before(dateTo)) {
			return "Reservation success";
		}else {
			return "Reservation fail";
		}
	}	
	*/
}