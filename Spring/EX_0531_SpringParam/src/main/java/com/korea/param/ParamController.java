package com.korea.param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.MyPath;
import vo.PersonVO;

@Controller
public class ParamController {
	
	@RequestMapping(value = {"/","/insert_form.do"})
	public String insert_form() {
		return MyPath.PATH+"insert_form.jsp";
		
	}
	
	@RequestMapping("/insert1.do")
	public String insert1(Model model, String name, int age, String tel) {
		
		//name, age, tel 파라미터 자동으로 넘어온다.
		PersonVO vo = new PersonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		return MyPath.PATH+"insert_result.jsp";
		
		
	}
	
	@RequestMapping("/insert2.do")
	public String insert2(Model model, PersonVO vo) {
		//파라미터로 넘어온 name, age, tel을 vo객체에 자동으로 setting 해줌
		model.addAttribute("vo", vo);
		return MyPath.PATH+"insert_result.jsp";
	}

}
