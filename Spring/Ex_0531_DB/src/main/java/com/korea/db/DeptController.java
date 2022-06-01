package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import vo.DeptVO;

@Controller
public class DeptController {
	
	DeptDAO dept_dao;
	public DeptController(DeptDAO dept_dao) {
		this.dept_dao = dept_dao;
	}
	final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	@RequestMapping(value = {"/","/list.do"})
	public String list( Model model) {
		
		//dao로부터 부서목록 요청
		List<DeptVO> list = dept_dao.selectList();
		System.out.println("ddd:"+list);
		
		model.addAttribute("list", list);
		return VIEW_PATH + "dept_list.jsp";
		
	}
	
}
