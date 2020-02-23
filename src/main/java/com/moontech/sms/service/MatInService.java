package com.moontech.sms.service;

import com.moontech.sms.vo.MatInVO;
import com.moontech.sms.vo.MatVO;
import java.util.List;

/**
 * @file MatInService.java
 * @explain 재료입고
 * @date 2020.02.18
 * @author ACJ-PC0
 */
public interface MatInService {
	// PK 최신값
	public int nextVal() throws Exception;
	// 재고
	public List<MatVO> stock()throws Exception;

	//등록
	public void write(MatInVO vo, List<MatInVO> list)throws Exception;

	// 상세보기
	public MatInVO read(int inSq) throws  Exception;
	public List<MatInVO> readDe(int inSq) throws Exception;

	// 삭제
	public void delete(int inSq) throws  Exception;
}
