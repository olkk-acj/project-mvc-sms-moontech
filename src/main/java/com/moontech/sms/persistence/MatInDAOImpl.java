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
	public int nextValMatInSq() throws Exception {

	}

	@Override
	public int create(MatInVO mVo) throws Exception {
		return 0;
	}

	@Override
	public int createDe(MatInVO mVo) throws Exception {
		return 0;
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
