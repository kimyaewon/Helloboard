package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.dto.BoardDTO;
import com.spring.demo.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class BoardController {

	private BoardService boardService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value="memberRegi.do", method = RequestMethod.POST)
	public ModelAndView write(BoardDTO dto, HttpServletRequest request) throws Exception{
		ModelAndView mav = new ModelAndView();
		boardService.insertBoard(dto);
		return mav;
	}
	
//	@RequestMapping(value="memberRegi.do", method = RequestMethod.POST)
//	public ModelAndView write_ok(BoardDTO boardDTO, HttpServletRequest request) throws Exception{
		
//		ModelAndView mav = new ModelAndView();
		
//		boardService.insertBoard(boardDTO);
//		mav.setViewName("redirect:/index");
//		return mav;
	}
