package com.moontech.sms.persistence;

import com.moontech.sms.vo.MatInVO;
import java.util.List;

public interface MatInDAO {
	// InSq
	public int nextValMatInSq()throws Exception;
	//등록
	public int create(MatInVO mVo) throws Exception;
	public int createDe(MatInVO mVo) throws Exception;
	//읽기
	public MatInVO read(int inSq) throws Exception;
	public List<MatInVO> readDe(int inSq) throws Exception;
	//삭제
	public void delete(int inSq) throws Exception;
	public void deleteDe(int inSq) throws Exception;
}