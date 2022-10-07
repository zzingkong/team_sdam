package kr.co.greenapple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.greenapple.beans.BookBean;

import kr.co.greenapple.dao.BookDao;


@Service
public class BookService {
	
	
	@Autowired
	private BookDao bookDao;
	
	//예약 값 넣기
	public void addBook(BookBean bookBean) {
		bookDao.addBook(bookBean);
	}

}
