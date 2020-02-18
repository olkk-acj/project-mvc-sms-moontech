package com.moontech.sms.controller;

import com.moontech.sms.service.MatInService;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


	// Move WritePage
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void writeGET(Model model) throws Exception {
		logger.info("Move writePage ========");

		int inSq = service.nextValMatInSq();



	}
}
	/*
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("empNo") int empNo, @ModelAttribute("cri") Criteria cri, Model model)
			throws Exception {

		logger.info("readPage ...........");
		model.addAttribute(Eservice.read(empNo));
	}
}


	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(EmpVO empVO, Model model) throws Exception {
		logger.info("register get..........");
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("empNo") int empNo, @ModelAttribute("cri") Criteria cri,
			Model model)
			throws Exception {


	}

*/

/*

package gib.pms.controller;
		import javax.inject.Inject;


		import org.springframework.stereotype.Controller;
		import org.springframework.ui.Model;
		import org.springframework.web.bind.annotation.ModelAttribute;
		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RequestMethod;
		import org.springframework.web.bind.annotation.RequestParam;
		import org.springframework.web.servlet.mvc.support.RedirectAttributes;

		import gib.pms.domain.Criteria;
		import gib.pms.domain.EmpVO;
		import gib.pms.domain.MatVO;
		import gib.pms.domain.PageMaker;
		import gib.pms.domain.SearchCriteria;
		import gib.pms.service.EmpService;

@Controller
@RequestMapping("/emp/*")

public class EmpController {



	//등록
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET(EmpVO empVO, Model model) throws Exception {
		logger.info("register get..........");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPost(EmpVO empVO, RedirectAttributes rttr) throws Exception {
		logger.info("regist post .........");

		logger.info(empVO.toString());

		Eservice.regist(empVO);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/emp/list";
	}



	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("empNo") int empNo, @ModelAttribute("cri") Criteria cri, Model model)
			throws Exception {

		logger.info("readPage ...........");
		model.addAttribute(Eservice.read(empNo));
	}

	@RequestMapping(value="/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(@RequestParam("empNo")int empNo,
			@ModelAttribute("cri") Criteria cri,
			Model model) throws Exception{

		model.addAttribute(Eservice.read(empNo));
	}


	@RequestMapping (value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST (EmpVO emp,
			RedirectAttributes rttr)throws Exception{
		Eservice.modify(emp);


		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/emp/listAll";

	}

*/
/*	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("empNo") int empNo,
			RedirectAttributes rttr) throws Exception{
		service.remove(empNo);

		rttr.addFlashAttribute("msg","SUCCESS");

		return "redirect:/emp/listAll";
	}
	*//*



	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("empNo") int empNo,

			RedirectAttributes rttr) throws Exception{
		Eservice.remove(empNo);


		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/emp/listAll";
	}

	//목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {
		logger.info(cri.toString());

		System.out.println("======" + cri.toString());

		model.addAttribute("list", Eservice.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		pageMaker.setTotalCount(Eservice.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);
	}



}
*/
