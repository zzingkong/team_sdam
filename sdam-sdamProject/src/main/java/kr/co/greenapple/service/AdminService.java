package kr.co.greenapple.service;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.greenapple.beans.BookBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.dao.AdminDao;
import kr.co.greenapple.dao.UserDao;
import kr.co.greenapple.pager.Pager;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class AdminService {
	
	//첨부파일경로
	@Value("${path.upload}")
	private String path_upload;
	
	@Autowired
	private AdminDao adminDao;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;
	
	
	//admin user 관리
	public List<UserBean> getAdminUserList(Pager userPager) {
		int total = adminDao.userTotal(userPager);
		userPager.setTotal(total);
		return adminDao.getAdminUserList(userPager);
	}

	//admin user 탈퇴
	public void AdmindeleteUser(int user_idx) {
		adminDao.AdmindeleteUser(user_idx);
	}

	//admin 예약 목록 관리
	public List<BookBean> getAdminUserBook(Pager bookPager) {
		int total = adminDao.bookTotal(bookPager);
		bookPager.setTotal(total);
		return adminDao.getAdminUserBook(bookPager);
	}

	public void adminUserBookAllow(int service_idx) {
		adminDao.adminUserBookAllow(service_idx);
	}

	public void adminUserBookNotAllow(int service_idx) {
		adminDao.adminUserBookNotAllow(service_idx);		
	}

}
