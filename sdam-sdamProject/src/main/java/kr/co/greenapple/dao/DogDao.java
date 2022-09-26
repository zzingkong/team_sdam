package kr.co.greenapple.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.greenapple.beans.DogBean;

@Repository
public class DogDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
 	
	public void addDog(DogBean dogBean) {
		sqlSessionTemplate.insert("dog.addDog", dogBean);
	}
	
}
