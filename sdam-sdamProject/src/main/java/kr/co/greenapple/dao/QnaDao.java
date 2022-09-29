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

	public void addQnaContentInfo(QnaBean writeQnaBean) {
			sqlSessionTemplate.insert("qna.addQnaContentInfo", writeQnaBean);			
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
		 return sqlSessionTemplate.selectOne("qna.getQnaList", qnaBean);
	}
	
	public QnaBean getQnaContentInfo(int qna_idx) {
		return sqlSessionTemplate.selectOne("qna.getQnaContentInfo", qna_idx);
	}
	
	public void modifyQnaContentInfo(QnaBean modifyQnaBean) {
		sqlSessionTemplate.update("qna.modifyContentInfo", modifyQnaBean);
	}
	
	public void deleteQnaContentInfo(int qna_idx) {
		sqlSessionTemplate.delete("qna.deleteQnaContentInfo", qna_idx);
	}
	
	public int getQnaContentCnt(int qna_idx) {
		return sqlSessionTemplate.selectOne("qna.getQnaContentCnt", qna_idx);
	}


}
