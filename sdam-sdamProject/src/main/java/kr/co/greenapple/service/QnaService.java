package kr.co.greenapple.service;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.co.greenapple.beans.QnaBean;
import kr.co.greenapple.beans.ContentBean;
import kr.co.greenapple.beans.PageBean;
import kr.co.greenapple.beans.QnaBean;
import kr.co.greenapple.beans.UserBean;
import kr.co.greenapple.dao.QnaDao;

@Service
@PropertySource("/WEB-INF/properties/option.properties")
public class QnaService {
	
	@Value("${path.upload}")
	private String path_upload;
	
	@Value("${page.listcnt}")
	private int page_listcnt;
	
	@Value("${page.paginationcnt}")
	private int page_paginationcnt;
	
	@Autowired
	private QnaDao qnaDao;
	
	@Resource(name = "loginUserBean")
	@Lazy
	private UserBean loginUserBean;	
	
	private String saveUloadFile(MultipartFile upload_file) {
		String file_name = System.currentTimeMillis() + "_" + upload_file.getOriginalFilename();
		
		try {
			upload_file.transferTo(new File(path_upload + "/" + file_name));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return file_name;
	}
	
	public void addQna(QnaBean writeQnaBean) {
		MultipartFile upload_file = writeQnaBean.getUpload_file();
		
		if(upload_file.getSize() > 0) {
			String file_name = saveUloadFile(upload_file);
			writeQnaBean.setContent_file(file_name);
		}
		writeQnaBean.setQna_writer_idx(loginUserBean.getUser_idx());
		
		qnaDao.addQna(writeQnaBean);
	}
	
	
//	public String getBoardInfoName(int board_info_idx) {
//		return qnaDao.getBoardInfoName(board_info_idx);
//	}
	
	
	public PageBean getContentCnt(int page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<QnaBean> getQnaList(QnaBean qnaBean) {
		
//		int start = (page - 1) * page_listcnt;
//		RowBounds rowBounds = new RowBounds(start, page_listcnt);
		
		return qnaDao.getQnaList(qnaBean);
	}
	
	
	public QnaBean readQna(int qna_idx) {
		return qnaDao.readQna(qna_idx);
	}
	
	
	
	
	public QnaBean modifyQna(int qna_idx) {
		return qnaDao.modifyQna(qna_idx);
	}
	
	public void modifyQnaInfo(QnaBean modifyQnaBean) {
		MultipartFile upload_file = modifyQnaBean.getUpload_file();
		
		if(upload_file.getSize() > 0) {
			String file_name = saveUloadFile(upload_file);
			modifyQnaBean.setContent_file(file_name);
		}
		qnaDao.modifyQnaInfo(modifyQnaBean);
	}
	
	
	
	
	
	public void deleteQna(int qna_idx) {
		qnaDao.deleteQna(qna_idx);
	}
	
	
//	public PageBean getQnatCnt(int currentPage) {
//		
//		int qna_cnt = qnaDao.getQnaContentCnt(currentPage);
//		PageBean pageBean = new PageBean(currentPage, page_listcnt, page_paginationcnt, qna_cnt);
//		return pageBean;
//	}
}
