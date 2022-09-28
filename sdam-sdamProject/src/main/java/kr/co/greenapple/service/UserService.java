package kr.co.greenapple.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;
	
	public boolean checkUserIdExist(String user_id) {
		String user_name = userDao.checkUserIdExist(user_id);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkUserTelExist(String user_tel) {
		String user_name = userDao.checkUserTelExist(user_tel);
		
		if(user_name == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addUserInfo(UserBean joinUserBean) {
		userDao.addUserInfo(joinUserBean);
	}
	
	public void getLoginUserInfo(UserBean loginInfo) {
		UserBean loginInfo2 = userDao.getLoginUserInfo(loginInfo);
		
		if(loginInfo2 != null) {
			loginUserBean.setUser_idx(loginInfo2.getUser_idx());
			loginUserBean.setUser_name(loginInfo2.getUser_name());
			loginUserBean.setUserLogin(true);
		}
	}
	
	public void getModifyUserInfo(UserBean modifyUserBean) {
		UserBean loginInfo = userDao.getModifyUserInfo(loginUserBean.getUser_idx());
	
		modifyUserBean.setUser_id(loginInfo.getUser_id());
		modifyUserBean.setUser_name(loginInfo.getUser_name());
		modifyUserBean.setUser_idx(loginInfo.getUser_idx());
		
		//회원정보수정
		modifyUserBean.setUser_tel(loginInfo.getUser_tel());
		modifyUserBean.setUser_address(loginInfo.getUser_address());
	}
	
	public void modifyUserInfo(UserBean modifyUserBean) {
		modifyUserBean.setUser_idx(loginUserBean.getUser_idx());
		
		userDao.modifyUserInfo(modifyUserBean);
	}
	
	public void addTherapist(UserBean joinUserBean) {
		userDao.addTherapist(joinUserBean);
	}
	
}
