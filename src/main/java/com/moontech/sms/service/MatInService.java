package com.moontech.sms.service;

import com.moontech.sms.vo.MatInVO;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @file MatInService.java
 * @explain 재료입고
 * @date 2020.02.18
 * @author ACJ-PC0
 */
public interface MatInService {

	public int nextVal() throws Exception;

	public void register(MatInVO vo, List<MatInVO> list)throws Exception;

	public MatInVO read(int inSq) throws  Exception;

	public List<MatInVO> readDe(int inSq) throws Exception;

	public void delete(int inSq) throws  Exception;
}
