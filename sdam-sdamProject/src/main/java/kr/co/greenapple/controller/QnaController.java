package kr.co.greenapple.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

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

import kr.co.greenapple.beans.QnaBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.service.QnaService;

@Controller
@RequestMapping("/customer")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;	

	
	//qna main 목록 출력하기
	@GetMapping("/qna")
	public String main(QnaBean qnaBean, Model model) {
		
		List<QnaBean> qnaList = qnaService.getQnaList(qnaBean);
		model.addAttribute("qnaList", qnaList);
		
		return "customer/qna_main";
	}

	//qna 게시글 작성 불러오기
	@GetMapping("/write")
	public String write(@ModelAttribute("writeQnaBean") QnaBean writeQnaBean, Model model) {
		
		System.out.println("로그인한 idx : "+ loginUserBean.getUser_idx());
		model.addAttribute("loginUserBean", loginUserBean);
		
		return "customer/qna_write";
	}
	
	//qna 게시글 작성
	@PostMapping("/write_pro")
	public String write_pro(@Valid @ModelAttribute("writeQnaBean") QnaBean writeQnaBean, BindingResult result) {
		if(result.hasErrors()) {
			return "customer/qna_write";
		}
		qnaService.addQna(writeQnaBean);
		
		return "customer/qna_write_success";
	}
	

	//qna 게시글 읽기
	@GetMapping("/read")
	public String read(@RequestParam("qna_idx") int qna_idx, Model model) {
		
		model.addAttribute("qna_idx", qna_idx);
		
		QnaBean readQnaBean = qnaService.readQna(qna_idx);
		
		model.addAttribute("readQnaBean", readQnaBean);
		
		model.addAttribute("loginUserBean", loginUserBean);
		
		return "customer/qna_read";
	}
	
	
	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyQnaBean") QnaBean modifyBean, @RequestParam("qna_idx") int qna_idx, Model model) {
		
		model.addAttribute("qna_idx", qna_idx);
		
		QnaBean modiBean = qnaService.modifyQna(qna_idx);
		
		modifyBean.setQna_writer_name(modiBean.getQna_writer_name());
		modifyBean.setQna_date(modiBean.getQna_date());
		modifyBean.setQna_subject(modiBean.getQna_subject());
		modifyBean.setQna_content(modiBean.getQna_content());
//		modifyBean.setContent_file(modifyBean.getContent_file());
		modifyBean.setQna_writer_idx(modiBean.getQna_writer_idx());
		modifyBean.setQna_idx(qna_idx);
		
		return "customer/qna_modify";
	}
	
	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyQnaBean") QnaBean modifyQnaBean, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute(modifyQnaBean.getQna_idx());
			return "customer/qna_modify_fail";
		}
		
		qnaService.modifyQnaInfo(modifyQnaBean);
		
		return "customer/qna_modify_success";
	}
	

	@GetMapping("/delete")
	public String delete(@RequestParam("qna_idx") int qna_idx, Model model) {
		
		qnaService.deleteQna(qna_idx);
		return "customer/qna_delete";
	}
	
	@GetMapping("/not_writer") 
	public String not_writer() {	
		return "customer/qna_not_writer";
	}
}
