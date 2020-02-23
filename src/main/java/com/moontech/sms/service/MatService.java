package com.moontech.sms.service;

import com.moontech.sms.vo.MatVO;
import java.util.List;

public interface MatService {

	public List<MatVO> stock()throws Exception;
}
