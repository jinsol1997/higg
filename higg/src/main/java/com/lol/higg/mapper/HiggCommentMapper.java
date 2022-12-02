package com.lol.higg.mapper;

import com.lol.higg.dto.HiggCommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HiggCommentMapper {
    //댓글Mapper

   List<HiggCommentDTO> getList();
}
