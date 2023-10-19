package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dto.BoardDTO;
import com.spring.demo.mapper.BoardMapper;

@Service
public class BoardService {


	private BoardMapper boardMapper;
	

	
	public void insertBoard(BoardDTO dto) throws Exception {
		boardMapper.insertBoard(dto);
	}
}
