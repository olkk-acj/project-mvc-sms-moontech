package com.moontech.sms.controller;

import com.moontech.sms.service.MatInService;
import com.moontech.sms.vo.MatInVO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author AhnChanJin
 * @file MatInController.java
 * @explain 재료입고
 * @date 2020.02.18
 */
@Controller
@RequestMapping("/matIn/*")
public class MatInController {

	private static final Logger logger = LoggerFactory.getLogger(MatInController.class);

	@Inject
	private MatInService service;

// 목록 조회한다. list로 만든다. foreach로 다시 조회한다. list로 만다 보낸다.
	// Move WritePage
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void writeGET(Model model) throws Exception {
		logger.info("Move writePage ========");
		model.addAttribute("inSq", service.nextVal());
		model.addAttribute("list", service.stock());
		System.out.println(service.stock().toString());
		logger.info("End /write");
	}
	//, @RequestParam(value = "inSq") int inSq, @RequestParam(value = "empNo") int empNo, @RequestParam(value = "purSq") int purSq,

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePost(MatInVO vo, @RequestParam(value = "matSqList") List<Integer> matSqList, @RequestParam(value = "stockAmtList") List<Integer> stockAmtList, @RequestParam(value = "inAmtList") List<Integer> inAmtList, RedirectAttributes rttr) throws Exception{
		logger.info("writePost  ========");
		System.out.println("vo for create = " + vo);

		List<MatInVO> list = new ArrayList<MatInVO>();
		for(int j = 0; j < matSqList.size(); j ++){
			MatInVO vo2 = new MatInVO();

			int inAmt = inAmtList.get(j);
			vo2.setMatSq(matSqList.get(j));
			vo2.setStockAmt(stockAmtList.get(j) + inAmt);
			vo2.setInAmt(inAmt);

			list.add(vo2);
		}
			service.write(vo, list);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/matIn/write";
	}
}
