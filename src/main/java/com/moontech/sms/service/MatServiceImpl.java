package com.moontech.sms.service;

import com.moontech.sms.dao.MatDAO;
import com.moontech.sms.vo.MatVO;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class MatServiceImpl implements MatService {

	@Inject
	private MatDAO mDao;


	@Override
	public List<MatVO> stock() throws Exception {
		return null;
	}
}
