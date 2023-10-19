package com.spring.demo.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.spring.demo.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	public void insertBoard(BoardDTO dto) throws Exception;
}
