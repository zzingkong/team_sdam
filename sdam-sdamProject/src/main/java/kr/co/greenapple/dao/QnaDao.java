package kr.co.greenapple.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.greenapple.beans.QnaBean;
import kr.co.greenapple.beans.PageBean;
import kr.co.greenapple.beans.QnaBean;

@Repository
public class QnaDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public void addQna(QnaBean writeQnaBean) {
			sqlSessionTemplate.insert("qna.addQna", writeQnaBean);			
	}
	
//	public String getBoardInfoName(int board_info_idx) {
//		return sqlSessionTemplate.selectOne("board.getBoardInfoName", board_info_idx);
//	}
	
//	public List<QnaBean> getContentList(int board_info_idx, RowBounds rowBounds) {
//		return sqlSessionTemplate.selectList("board.getContentList", board_info_idx, rowBounds);
//	}
	
	public List<Object> getQnaCnt(int page, RowBounds rowBounds) {
		return sqlSessionTemplate.selectList("qna.getQnaCnt", page, rowBounds);
	}
	
//	public List<QnaBean> getQnaDao(QnaBean qnaBean) {
//		return sqlSessionTemplate.selectOne("board.getQnaDao", qnaBean);
//	}
	
	public List<QnaBean> getQnaList(QnaBean qnaBean) {
		 return sqlSessionTemplate.selectList("qna.getQnaList", qnaBean);
	}
	
	public QnaBean readQna(int qna_idx) {
		return sqlSessionTemplate.selectOne("qna.readQna", qna_idx);
	}
	
	
	public QnaBean getModify(int qna_idx) {
		return sqlSessionTemplate.selectOne("qna.getModify", qna_idx);
	}
	
	public void modifyQnaInfo(QnaBean modifyQnaBean) {
		sqlSessionTemplate.update("qna.modifyQnaInfo", modifyQnaBean);
	}
	
	public void deleteQna(int qna_idx) {
		sqlSessionTemplate.delete("qna.deleteQna", qna_idx);
	}
	
	public int getQnaContentCnt(int qna_idx) {
		return sqlSessionTemplate.selectOne("qna.getQnaContentCnt", qna_idx);
	}




}
