package kr.co.greenapple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.greenapple.beans.CustomerBean;
import kr.co.greenapple.dao.CustomerDao;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerDao customerDao;
	
	public void adoptDogForm(CustomerBean customerBean) {
		
		customerDao.addDogForm(customerBean);
	}
	
}
