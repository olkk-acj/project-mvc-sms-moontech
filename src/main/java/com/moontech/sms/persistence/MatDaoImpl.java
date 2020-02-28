package com.moontech.sms.persistence;

import com.moontech.sms.vo.MatVO;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MatDaoImpl implements MatDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.moontech.sms.mapper.matMapper";

		@Override
	public int nextVal() throws Exception {
		return 0;
	}

	@Override
	public List<MatVO> matSqList() throws Exception {
		return session.selectList(namespace + ".matSqList");
	}

	@Override
	public MatVO matStockList(MatVO matSq) throws Exception {
		return session.selectOne(namespace + ".matStockList", matSq);
	}

	@Override
	public void create(MatVO mVo) throws Exception {

	}

	@Override
	public void createStock(int matSq) throws Exception {

	}

	@Override
	public MatVO read(int matSq) throws Exception {
		return null;
	}

	@Override
	public void update(MatVO mVo) throws Exception {

	}

	@Override
	public void delete(int matSq) throws Exception {

	}
}
