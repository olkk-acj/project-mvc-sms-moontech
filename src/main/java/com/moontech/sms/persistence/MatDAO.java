package com.moontech.sms.persistence;

import com.moontech.sms.vo.MatVO;
import java.util.List;

public interface MatDAO {
	// PK 최신값
	public int nextVal()throws Exception;
	// 재고
	public List<MatVO> matSqList() throws Exception;
	public MatVO matStockList(MatVO matSq) throws Exception;
	// 등록
	public void create(MatVO mVo) throws Exception;
	public void createStock(int matSq) throws Exception;
	// 수정
	public void update(MatVO mVo) throws  Exception;
	// 상세보기
	public MatVO read(int matSq) throws Exception;
	// 삭제
	public void delete(int matSq) throws Exception;
}
