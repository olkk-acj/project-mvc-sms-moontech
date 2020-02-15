package com.moontech.sms.controller;

import com.moontech.sms.service.MatService;
import com.moontech.sms.vo.MatVO;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MatController {

	private static final Logger logger = LoggerFactory.getLogger(MatController.class);
/*

	@Inject
	private MatService service;
*/

	// 등록 페이지
	@RequestMapping(value = "/matWrite", method = RequestMethod.GET)
	public void registerGET(MatVO matVO, Model model) throws Exception {
		logger.info("register get..........");

	}


}
