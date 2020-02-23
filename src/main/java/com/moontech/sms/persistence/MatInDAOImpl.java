package com.moontech.sms.persistence;

import com.moontech.sms.vo.MatInVO;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MatInDAOImpl implements MatInDAO{

	@Inject
	private SqlSession session;
	private static String namespace = "com.moontech.sms.mapper.matInMapper";

	@Override
	public int nextVal() throws Exception {
		return session.selectOne(namespace + ".nextVal");
	}

	@Override
	public void create(MatInVO mVo) throws Exception {
		session.insert(namespace + ".create");
	}

	@Override
	public void createDe(MatInVO vo) throws Exception {
		session.insert(namespace + ".createDe", vo);
	}

	@Override
	public void updateStock(MatInVO vo) throws Exception {
		session.insert(namespace + ".updateStock", vo);
	}

	@Override
	public MatInVO read(int inSq) throws Exception {
		return session.selectOne(namespace + ".read", inSq);
	}

	@Override
	public List<MatInVO> readDe(int inSq) throws Exception {
		return session.selectList(namespace + ".readDe", inSq);
	}

	@Override
	public void delete(int inSq) throws Exception {
		session.delete(namespace + ".delete", inSq);
	}

	@Override
	public void deleteDe(int inSq) throws Exception {
		session.delete(namespace + ".deleteDe", inSq);
	}
}
