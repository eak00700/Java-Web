package com.korea.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.MyPath;

@Controller //Controller 어노테이션이 추가되어 있지 않으면 servlet-context.xml에서
//해당 컨트롤러를 생성할 수 없다.
public class TestController {
	
	//앞으로 현재 컨트롤러가 실행할 jsp의 경로를 지정
	public static final String VIEW_PATH="/WEB-INF/views/test/";
		
	
	public TestController() {
		System.out.println("TestController의 생성자");
	}
	
	@RequestMapping("/test.do")
	public String test(Model model, HttpServletRequest request) {
		
		String[] msg = { "사과", "포도", "수박", "딸기", "자몽"};
		String ip = request.getRemoteAddr();
		
		
		model.addAttribute("msg",msg);//바인딩
		
		//ip는 request가 필요함
		model.addAttribute("ip", ip);
		
		return MyPath.MY_PATH + "test/test.jsp";
	}

}
