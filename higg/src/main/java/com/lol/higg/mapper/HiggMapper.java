package com.lol.higg.mapper;

import com.lol.higg.dto.HiggCommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HiggMapper {

    //전체 출력
    List<HiggCommentDTO> selectAll();
    // 검색된 게시글에 댓글 들
    List<HiggCommentDTO> selectByOption();


}
