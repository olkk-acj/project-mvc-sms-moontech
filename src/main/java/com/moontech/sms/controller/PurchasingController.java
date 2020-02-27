package com.moontech.sms.controller;

import com.moontech.sms.service.PurchasingService;
import com.moontech.sms.util.SearchCriteria;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @file PuchasingController.java
 * @explain 구매처 관련 Controller
 * @author ACJ_NOTEBOOK1
 *
 */
@Controller
@RequestMapping("/pur/*")
public class PurchasingController {
	private static final Logger logger = LoggerFactory.getLogger(PurchasingController.class);

	@Inject
	PurchasingService service;

	@RequestMapping(value = "/listPopUp", method = RequestMethod.GET)
	public void popupGET(@ModelAttribute("cri") SearchCriteria cri, Model model) throws  Exception{
		logger.info(cri.toString());

		model.addAttribute("list", service.)

	}





}
