package com.moontech.sms.persistence;

import com.moontech.sms.vo.MatInVO;
import java.util.List;

public interface MatInDAO {
	// Latest PK
	public int nextVal()throws Exception;
	//등록
	public void create(MatInVO Vo) throws Exception;
	public void createDe(MatInVO vo) throws Exception;
	public void updateStock(MatInVO vo) throws Exception;
	//읽기
	public MatInVO read(int inSq) throws Exception;
	public List<MatInVO> readDe(int inSq) throws Exception;
	//삭제
	public void delete(int inSq) throws Exception;
	public void deleteDe(int inSq) throws Exception;
}
