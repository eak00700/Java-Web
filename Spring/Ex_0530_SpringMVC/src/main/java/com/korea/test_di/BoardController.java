package com.korea.test_di;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardServiceImpl;

//@ - 어노테이션(프로그래밍 주석)
//컴파일러에게 오버라이딩 메서드임을 빠르게 캐치하고 정보를 제공하기 위한 용도로 사용하거나 
//특수한 기능으로써 클래스가 동작하도록 하는 용도

@Controller
public class BoardController {
	
	BoardServiceImpl service;
	
	public BoardController() {
		System.out.println("BoardController의 생성자!!");
	}
	
	public void setService(BoardServiceImpl service) {
		this.service = service;
	}
	
	@RequestMapping("/list.do")
	public String list( Model model ) {
		//서비스를 통해 dao의 selectList()메서드를 호출할 수 있다.
		List<Object> list = service.selectList();
		
		model.addAttribute("list", list);
		
		return "board_list"; // 포워딩
	}
}
