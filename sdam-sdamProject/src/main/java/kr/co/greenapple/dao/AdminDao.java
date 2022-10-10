package kr.co.greenapple.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.greenapple.beans.BookBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.pager.Pager;

@Repository
public class AdminDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
 	
	
	public List<UserBean> getAdminUserList(UserBean userList) {
		return sqlSessionTemplate.selectList("admin.getAdminUserList", userList);
	}

	public void AdmindeleteUser(int user_idx) {
		sqlSessionTemplate.selectList("admin.AdmindeleteUser", user_idx);
	}

	public List<BookBean> getAdminUserBook(BookBean bookList) {
		return sqlSessionTemplate.selectList("admin.getAdminUserBook", bookList);
	}

	public void adminUserBookAllow(int service_idx) {
		sqlSessionTemplate.selectOne("admin.adminUserBookAllow", service_idx);		
	}

	public void adminUserBookNotAllow(int service_idx) {
		sqlSessionTemplate.selectOne("admin.adminUserBookNotAllow", service_idx);
	}



}
