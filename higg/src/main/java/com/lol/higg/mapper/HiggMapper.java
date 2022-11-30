package com.lol.higg.mapper;

import com.lol.higg.dto.CommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HiggMapper {

    //전체 출력
    List<CommentDTO> selectAll();
    // 검색 출력
    List<CommentDTO> selectByOption();


}
