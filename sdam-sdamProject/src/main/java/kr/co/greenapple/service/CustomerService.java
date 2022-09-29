package kr.co.greenapple.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.greenapple.beans.CustomerBean;
import kr.co.greenapple.beans.DogBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.dao.CustomerDao;

@Service
public class CustomerService {

	
//	@Autowired
//	private CustomerDao customerDao;
//	
//	@Resource(name = "loginUserBean")
//	private UserBean loginUserBean;
//	
//	@Resource(name = "dogBean")
//	private DogBean dogBean;
//	
//	public void adoptDogForm(CustomerBean customerBean) {
//		
//		customerDao.addDogForm(customerBean);
//		customerBean.setAdopt_idx(loginUserBean.getUser_idx());
//		customerBean.setDog_idx(dogBean.getDog_idx());
//		
//		customerDao.addDogForm(customerBean);
//	}
	
}
