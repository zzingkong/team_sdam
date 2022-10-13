package kr.co.greenapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.greenapple.beans.BookBean;
import kr.co.greenapple.beans.DogBean;
import kr.co.greenapple.dao.BookDao;


@Service
public class BookService {
	
	
	@Autowired
	private BookDao bookDao;
	
	//예약 값 넣기
	public void addBook(BookBean bookBean) {
		bookDao.addBook(bookBean);
	}

	public List<BookBean> showDog(BookBean bookBean) {
		return bookDao.showDog(bookBean);
	}


	//테라피독 리스트 불러오기
}