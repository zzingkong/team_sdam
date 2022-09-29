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

import kr.co.greenapple.beans.PageBean;
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

	@GetMapping("/qna")
	public String main(@ModelAttribute QnaBean qnaBean,
//			@RequestParam(value = "page", defaultValue = "1") int page,
			Model model) {
		
		List<QnaBean> qnaContentList = qnaService.getQnaList(qnaBean);
		model.addAttribute("qnaList", qnaContentList);
		
//		List<Object> pageBean = qnaService.getQnaCnt(page);
//		model.addAttribute("pageBean", pageBean);
//		model.addAttribute("page", page);
		
		return "customer/qna_main";
	}

	@GetMapping("/read")
	public String read(
			@RequestParam("qna_idx") int qna_idx,
//			@RequestParam("page") int page,
			Model model) {
		
		model.addAttribute("qna_idx", qna_idx);
		
//		QnaBean readQnaBean = qnaService.getQnaInfo(qna_idx);
//		model.addAttribute("readQnaBean", readQnaBean);
		
		model.addAttribute("loginUserBean", loginUserBean);
		
//		model.addAttribute("page", page);
		
		return "board/read";
	}

	@GetMapping("/write")
	public String write(@ModelAttribute("writeQnaBean") QnaBean writeQnaBean) {
		
//		writeQnaBean.setContent_board_idx(board_info_idx);
		
		return "customer/write";
	}
	
	@PostMapping("/write_pro")
	public String write_pro(@Valid @ModelAttribute("writeQnaBean") QnaBean writeQnaBean, BindingResult result) {
		if(result.hasErrors()) {
			return "qna/qna_write";
		}
		
		qnaService.addQnaContentInfo(writeQnaBean);
		
		return "customer/write_success";
	}

	@GetMapping("/modify")
	public String modify(
			@RequestParam("qna_idx") int qna_idx,
			@ModelAttribute("modifyQnaBean") QnaBean modifyQnaBean,
//			@RequestParam("page") int page,
			Model model) {
		
		model.addAttribute("qna_idx", qna_idx);
		
		QnaBean tempQnaBean = qnaService.getQnaContentInfo(qna_idx);
		
//		modifyQnaBean.setContent_writer_name(tempQnaBean.getContent_writer_name());
		modifyQnaBean.setQna_date(tempQnaBean.getQna_date());
		modifyQnaBean.setQna_subject(tempQnaBean.getQna_subject());
		modifyQnaBean.setQna_content(tempQnaBean.getQna_content());
		modifyQnaBean.setContent_file(tempQnaBean.getContent_file());
		modifyQnaBean.setUser_idx(tempQnaBean.getUser_idx());
		modifyQnaBean.setQna_idx(qna_idx);
		
//		model.addAttribute("page", page);
				
		return "customer/qna_modify";
	}
	
	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyQnaBean") QnaBean modifyQnaBean, BindingResult result,
			@RequestParam("page") int page, Model model) {
		
		model.addAttribute("page", page);
		
		if(result.hasErrors()) {
			return "customer/qna_modify";
		}
				
		qnaService.modifyQnaContentInfo(modifyQnaBean);
		
		return "customer/modify_success";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("qna_idx") int qna_idx,
			Model model) {
		
		qnaService.deleteQnaContentInfo(qna_idx);
		
		return "customer/delete";
	}
	
	@GetMapping("/not_writer") 
	public String not_writer() {	
		return "customer/not_writer";
	}
}
