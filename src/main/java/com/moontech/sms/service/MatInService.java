package com.moontech.sms.service;

import org.springframework.stereotype.Repository;

/**
 * @file MatInService.java
 * @explain 재료입고
 * @date 2020.02.18
 * @author ACJ-PC0
 */
@Repository
public interface MatInService {

	public int nextValMatInSq() throws Exception;


}
