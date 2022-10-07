package kr.co.greenapple.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.greenapple.beans.BookBean;
import kr.co.greenapple.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/book")
	public String book() {
		
		return "book/book";
	}	
	
	/*
	 * @GetMapping("/bookdone") public String bookdone() {
	 * 
	 * return "book/bookdone"; }
	 */
	
	//예약 신청서 등록
	@PostMapping("/book")
	public String addbook(@RequestParam(value="service_time", required=false) String service_time)  {
//	BookBean bookAddbean = new BookBean(); 
//		bookService.addBook(bookBean);
		
//		model.addAttribute("",bookbean);
			
		System.out.print(service_time+ "야호");
		
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