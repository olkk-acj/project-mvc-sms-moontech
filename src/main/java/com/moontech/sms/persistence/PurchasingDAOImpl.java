package com.moontech.sms.persistence;

import com.moontech.sms.vo.PurchasingVO;
import java.util.List;
import java.util.PrimitiveIterator;
import javax.inject.Inject;
import javax.xml.stream.events.Namespace;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttribute;

@Repository
public class PurchasingDAOImpl implements PurchasingDAO{
	@Inject
	private SqlSession session;
	private static String Namespace = "com.moontech.sms.mapper.purChasingMapper";

	@Override
	public List<PurchasingVO> popUpList() throws Exception {
		return session.selectList(Namespace +".");
	}
}
