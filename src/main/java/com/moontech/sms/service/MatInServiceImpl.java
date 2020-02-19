package com.moontech.sms.service;

import com.moontech.sms.persistence.MatInDAO;
import com.moontech.sms.vo.MatInVO;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class MatInServiceImpl implements MatInService {

	@Inject
	private MatInDAO dao;

	@Override
	public int nextVal() throws Exception {
		int inSq = dao.nextVal();
		return inSq + 1 ;
	}

	@Override
	public void register(MatInVO vo, List<MatInVO> list) throws Exception {
		dao.create(vo);
		dao.createDe(list);
	}

	@Override
	public MatInVO read(int inSq) throws Exception {
		return dao.read(inSq);
	}

	@Override
	public List<MatInVO> readDe(int inSq) throws Exception {
		return dao.readDe(inSq);
	}

	@Override
	public void delete(int inSq) throws Exception {
		dao.delete(inSq);
		dao.deleteDe(inSq);
	}
}
