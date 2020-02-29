package com.moontech.sms.persistence;

import com.moontech.sms.vo.PurchasingVO;
import java.util.List;

public interface PurchasingDAO {

	public List<PurchasingVO> popUpList() throws Exception;
}
