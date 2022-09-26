package kr.co.greenapple.service;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.greenapple.beans.DogBean;
import kr.co.greenapple.dao.DogDao;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class DogService {
	
	@Value("${path.upload}")
	private String path_upload;
	
	@Autowired
	private DogDao dogDao;
	
	@Resource(name = "dogBean")
	@Lazy
	private DogBean dogBean;
	
	private String saveUloadFile(MultipartFile upload_file) {
		String file_name = System.currentTimeMillis() + "_" + upload_file.getOriginalFilename();
		
		try {
			upload_file.transferTo(new File(path_upload + "/" + file_name));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return file_name;
	}
	
	public void addDog(DogBean dogBean) {
		dogDao.addDog(dogBean);
	}
	
}
